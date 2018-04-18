package com.sun.collector.mapper.data;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sun.collector.entity.DataSwitch;

@Repository
public interface DataSwitchDao extends MongoRepository<DataSwitch, UUID> {

}
