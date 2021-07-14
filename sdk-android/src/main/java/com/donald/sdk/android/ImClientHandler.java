package com.donald.sdk.android;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author donald
 * @date 2021/07/14
 */
public class ImClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 服务端发送过来的消息就是在这里收到的
        String message = (String) msg;
        System.out.println("收到TCP接入系统发送的消息：" + message);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }

}