package com.sun.collector.service.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.collector.entity.AlarmInfo;
import com.sun.collector.mapper.data.AlarmInfoDao;

@Service
public class AlarmInfoService {

	@Autowired
	private AlarmInfoDao alarmInfoDao;

	public AlarmInfo save(AlarmInfo alarmInfo) {
		return alarmInfoDao.save(alarmInfo);
	}

	public List<AlarmInfo> sveAll(List<AlarmInfo> list) {
		return alarmInfoDao.saveAll(list);
	}

}
