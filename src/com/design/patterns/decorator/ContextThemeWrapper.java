package com.design.patterns.decorator;

public class ContextThemeWrapper implements Context {

    @Override
    public void setThemeId() {

        System.out.println("set theme ID");
    }

    @Override
    public Integer getSystemService() {

        return 11;
    }

    @Override
    public Integer getMainLoop() {

        return 22;
    }

}
