package com.design.patterns.adapter;

public class ObjectAdapter implements Target {

    private Adaptee mAdaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.mAdaptee = adaptee;
    }

    @Override
    public void request() {
        //托管给源处理
        mAdaptee.specificRequest();
    }

}
