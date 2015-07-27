package com.example.mypegasus.learncontext;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by Administrator on 2015/7/27 0027.
 */
public class MyApplication extends Application{

    private String textDate = "default";

    public String getTextDate() {
        return textDate;
    }

    public void setTextDate(String textDate) {
        this.textDate = textDate;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("MyApplication onCreate");
    }

    /**
     * ��ֹ������
     * */
    @Override
    public void onTerminate() {
        super.onTerminate();

        System.out.println("MyApplication onTerminate");
    }

    /**
     * ���ڴ�
     * */
    @Override
    public void onLowMemory() {
        super.onLowMemory();

        System.out.println("MyApplication onLowMemory");
    }

    /**
     * �����ڴ�
     * */
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

        System.out.println("MyApplication onTrimMemory");
    }

    /**
     * ���ñ仯
     * */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        System.out.println("MyApplication onConfigurationChanged");
    }
}
