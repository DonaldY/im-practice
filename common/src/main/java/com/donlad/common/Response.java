package com.donlad.common;

import io.netty.buffer.ByteBuf;

/**
 * @author donald
 * @date 2021/07/17
 */
public class Response extends Message {

    public Response(Request request, byte[] body) {
        super(request.getAppSdkVersion(),
                Constants.MESSAGE_TYPE_RESPONSE,
                request.getRequestType(),
                request.getSequence(),
                body);
    }

    public Response(Response response, byte[] body) {
        super(response.getAppSdkVersion(),
                Constants.MESSAGE_TYPE_RESPONSE,
                response.getRequestType(),
                response.getSequence(),
                body);
    }

    public Response(ByteBuf buffer) {
        super(buffer);
    }

    public Response(int headerLength, int appSdkVersion, int messageType, int requestType, int sequence, int bodyLength, byte[] body, ByteBuf buffer) {
        super(headerLength, appSdkVersion, messageType, requestType, sequence, bodyLength, body, buffer);
    }
}
