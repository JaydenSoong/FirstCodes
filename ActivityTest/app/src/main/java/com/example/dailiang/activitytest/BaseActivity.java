package com.example.dailiang.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by DaiLiang on 2017/4/11.
 * 获取实例类名并打印。
 * 让 First Activity, SecondActivity, ThirdActivity 都继承自它。它再继承自 AppCompatActivity.
 * 从而知晓当前活动。
 */

public class BaseActivity extends AppCompatActivity {
    // 将一个要销毁的活动从集合类中移除
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity", getClass().getSimpleName());
        // 将这个活动添加到集合类中
        ActivityCollector.addActivity(this);
    }
}
