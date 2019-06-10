package com.ljz.ccdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.ljz.mylibrary.ICall;

public class AppUtils implements ICall {

    private Context mContext;

    public AppUtils(Context context) {
        mContext = context;
    }

    @Override
    public String justTest() {
        return "I am in App";
    }

    @Override
    public void callAppActivity() {
        Intent intent = new Intent(mContext, MainActivity.class);
        mContext.startActivity(intent);
    }
}
