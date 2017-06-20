package com.example.android.fragments;

/**
 * Created by lenovo on 6/20/2017.
 */

public class Course {

    String name;
    String teacher;
    String language;

    public Course(String name, String teacher, String language) {
        this.name = name;
        this.teacher = teacher;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getLanguage() {
        return language;
    }
}
