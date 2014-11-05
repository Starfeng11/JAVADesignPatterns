package com.design.patterns.adapter;

/**
 * 具体类，只是为了实现目标任务。
 * 
 * @author Chuanfeng
 * 
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("do something");

    }

}
