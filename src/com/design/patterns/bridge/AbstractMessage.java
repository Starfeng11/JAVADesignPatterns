package com.design.patterns.bridge;

public abstract class AbstractMessage {

    protected MessageImplementor mImplementor;

    public AbstractMessage(MessageImplementor implementor) {
        this.mImplementor = implementor;
    }

    public abstract void sendMessage(String message, String toUser);
}
