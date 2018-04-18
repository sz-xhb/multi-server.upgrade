package com.sun.collector.service.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.collector.entity.RealtimeData;
import com.sun.collector.mapper.data.RealtimeDataDao;

@Service
public class RealtimeDataService {

	@Autowired
	private RealtimeDataDao realtimeDataDao;

	public RealtimeData save(RealtimeData realtimeData) {
		return realtimeDataDao.save(realtimeData);
	}

}
