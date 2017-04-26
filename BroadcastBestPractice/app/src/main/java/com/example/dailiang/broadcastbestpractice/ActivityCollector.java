package com.example.dailiang.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DaiLiang on 2017/4/25.
 * 管理所有活动
 */

class ActivityCollector {

    private static List<Activity> activities = new ArrayList<>();

    static void addActivity(Activity activity){
        activities.add(activity);
    }

    static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    static void finishAll(){
        for(Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
