package com.design.patterns.decorator;

public class ContextWrapper implements Context {

    private Context mBaseContext;

    public ContextWrapper(Context context) {
        this.mBaseContext = context;
    }

    @Override
    public void setThemeId() {
        mBaseContext.setThemeId();
    }

    @Override
    public Object getSystemService() {
        return mBaseContext.getSystemService();
    }

    @Override
    public Object getMainLoop() {
        return mBaseContext.getMainLoop();
    }

}
