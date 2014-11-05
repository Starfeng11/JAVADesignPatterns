package com.design.patterns.adapter;

/**
 * 
 * 对象适配器模式<br>
 * 
 */
public class ObjectAdapterClient {

    public static void main(String[] args) {

        //普通请求操作
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        //特殊请求操作
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        objectAdapter.request();
    }

}
