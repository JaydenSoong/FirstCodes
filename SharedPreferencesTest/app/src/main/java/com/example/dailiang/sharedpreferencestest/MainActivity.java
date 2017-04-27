package com.example.dailiang.sharedpreferencestest;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button save_data = (Button) findViewById(R.id.save_data);
        // 存储数据逻辑
        save_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // getSharedPreferences() 获取到 SharedPreferences 对象，再调用其 edit()
                // 得到 SharedPreferences.Editor 对象。
                SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();
                // 添加数据（以键值对的形式）
                editor.putString("name", "jayden");
                editor.putInt("age", 31);
                editor.putBoolean("married", true);
                // 提交
                editor.apply();
            }
        });

        Button restore_data = (Button) findViewById(R.id.restore_data);
        // 取出数据逻辑
        restore_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 拿到 SharedPreferences 对象
                SharedPreferences spf = getSharedPreferences("data", MODE_PRIVATE);
                // 取出数据
                String getName = spf.getString("name", "");
                int getAge = spf.getInt("age", 0);
                boolean getMarried = spf.getBoolean("married", false);
                // 将取出的数据打印出来
                Log.d("MainActivity", "Name is " + getName);
                Log.d("MainActivity", "Age is " + getAge);
                Log.d("MainActivity", "Is Married: " + getMarried);
            }
        });
    }
}
