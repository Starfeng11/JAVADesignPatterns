package com.design.patterns.adapter;

/**
 * 适配器角色。继承被适配类，并实现目标接口
 * 
 * @author Chuanfeng
 * 
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        
        System.out.println("ClassAdapter request");
        this.specificRequest();
    }
}