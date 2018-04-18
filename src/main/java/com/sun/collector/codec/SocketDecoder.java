package com.sun.collector.codec;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.collector.utils.FrameUtils;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class SocketDecoder extends ByteToMessageDecoder {

	private static final Logger logger = LoggerFactory.getLogger(SocketDecoder.class);

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		byte[] orignalBytes = new byte[in.readableBytes()];
		in.getBytes(in.readerIndex(), orignalBytes);
		logger.warn("Decoder收到数据：" + FrameUtils.toString(orignalBytes));
		if (in.readableBytes() <= 0) {
			return;
		}
		// 如果 不是以 0xBA 0xBA 结尾的格式，则需要粘包处理
		if (in.readableBytes() >= 1 && in.getByte(in.readerIndex()) == (byte) 0xAB
				&& in.getByte(in.writerIndex() - 1) != (byte) 0xBA && in.getByte(in.writerIndex() - 2) != (byte) 0xBA) {
			return;
		}

		if (in.readableBytes() >= 18 && in.getByte(in.readerIndex()) == (byte) 0x68
				&& in.getByte(in.readerIndex() + 1) == (byte) 0x68 && in.getByte(in.readerIndex() + 2) == (byte) 0x16
				&& in.getByte(in.readerIndex() + 3) == (byte) 0x16) {
			int readindex = in.readerIndex();
			while (readindex + 3 < in.writerIndex()) {
				if (in.getByte(readindex) == (byte) 0x55 && in.getByte(readindex + 1) == (byte) 0xAA
						&& in.getByte(readindex + 2) == (byte) 0x55 && in.getByte(readindex + 3) == (byte) 0xAA) {
					break;
				}
				readindex++;
			}
			if (readindex + 3 >= in.writerIndex()) {
				return;
			}
			byte[] bytes = new byte[readindex + 4 - in.readerIndex()];
			in.readBytes(bytes, 0, bytes.length);
			out.add(bytes);
			return;
		}
		if (in.readableBytes() >= 3 && in.getByte(in.readerIndex()) == (byte) 0xAA
				&& in.getByte(in.readerIndex() + 1) == (byte) 0x18 && in.getByte(in.readerIndex() + 2) == (byte) 0x05
				&& in.getByte(in.writerIndex() - 1) != (byte) 0x55) {
			return;
		}
		if (in.readableBytes() >= 3 && in.getByte(in.readerIndex()) == (byte) 0xAA
				&& in.getByte(in.readerIndex() + 1) == (byte) 0x55 && in.getByte(in.readerIndex() + 2) == (byte) 0xAA
				&& in.getByte(in.readerIndex() + 3) == (byte) 0x55
				&& (in.getByte(in.writerIndex() - 4) != (byte) 0x68 || in.getByte(in.writerIndex() - 3) != (byte) 0x68
						|| in.getByte(in.writerIndex() - 2) != (byte) 0x16 || in
								.getByte(in.writerIndex() - 1) != (byte) 0x16)) {
			return;
		}
		if (in.readableBytes() >= 5 && in.getByte(in.readerIndex()) == (byte) 0x55
				&& in.getByte(in.readerIndex() + 1) == (byte) 0xAA) {
			int packetLength = (in.getByte(in.readerIndex() + 3) & 0xff) * 256
					+ (in.getByte(in.readerIndex() + 4) & 0xff);
			if (packetLength + 5 > in.readableBytes()) {
				return;
			}
			byte[] bytes = new byte[packetLength + 5];
			in.readBytes(bytes, 0, bytes.length);
			out.add(bytes);
			return;

		}

		byte[] bytes = new byte[in.readableBytes()];

		in.readBytes(bytes, 0, bytes.length);
		out.add(bytes);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		logger.error("unexpected exception", cause);
		//ctx.close();
	}
}
