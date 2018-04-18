package com.sun.collector.service.device;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.collector.entity.ReceiptMeter;
import com.sun.collector.mapper.device.ReceiptMeterDao;

/**
 * 
 * @ClassName: ReceiptMeterService
 * @Description:
 * @author XS guo
 * @date 2017年6月30日 上午11:21:39
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Service
public class ReceiptMeterService {

	@Autowired
	private ReceiptMeterDao receiptMeterDao;

	public ReceiptMeter findMetersByCollectorId(String collectorId) {
		return receiptMeterDao.findByCollectorId(collectorId);
	}

	public ReceiptMeter findMeterByCollIdAndMeterNo(Long collectorId, String meterNo) {
		return receiptMeterDao.findByCollectorIdAndMeterNo(collectorId, meterNo);
	}

	public ReceiptMeter findById(String meterId) {
		if (receiptMeterDao.findById(meterId).equals(Optional.empty())) {
			return null;
		}
		return receiptMeterDao.findById(meterId).get();
	}

	public ReceiptMeter save(ReceiptMeter meter) {
		return receiptMeterDao.save(meter);
	}

	public void delete(String id) {
		receiptMeterDao.deleteById(id);
	}

	public List<ReceiptMeter> findAll() {
		return (List<ReceiptMeter>) receiptMeterDao.findAll();
	}

	public List<ReceiptMeter> findMetersByType(String proType) {
		return receiptMeterDao.findByMeterType(proType);
	}

}
