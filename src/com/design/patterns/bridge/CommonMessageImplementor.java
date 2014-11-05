package com.design.patterns.bridge;

public class CommonMessageImplementor extends MessageImplementor {

    @Override
    public void send(String message, String toUser) {

        System.out.println("Send Common Msg" + message + "__to  " + toUser);
    }

}
