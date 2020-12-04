package com.alaminkarno.recyclerview;

public class Student {

    private String name;
    private String roll;
    private String classname;
    private int image;

    public Student() {
    }

    public Student(String name, String roll, String classname, int image) {
        this.name = name;
        this.roll = roll;
        this.classname = classname;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
