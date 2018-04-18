package com.sun.collector.feign;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "nhb-iot-platform")
public interface RemoteRtnService {

	@RequestMapping(value = "/api/v1/remote/push", method = RequestMethod.POST)
	void remoteRtn(@RequestBody Map<String, Object> params);

}
