package com.teng.nio;

import java.nio.ByteBuffer;

public class NioTest5 {
	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(64);
		buffer.putInt(15);
		buffer.putLong(5000000000L);
		buffer.putDouble(14.123456);
		buffer.putChar('你');
		buffer.putShort((short)2);
		System.out.println(buffer.getInt());
		System.out.println(buffer.getLong());
		System.out.println(buffer.getDouble());
		System.out.println(buffer.getChar());
		System.out.println(buffer.getShort());
	}
}
