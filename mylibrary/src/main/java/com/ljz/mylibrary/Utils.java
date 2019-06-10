package com.ljz.mylibrary;

public class Utils {

    private static Utils utils;

    private ICall mICall;

    public Utils() {

    }

    public static Utils getInstance() {
        if (utils == null) {
            utils = new Utils();
        }
        return utils;
    }

    public static String getLjz(){
        return "哈哈哈哈。。。。。调用了吧";
    }

    public void setmICall(ICall iCall) {
        mICall = iCall;
    }

    public String getApp() {
        return mICall.justTest();
    }

    public void callAppActivity() {
        mICall.callAppActivity();
    }
}
