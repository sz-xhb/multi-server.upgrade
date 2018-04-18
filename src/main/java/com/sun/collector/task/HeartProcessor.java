package com.sun.collector.task;

import java.util.concurrent.ConcurrentHashMap;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.sun.collector.attribute.DtuContext;
import com.sun.collector.init.DtuContextMap;

@Component
public class HeartProcessor {

  DtuContext dtuContext;

  byte[] heartFrame = {0x55, (byte) 0xAA, 0x00, 0x5A, 0x00, 0x00, 0x5A};

  @Scheduled(cron = "0 */3 * * * ?")
  public void heartBeat() {
    ConcurrentHashMap<String, DtuContext> channels = DtuContextMap.getInstance();
    if (channels == null) {
      return;
    }
    for (String deviceNo : channels.keySet()) {
      dtuContext = channels.get(deviceNo);
      dtuContext.getDeviceCHC().writeAndFlush(heartFrame);
    }
  }

}
