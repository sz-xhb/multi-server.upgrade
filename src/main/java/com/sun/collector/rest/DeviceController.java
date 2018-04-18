package com.sun.collector.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nhb.utils.nhb_utils.common.RestResultDto;
import com.sun.collector.entity.ReceiptDevice;
import com.sun.collector.service.device.ReceiptDeviceService;

@Controller
@RequestMapping("device")
public class DeviceController {

	@Autowired
	private ReceiptDeviceService receiptDeviceService;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public RestResultDto save(@RequestBody ReceiptDevice receiptDevice) {
		RestResultDto resultDto = new RestResultDto();
		Integer result = RestResultDto.RESULT_SUCC;
		String msg = null;
		Object data = null;
		String exception = null;

		try {
			receiptDeviceService.save(receiptDevice);
			msg = "circuit保存成功！";
			data = true;
		} catch (Exception e) {
			result = RestResultDto.RESULT_FAIL;
			exception = e.getMessage();
			msg = "circuit保存失败";
			data = false;
		} finally {
			resultDto.setData(data);
			resultDto.setException(exception);
			resultDto.setMsg(msg);
			resultDto.setResult(result);
		}
		return resultDto;
	}
}
