package com.sun.collector.rest;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nhb.utils.nhb_utils.common.RestResultDto;
import com.sun.collector.command.CommandRequest;
import com.sun.collector.controller.RemoteCtrl;

/**
 * 
 * @ClassName: RemoteCtrlApi
 * @Description: 远程控制Api
 * @author XS guo
 * @date 2017年8月8日 下午7:10:40
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
@RequestMapping("remote/ctrl")
public class RemoteCtrlApi {

  private static final Logger logger = LoggerFactory.getLogger(RemoteCtrlApi.class);

  @Autowired
  private RemoteCtrl remoteCtrl;

  CommandRequest request;

  /**
   * @Title: turnswitch
   * @Description: 开关命令
   * @return RestResultDto
   */
  @SuppressWarnings({"rawtypes", "unchecked"})
  @RequestMapping(value = "turnswitch", method = {RequestMethod.POST})
  public RestResultDto turnswitch(@RequestBody Map<String, Object> param) {
    String deviceId = String.valueOf(param.get("deviceId"));
    String type = String.valueOf(param.get("type"));
    RestResultDto resultDto = new RestResultDto();
    Integer result = RestResultDto.RESULT_SUCC;
    String msg = null;
    Object data = null;
    String exception = null;
    try {
      logger.warn("开始执行远程控制");
      request = new CommandRequest();
      request.setDeviceId(deviceId);
      request.setType(type);
      remoteCtrl.addCmdCommand(request);
      msg = "远程控制命令已下发！";
      data = true;
    } catch (Exception e) {
      result = RestResultDto.RESULT_FAIL;
      exception = e.getMessage();
      data = false;
      msg = "远程控制命令下发失败！";
    } finally {
      logger.warn(msg);
      resultDto.setData(data);
      resultDto.setException(exception);
      resultDto.setMsg(msg);
      resultDto.setResult(result);
    }
    return resultDto;
  }

  @PostMapping(value = "getRealtimeData")
  public RestResultDto<Object> realTimeData(@RequestBody Map<String, Object> param) {
    String deviceId = String.valueOf(param.get("deviceId"));
    RestResultDto<Object> resultDto = new RestResultDto<Object>();
    Integer result = RestResultDto.RESULT_SUCC;
    String msg = null;
    Object data = null;
    String exception = null;
    try {
      logger.warn("开始实时数据......");
      request = new CommandRequest();
      request.setDeviceId(deviceId);
      remoteCtrl.getRealTimeData(request);
      msg = "读实时数据命令已下发！";
      data = true;
    } catch (Exception e) {
      result = RestResultDto.RESULT_FAIL;
      exception = e.getMessage();
      data = false;
      msg = "读实时数据命令下发失败！";
    } finally {
      logger.warn(msg);
      resultDto.setData(data);
      resultDto.setException(exception);
      resultDto.setMsg(msg);
      resultDto.setResult(result);
    }
    return resultDto;
  }

}
