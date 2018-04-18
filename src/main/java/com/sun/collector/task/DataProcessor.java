package com.sun.collector.task;

import com.sun.collector.attribute.DtuContext;
import com.sun.collector.base.Device;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @ClassName: DataProcessor
 * @Function: DTU定时采集任务
 * @date: May 27, 2017 10:31:05 AM
 * 
 * @author sunlei
 * @version
 * @since JDK 1.8
 */
public class DataProcessor implements Runnable {

  private ChannelHandlerContext ctx;

  private AttributeKey<DtuContext> attrDtuContext;

  public DataProcessor(ChannelHandlerContext ctx, AttributeKey<DtuContext> attrDtuContext) {
    this.ctx = ctx;
    this.attrDtuContext = attrDtuContext;
  }

  public DataProcessor(ChannelHandlerContext ctx) {
    this.ctx = ctx;
  }

  DtuContext dtuContext;

  @Override
  public void run() {

    // 获取当前dtu的信息
    dtuContext = ctx.channel().attr(attrDtuContext).get();
    // 当前dtu context信息
    ChannelHandlerContext dtuCHC = dtuContext.getDeviceCHC();
    if (dtuCHC == null || !dtuCHC.channel().isActive()) {
      return;
    }
    writeDevice(dtuContext);

  }

  /**
   * write one frame every time
   * 
   * @param dtuContext
   */
  private void writeDevice(DtuContext dtuContext) {
    Device device = dtuContext.getCurrentDevice();
    if (null == device) {
      return;
    }
    byte[] frame = device.getWritingFrame();
    if (frame == null) {
      return;
    }
    // 下发指令
    ctx.writeAndFlush(frame);
  }
}
