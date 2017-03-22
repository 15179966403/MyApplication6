package com.hrc.administrator.myapplication;

/**
 * Created by Administrator on 2017/3/17.
 */

public class ListData {
    public static final int UP=1;
    public static final int BOTTOM=2;

    private String content;
    private int flag;

    public ListData(String content,int flag){
        setContent(content);
        setFlag(flag);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
