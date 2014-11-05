package com.design.patterns.adapter;

/**
 * 
 * 类适配器模式（采用继承实现）<br>
 * 单一的为某个类适配（Java不支持多继承）
 * 
 */
public class ClassAdapterClient {

    public static void main(String[] args) {

        //普通操作。
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        //被适配类特殊操作
        ClassAdapter adapter = new ClassAdapter();
        adapter.request();

        /**
         * 测试结果：
         * 
         * 普通类ConcreteTarget 具备具体的请求功能。
         * 被适配类ClassAdapter 具备特殊的请求功能。
         */
    }

}
