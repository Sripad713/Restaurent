package com.example.restaurent;

public class CourseModel { private String course_name;
                           private int value;
                           private int imgid;

    public CourseModel(String course_name,int value, int imgid) {
        this.course_name = course_name;
        this.value = value;
        this.imgid = imgid;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }



    public int getvalue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }





    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}