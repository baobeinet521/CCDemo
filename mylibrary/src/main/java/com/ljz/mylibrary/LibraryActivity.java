package com.ljz.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    private Button callActBtn;
    private Button callFunBtn;
    private TextView mTestText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        callActBtn = (Button) findViewById(R.id.call_activity);
        callFunBtn = (Button) findViewById(R.id.call_fun);
        mTestText = findViewById(R.id.call_app_text);

        callActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.getInstance().callAppActivity();
            }
        });

        callFunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fromApp = Utils.getInstance().getApp();
                mTestText.setText(fromApp);
            }
        });
    }
}
