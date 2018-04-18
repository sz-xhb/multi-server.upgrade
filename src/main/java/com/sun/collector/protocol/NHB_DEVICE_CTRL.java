package com.sun.collector.protocol;

import com.sun.collector.enums.SwitchStatusEnum;

public class NHB_DEVICE_CTRL {

  public static String status;

  public static String getSwitchStatus() {
    return status;
  }

  /**
   * writeBrakeFrame: 远程控制
   * 
   * @author sunlei
   * @param mailAddr
   * @param brakeType
   * @return byte[]
   * @since JDK 1.8
   */
  public static byte[] writeBrakeFrame(Integer mailAddr, String brakeType) {
    int[] data = new int[9];
    data[0] = 0x55;
    data[1] = 0xAA;
    data[2] = mailAddr;
    data[3] = 0x1F;
    data[4] = 0x00;
    data[5] = 0x02;
    data[6] = 0x00;
    if (brakeType.equals(SwitchStatusEnum.ON.getKey())) {
      status = SwitchStatusEnum.ON.getKey();
      // 分闸
      data[7] = 0x00;
    } else if (brakeType.equals(SwitchStatusEnum.OFF.getKey())) {
      status = SwitchStatusEnum.OFF.getKey();
      // 合闸
      data[7] = 0x01;
    }
    data[8] = Verify.csSum(data[2] + data[3] + data[4] + data[5] + data[6] + data[7]);
    byte[] frame = new byte[data.length];
    for (int i = 0; i < data.length; i++) {
      frame[i] = (byte) data[i];
    }
    return frame;
  }

  /**
   * buildRealTimeDataFrame: 读实时数据
   * 
   * @author sunlei
   * @param mailAddr
   * @return byte[]
   * @since JDK 1.8
   */
  public static byte[] buildRealTimeDataFrame(Integer mailAddr) {
    int[] data = new int[7];
    data[0] = 0x55;
    data[1] = 0xAA;
    data[2] = mailAddr;
    data[3] = 0x1B;
    data[4] = 0x00;
    data[5] = 0x00;
    data[6] = Verify.csSum(data[2] + data[3] + data[4] + data[5]);
    byte[] frame = new byte[data.length];
    for (int i = 0; i < data.length; i++) {
      frame[i] = (byte) data[i];
    }
    return frame;
  }
}
