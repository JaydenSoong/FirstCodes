package com.example.dailiang.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 打印任务信息
        Log.d("FirstActivity", "Task id is " + getTaskId());

        setContentView(R.layout.third_layout);
    }
}
