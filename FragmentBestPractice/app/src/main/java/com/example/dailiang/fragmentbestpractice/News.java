package com.example.dailiang.fragmentbestpractice;

/**
 * Created by DaiLiang on 2017/4/19.
 * News Class, 新闻实体
 * 包访问权限就可以了
 */

class News {
    private String title;
    private String content;

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getContent() {
        return content;
    }

    void setContent(String content) {
        this.content = content;
    }
}
