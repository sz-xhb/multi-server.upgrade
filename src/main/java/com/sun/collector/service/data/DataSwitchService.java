package com.sun.collector.service.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.collector.entity.DataSwitch;
import com.sun.collector.mapper.data.DataSwitchDao;

@Service
public class DataSwitchService {

	@Autowired
	private DataSwitchDao dataSwitchDao;

	public DataSwitch save(DataSwitch dataSwitch) {
		return dataSwitchDao.save(dataSwitch);
	}

}
