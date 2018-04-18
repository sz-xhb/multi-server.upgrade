package com.sun.collector.protocol;

public class Verify {

	/**
	 * 
	 * @Title: lchlSum @Description: LCHLSUM 校验 @return int[] @throws
	 */
	public static int[] lchlSum(int num) {
		int[] data = new int[4];
		int num1 = num % 16;
		int num2 = num / 16 % 16;
		int num3 = num / 16 / 16 % 16;
		int lchksun = ((~(num1 + num2 + num3) < 0 ? ~(num1 + num2 + num3) + 16 : ~(num1 + num2 + num3)) & 0xFFFF) + 1;
		int length = lchksun * 16 * 16 * 16 + num % (16 * 16 * 16);
		String hex = Integer.toHexString(length).toUpperCase();
		char[] values = hex.toCharArray();
		data[3] = (byte) values[values.length - 1];
		data[2] = (byte) values[values.length - 2];
		data[1] = (byte) values[values.length - 3];
		data[0] = (byte) values[values.length - 4];
		return data;
	}

	/**
	 * 
	 * @Title: chkSum @Description: CHKSUM 校验和码 @return int[] @throws
	 */
	public static int[] chkSum(int num) {
		int[] data = new int[4];
		int check = ((~(num % 65536)) & 0xFFFF) + 1;
		String hex = Integer.toHexString(check).toUpperCase();
		char[] values = hex.toCharArray();
		data[3] = (byte) values[values.length - 1];
		data[2] = (byte) values[values.length - 2];
		data[1] = (byte) values[values.length - 3];
		data[0] = (byte) values[values.length - 4];
		return data;
	}

	public static int csSum(int num) {
		int remainder = (num % 256) & 0xFF;
		return remainder;
	}
}
