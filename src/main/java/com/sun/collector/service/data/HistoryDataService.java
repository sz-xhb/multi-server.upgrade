package com.sun.collector.service.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.collector.entity.HistoryData;
import com.sun.collector.mapper.data.HistoryDataDao;

@Service
public class HistoryDataService {

	@Autowired
	private HistoryDataDao historyDataDao;

	public HistoryData save(HistoryData historyData) {
		return historyDataDao.save(historyData);
	}

}
