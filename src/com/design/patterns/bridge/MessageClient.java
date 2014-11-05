package com.design.patterns.bridge;

public class MessageClient {

    public static void main(String[] args) {

        MessageImplementor implementor = new CommonMessageImplementor();
        AbstractMessage message = new CommonMessage(implementor);

        message.sendMessage("abc", "John");

    }

}
