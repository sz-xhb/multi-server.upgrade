package com.sun.collector.protocol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.nhb.utils.nhb_utils.context.SpringContextHolder;
import com.sun.collector.base.AbstractDevice;
import com.sun.collector.entity.AlarmInfo;
import com.sun.collector.entity.DataElectricity;
import com.sun.collector.entity.HistoryData;
import com.sun.collector.entity.RealtimeData;
import com.sun.collector.entity.ReceiptCollector;
import com.sun.collector.entity.ReceiptDevice;
import com.sun.collector.entity.ReceiptMeter;
import com.sun.collector.enums.AlarmTypeEnum;
import com.sun.collector.enums.DataTypeEnum;
import com.sun.collector.feign.RemoteRtnService;
import com.sun.collector.service.data.AlarmInfoService;
import com.sun.collector.service.data.HistoryDataService;
import com.sun.collector.service.data.RealtimeDataService;
import com.sun.collector.service.device.ReceiptDeviceService;

public class NHB_DEVICE extends AbstractDevice {
	private static final Logger logger = LoggerFactory.getLogger(NHB_DEVICE.class);

	private double hVolt;
	private double lVolt;
	private double voltageA;
	private double voltageB;
	private double voltageC;
	private double currentA;
	private double currentB;
	private double currentC;
	private double frequency;
	private String time;

	private double kw;
	private double kwA;
	private double kwB;
	private double kwC;
	private double kvar;
	private double kvarA;
	private double kvarB;
	private double kvarC;
	private double powerFactor;
	private double kwh;
	private double kwhA;
	private double kwhB;
	private double kwhC;
	private double Ibb;

	private String dataType;

	private boolean result;

	List<String> alarms;

	private List<AlarmInfo> alarmInfos;

	private AlarmInfo alarmInfo;

	public NHB_DEVICE(ReceiptCollector receiptCollector, ReceiptMeter receiptMeter, ReceiptDevice receiptDevice) {
		this.receiptCollector = receiptCollector;
		this.receiptMeter = receiptMeter;
		this.receiptDevice = receiptDevice;
		buildWritingFrames();
	}

	@Override
	public void buildWritingFrames() {
		int[] data = new int[7];
		data[0] = 0x55;
		data[1] = 0xAA;
		data[2] = Integer.parseInt(receiptMeter.getMeterNo());
		data[3] = 0x1B;
		data[4] = 0x00;
		data[5] = 0x00;
		data[6] = Verify.csSum(data[2] + data[3] + data[4] + data[5]);
		byte[] frame = new byte[data.length];
		for (int i = 0; i < data.length; i++) {
			frame[i] = (byte) data[i];
		}
		writingFrames = frame;
	}

	@Override
	public boolean analyzeFrame(byte[] frame) {
		int[] data = new int[frame.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = frame[i] & 0xFF;
		}
		if (data[3] == 0x1B) {
			dataType = DataTypeEnum.DATA.toString();
			time = "20";
			for (int i = 6; i < 12; i++) {
				if (data[i] < 0x10)
					time += "0" + Integer.toHexString(data[i]);
				else
					time += Integer.toHexString(data[i]);
			}
			hVolt = ((data[12] << 8) + data[13]) / 10.0;
			lVolt = ((data[14] << 8) + data[15]) / 10.0;
			Ibb = ((data[16] << 8) + data[17]);
			frequency = ((data[18] << 8) + data[19]) / 100.0;
			voltageA = ((data[20] << 8) + data[21]) / 10.0;
			voltageB = ((data[22] << 8) + data[23]) / 10.0;
			voltageC = ((data[24] << 8) + data[25]) / 10.0;
			currentA = ((data[26] << 8) + data[27]) / 100.0;
			currentB = ((data[28] << 8) + data[29]) / 100.0;
			currentC = ((data[30] << 8) + data[31]) / 100.0;

			kw = (((data[32] << 8) + data[33]) & 0x7FFF) * (data[32] > 0x80 ? -1 : 1) / 100.0;
			kwA = (((data[34] << 8) + data[35]) & 0x7FFF) * (data[34] > 0x80 ? -1 : 1) / 100.0;
			kwB = (((data[36] << 8) + data[37]) & 0x7FFF) * (data[36] > 0x80 ? -1 : 1) / 100.0;
			kwC = (((data[38] << 8) + data[39]) & 0x7FFF) * (data[38] > 0x80 ? -1 : 1) / 100.0;
			kvar = (((data[40] << 8) + data[41]) & 0x7FFF) * (data[40] > 0x80 ? -1 : 1) / 100.0;
			kvarA = (((data[42] << 8) + data[43]) & 0x7FFF) * (data[42] > 0x80 ? -1 : 1) / 100.0;
			kvarB = (((data[44] << 8) + data[45]) & 0x7FFF) * (data[44] > 0x80 ? -1 : 1) / 100.0;
			kvarC = (((data[46] << 8) + data[47]) & 0x7FFF) * (data[46] > 0x80 ? -1 : 1) / 100.0;

			powerFactor = ((data[48] << 8) + data[49]) / 100.0;
			kwh = ((data[50] << 24) + (data[51] << 16) + (data[52] << 8) + data[53]) / 100.0;
			kwhA = ((data[54] << 24) + (data[55] << 16) + (data[56] << 8) + data[57]) / 100.0;
			kwhB = ((data[58] << 24) + (data[59] << 16) + (data[60] << 8) + data[61]) / 100.0;
			kwhC = ((data[62] << 24) + (data[63] << 16) + (data[64] << 8) + data[65]) / 100.0;

			result = true;
		} else if (data[3] == 0x1C) {
			dataType = DataTypeEnum.ALARM.toString();
			alarms = Lists.newArrayList();
			if (data[6] > 0x00) {
				if ((data[6] & 0x01) == 0) {
					alarms.add(AlarmTypeEnum.OVERVOLTAGE_A.getKey());
				}
				if ((data[6] & 0x02) == 0) {
					alarms.add(AlarmTypeEnum.OVERVOLTAGE_B.getKey());
				}
				if ((data[6] & 0x04) == 0) {
					alarms.add(AlarmTypeEnum.OVERVOLTAGE_C.getKey());
				}
				if ((data[6] & 0x08) == 0) {
					alarms.add(AlarmTypeEnum.UNDERVOLTAGE_A.getKey());
				}
				if ((data[6] & 0x10) == 0) {
					alarms.add(AlarmTypeEnum.UNDERVOLTAGE_B.getKey());
				}
				if ((data[6] & 0x20) == 0) {
					alarms.add(AlarmTypeEnum.UNDERVOLTAGE_C.getKey());
				}
				if ((data[6] & 0x40) == 0) {
					alarms.add(AlarmTypeEnum.SHORTCIRCUIT_A.getKey());
				}
				if ((data[6] & 0x80) == 0) {
					alarms.add(AlarmTypeEnum.SHORTCIRCUIT_B.getKey());
				}
			}
			if (data[7] > 0x00) {
				if ((data[7] & 0x01) == 0) {
					alarms.add(AlarmTypeEnum.SHORTCIRCUIT_C.getKey());
				}
				if ((data[7] & 0x02) == 0) {
					alarms.add(AlarmTypeEnum.OVERCURRENT_A.getKey());
				}
				if ((data[7] & 0x04) == 0) {
					alarms.add(AlarmTypeEnum.OVERCURRENT_B.getKey());
				}
				if ((data[7] & 0x08) == 0) {
					alarms.add(AlarmTypeEnum.OVERCURRENT_C.getKey());
				}
				if ((data[7] & 0x10) == 0) {
					alarms.add(AlarmTypeEnum.PHASELOSS_A.getKey());
				}
				if ((data[7] & 0x20) == 0) {
					alarms.add(AlarmTypeEnum.PHASELOSS_B.getKey());
				}
				if ((data[7] & 0x40) == 0) {
					alarms.add(AlarmTypeEnum.PHASELOSS_C.getKey());
				}
			}

		} else if ((data[3] & 0x7F) == 0x1F) {
			dataType = DataTypeEnum.BRAKE.toString();
			if (data[3] == 0x1F) {
				result = true;
			} else {
				result = false;
			}
		}

		return result;
	}

	@Override
	public void handleResult() {
		if (dataType.equals(DataTypeEnum.DATA.toString())) {

			DataElectricity de = new DataElectricity();
			Date date = null;
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
				date = sdf.parse(time);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			de.setMeterTime(DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss"));
			de.setFrequency(frequency);
			de.setIbb(Ibb);
			de.sethVolt(hVolt);
			de.setlVolt(lVolt);
			de.setaVolt(voltageA);
			de.setbVolt(voltageB);
			de.setcVolt(voltageC);
			de.setaCurrent(currentA);
			de.setbCurrent(currentB);
			de.setcCurrent(currentC);
			de.setKw(kw);
			de.setaKw(kwA);
			de.setbKw(kwB);
			de.setcKw(kwC);
			de.setKvar(kvar);
			de.setaKvar(kvarA);
			de.setbKvar(kvarB);
			de.setcKvar(kvarC);
			de.setPowerFactor(powerFactor);
			de.setKwh(kwh);
			de.setaKwh(kwhA);
			de.setbKwh(kwhB);
			de.setcKwh(kwhC);

			HistoryData historyData = new HistoryData();
			historyData.setDeviceId(receiptDevice.getId());
			historyData.setServiceId(receiptDevice.getModel());
			historyData.setMeterTime(date);
			historyData.setData(de);
			getHistoryDataService().save(historyData);

			logger.warn("历史数据保存成功！");

			RealtimeData realtimeData = new RealtimeData();
			realtimeData.setDeviceId(receiptDevice.getId());
			realtimeData.setMeterTime(date);
			realtimeData.setServiceId(receiptDevice.getModel());
			realtimeData.setData(de);
			getRealtimeDataService().save(realtimeData);

			logger.warn("实时数据保存成功！");

			// 返回消息 关阀成功
			Map<String, Object> params = Maps.newHashMap();
			params.put("deviceId", receiptDevice.getId());
			params.put("deviceName", receiptDevice.getName());
			params.put("result", result);
			params.put("type", "RealtimeData");
			getRemoteRtnService().remoteRtn(params);
			logger.warn("实时数据读取结果推送成功！");

		} else if (dataType.equals(DataTypeEnum.ALARM.toString())) {
			alarmInfos = Lists.newArrayList();
			Date nowTime = new Date();
			for (String alarmType : alarms) {
				alarmInfo = new AlarmInfo();
				alarmInfo.setDeviceId(receiptDevice.getId());
				alarmInfo.setAlarmType(alarmType);
				alarmInfo.setReadTime(nowTime);
				alarmInfo.setDealStatus(0);
				alarmInfos.add(alarmInfo);
				
			}
			getAlarmInfoService().sveAll(alarmInfos);
			logger.warn("告警信息保存成功！");

		} else if (dataType.equals(DataTypeEnum.BRAKE.toString())) {

			String status = NHB_DEVICE_CTRL.getSwitchStatus();

			ReceiptDevice device = getReceiptDeviceService().findById(receiptDevice.getId());
			device.setSwitchStatus(status);
			getReceiptDeviceService().save(device);

			// 返回消息 关阀成功
			Map<String, Object> params = Maps.newHashMap();
			params.put("deviceId", receiptDevice.getId());
			params.put("deviceName", receiptDevice.getName());
			params.put("result", result);
			params.put("type", status);
			getRemoteRtnService().remoteRtn(params);
			logger.warn("远程控制操作结果推送成功！");
		}

	}

	private RealtimeDataService getRealtimeDataService() {
		return SpringContextHolder.getBean(RealtimeDataService.class);
	}

	private HistoryDataService getHistoryDataService() {
		return SpringContextHolder.getBean(HistoryDataService.class);
	}

	private RemoteRtnService getRemoteRtnService() {
		return SpringContextHolder.getBean(RemoteRtnService.class);
	}

	private ReceiptDeviceService getReceiptDeviceService() {
		return SpringContextHolder.getBean(ReceiptDeviceService.class);
	}

	private AlarmInfoService getAlarmInfoService() {
		return SpringContextHolder.getBean(AlarmInfoService.class);
	}

}
