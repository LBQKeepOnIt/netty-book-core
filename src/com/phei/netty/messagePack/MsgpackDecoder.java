package com.phei.netty.messagePack;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.msgpack.MessagePack;

import java.util.List;

/**
 * @Description:
 * @Author: liboqing
 * @CreateDate: 2019/8/28 16:33
 */
public class MsgpackDecoder extends MessageToMessageDecoder<ByteBuf> {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        // TODO Auto-generated method stub
        final int length = msg.readableBytes();
        byte[] b = new byte[length];
        msg.getBytes(msg.readerIndex(), b,0,length);
        MessagePack msgpack = new MessagePack();
        out.add(msgpack.read(b));
    }

}
