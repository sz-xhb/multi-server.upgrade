package com.sun.collector.mapper.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sun.collector.entity.RealtimeData;

@Repository
public interface RealtimeDataDao extends MongoRepository<RealtimeData, String> {

}
