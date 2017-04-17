package com.example.dailiang.uibestpractice;

/**
 * Created by DaiLiang on 2017/4/17.
 * Msg 类
 */

class Msg {
    static final int TYPE_RECEIVED = 0;
    static final int TYPE_SENT = 1;

    private String content;
    private int type;

    Msg(String content, int type){
        this.content = content;
        this.type = type;
    }

    String getContent(){
        return content;
    }

    int getType(){
        return type;
    }
}
