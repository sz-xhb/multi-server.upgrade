package com.sun.collector.base;

public interface Device {

	void processReadingFrame(byte[] readingFrame);

	byte[] getWritingFrame();

}
