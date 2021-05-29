package com.myapplicationdev.android.listvista;

public class List {

    private String taskName;
    private String date;

    public List (String taskName, String date) {
        this.taskName = taskName;
        this.date = date;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDate() {
        return date;
    }

}
