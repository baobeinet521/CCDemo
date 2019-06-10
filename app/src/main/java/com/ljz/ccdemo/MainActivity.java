package com.ljz.ccdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ljz.mylibrary.LibraryActivity;
import com.ljz.mylibrary.Utils;

public class MainActivity extends AppCompatActivity {

    private Button callActBtn;
    private Button callFunBtn;
    private TextView mTestText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.getInstance().setmICall(new AppUtils(MainActivity.this));

        callActBtn = (Button) findViewById(R.id.call_activity);
        callFunBtn = (Button) findViewById(R.id.call_fun);
        mTestText = findViewById(R.id.call_fun_text);

        callActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(intent);

            }
        });

        callFunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getStr = Utils.getLjz();
                if(!TextUtils.isEmpty(getStr)){
                    mTestText.setText(getStr);
                }
            }
        });

    }
}
