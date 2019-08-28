package com.phei.netty.messagePack;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.msgpack.MessagePack;

/**
 * @Description:
 * @Author: liboqing
 * @CreateDate: 2019/8/28 16:29
 */
public class MsgpackEncoder extends MessageToByteEncoder {

    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
        // TODO Auto-generated method stub
        MessagePack msgpack = new MessagePack();
        out.writeBytes(msgpack.write(msg));
    }

}
