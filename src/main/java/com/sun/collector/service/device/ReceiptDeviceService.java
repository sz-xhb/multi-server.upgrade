package com.sun.collector.service.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.collector.entity.ReceiptDevice;
import com.sun.collector.mapper.device.ReceiptDeviceDao;

@Service
public class ReceiptDeviceService {

	@Autowired
	private ReceiptDeviceDao receiptDeviceDao;

	public ReceiptDevice findById(String deviceId) {
		return receiptDeviceDao.findById(deviceId).get();
	}

	public void delete(String id) {
		receiptDeviceDao.deleteById(id);
	}

	public List<ReceiptDevice> findAll() {
		return receiptDeviceDao.findAll();
	}

	public ReceiptDevice save(ReceiptDevice circuit) {
		return receiptDeviceDao.save(circuit);
	}

	public ReceiptDevice findByMeterId(String meterId) {
		return receiptDeviceDao.findByMeterId(meterId);
	}


}
