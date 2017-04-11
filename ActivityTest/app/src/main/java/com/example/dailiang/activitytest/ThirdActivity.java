package com.example.dailiang.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 打印任务信息
        Log.d("FirstActivity", "Task id is " + getTaskId());

        setContentView(R.layout.third_layout);

        Button button3 = (Button) findViewById(R.id.button_3);
        // 点击按钮后销毁所有活动
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
                // 杀掉当前进程的代码
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}
