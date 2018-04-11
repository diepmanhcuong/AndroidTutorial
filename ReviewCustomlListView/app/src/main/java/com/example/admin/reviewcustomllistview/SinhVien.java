package com.example.admin.reviewcustomllistview;

/**
 * Created by Admin on 4/11/2018.
 */

public class SinhVien {
    private int id;
    private String name;
    private int avatar;

    public SinhVien(int id, String name, int avatar) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
