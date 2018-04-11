package com.example.admin.customlistview;

/**
 * Created by Admin on 4/11/2018.
 */

public class SinhVien {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public SinhVien() {
    }

    public SinhVien(String name, int year) {
        this.name = name;
        this.year = year;
    }


}
