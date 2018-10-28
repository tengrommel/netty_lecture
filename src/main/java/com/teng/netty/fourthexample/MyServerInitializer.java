package com.teng.netty.fourthexample;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;
import java.util.concurrent.TimeUnit;

public class MyServerInitializer extends ChannelInitializer<SocketChannel> {
	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		// 空闲状态检测处理器
		// 主要用于心跳检测
		pipeline.addLast(new IdleStateHandler(5, 7, 3, TimeUnit.SECONDS));
		pipeline.addLast(new MyServerHandler());
	}
}
