package com.donald.gateway.tcp.dispatcher;

import com.donlad.common.Constants;
import com.donlad.common.Request;
import io.netty.channel.socket.SocketChannel;

/**
 * 分发系统实例
 *
 * @author donald
 * @date 2021/07/17
 */
public class DispatcherInstance {

    private SocketChannel socketChannel;

    public DispatcherInstance(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }

    /**
     * 向分发系统发送认证请求
     * @param authenticateRequest
     * @return
     */
    public void authenticate(AuthenticateRequestProto.AuthenticateRequest authenticateRequest) {
        Request request = new Request(
                Constants.APP_SDK_VERSION_1,
                Constants.REQUEST_TYPE_AUTHENTICATE,
                Constants.SEQUENCE_DEFAULT,
                authenticateRequest.toByteArray());
        socketChannel.writeAndFlush(request.getBuffer());
    }

    public SocketChannel getSocketChannel() {
        return socketChannel;
    }

    public void setSocketChannel(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }
}
