package com.design.patterns.bridge;

public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor implementor) {
        super(implementor);

    }

    @Override
    public void sendMessage(String message, String toUser) {
       
        mImplementor.send(message, toUser);
    }

}
