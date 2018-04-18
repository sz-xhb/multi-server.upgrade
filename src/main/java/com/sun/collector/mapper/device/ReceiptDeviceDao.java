package com.sun.collector.mapper.device;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sun.collector.entity.ReceiptDevice;

public interface ReceiptDeviceDao extends MongoRepository<ReceiptDevice, String> {

	ReceiptDevice findByMeterId(String meterId);

}
