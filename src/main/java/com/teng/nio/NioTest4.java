package com.teng.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest4 {
	public static void main(String[] args) throws Exception{
		FileInputStream inputStream = new FileInputStream("input.txt");
		FileOutputStream outputStream = new FileOutputStream("output.txt");

		FileChannel inputChannel = inputStream.getChannel();
		FileChannel outputChannel = outputStream.getChannel();

		ByteBuffer buffer = ByteBuffer.allocate(1024);
		while (true){
			buffer.clear(); // 如果这行代码注释掉代码会变成什么样子
			// 内容会不断地向文件里写
			int read = inputChannel.read(buffer);
			System.out.println("read: " + read);
			if (-1 == read) {
				break;
			}
			buffer.flip();
			outputChannel.write(buffer);
		}
		inputChannel.close();
		outputChannel.close();
	}
}
