package com.sun.collector.handler;

import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.nhb.utils.nhb_utils.common.StringUtil;
import com.sun.collector.attribute.DtuContext;
import com.sun.collector.controller.DtuController;
import com.sun.collector.controller.RemoteCtrl;
import com.sun.collector.task.DataProcessor;
import com.sun.collector.utils.FrameUtils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.AttributeKey;

/**
 * @ClassName: DtuServerHandler
 * @Function: Handler处理类
 * @date: May 23, 2017 3:36:12 PM
 * @author sunlei
 * @version
 * @since JDK 1.8
 */
public class DtuServerHandler extends SimpleChannelInboundHandler<byte[]> {
	private static final Logger logger = LoggerFactory.getLogger(DtuServerHandler.class);
	/**
	 * 通道上下文信息
	 */
	private AttributeKey<DtuContext> attrDtuContext;

	/**
	 * DTU业务控制
	 */
	@Autowired
	private DtuController dtuController;

	/**
	 * 心跳周期
	 */
	// private int heartbeat = ConfigBean.getHeartbeat();

	/**
	 * 任务开始前延时时间
	 */
	// private long scheduleDelay = ConfigBean.getDelay();

	DataProcessor dataProcessor;

	RemoteCtrl remoteCtrl;

	/**
	 * 客户端连接后触发
	 * 
	 * @see io.netty.channel.ChannelInboundHandlerAdapter#channelActive(io.netty.channel.ChannelHandlerContext)
	 */
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		logger.warn("channelActive被触发，已经有设备连接上采集软件");
		// 生成 唯一dtu 上下文 key
		attrDtuContext = AttributeKey.valueOf(String.valueOf(UUID.randomUUID()));
		// dtu 业务处理
		dtuController = new DtuController(attrDtuContext);
		// dataProcessor = new DataProcessor(ctx, attrDtuContext);

		// 延时3秒后启动读取注册帧
		Thread.sleep(1000 * 3);
		// 读取注册帧
		ctx.writeAndFlush(new byte[] { 0x55, (byte) 0xAA, 0x00, 0x5B, 0x00, 0x00, 0x5B });

		/**
		 * DTU定时采集任务
		 */
		// ctx.executor().scheduleAtFixedRate(dataProcessor, scheduleDelay,
		// heartbeat, TimeUnit.SECONDS);
	};

	/**
	 * channelInactive: 客户端断开连接后触发
	 * 
	 * @see io.netty.channel.ChannelInboundHandlerAdapter#channelInactive(io.netty.channel.ChannelHandlerContext)
	 */
	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		if (StringUtil.isNullOrEmpty(ctx.channel().attr(attrDtuContext).get().getDeviceNo())) {
			logger.warn("设备注册失败！");
		} else {
			logger.warn(ctx.channel().attr(attrDtuContext).get().getDeviceNo() + " : 编号设备主动断开连接!");
		}
		// ctx.executor().shutdownGracefully();
		// ctx.close();
	}

	/**
	 * channelRead0: Decoder发送数据后触发
	 * 
	 * @see io.netty.channel.SimpleChannelInboundHandler#channelRead0(io.netty.channel.ChannelHandlerContext,
	 *      java.lang.Object)
	 */
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, byte[] msg) throws Exception {
		logger.warn("channelRead0服务器接收到数据：" + FrameUtils.toString(msg));
		if ((msg[0] == (byte) 0xAB) && (msg[1] == (byte) 0xAB) && (msg[msg.length - 2] == (byte) 0xBA)
				&& (msg[msg.length - 1] == (byte) 0xBA) && (msg[13] == (byte) 0x5B)) {
			// 注册
			dtuController.saveRegisterInfo(ctx, msg);
		} else if ((msg[0] == (byte) 0xAB) && (msg[1] == (byte) 0xAB) && (msg[msg.length - 2] == (byte) 0xBA)
				&& (msg[msg.length - 1] == (byte) 0xBA) && (msg[13] == (byte) 0x5A)) {
			// 心跳
			dtuController.heartbeat(ctx, msg);
//		} else if ((msg[0] == (byte) 0xAB) && (msg[1] == (byte) 0xAB) && (msg[msg.length - 2] == (byte) 0xBA)
//				&& (msg[msg.length - 1] == (byte) 0xBA) && (msg[13] == (byte) 0x1C)) {
//			dtuController.readAlarm(ctx, msg);
		} else {
			// 读取数据
			dtuController.readDevice(ctx, msg);
		}
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		logger.info(ctx.channel().attr(attrDtuContext).get().getDeviceNo() + "：未知异常！", cause.getMessage());
	}
}
