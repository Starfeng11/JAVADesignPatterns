package com.design.patterns.decorator;

public class DecoratorClient {

    public static void main(String[] args) {

        ContextThemeWrapper themeWrapper = new ContextThemeWrapper();
        ContextWrapper contextWrapper = new ContextWrapper(themeWrapper);
        contextWrapper.getMainLoop();
        contextWrapper.getSystemService();
    }

}
