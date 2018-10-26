package com.teng.nio;

import java.nio.IntBuffer;
import java.security.SecureRandom;

public class NioTest1 {
	public static void main(String[] args) {
		IntBuffer buffer = IntBuffer.allocate(10);
		// 将数据写入intBuffer
		for (int i = 0; i < buffer.capacity(); i++) {
			int randomNumber = new SecureRandom().nextInt(20);
			buffer.put(randomNumber);
		}
		// 转换读写必须调用
		buffer.flip();
		while (buffer.hasRemaining()){
			System.out.println(buffer.get());
		}
	}
}
