package com.example.pc.getimagefromgallery;

public class Book {
    private int hinh;
    private String name;

    public Book(int hinh, String name) {
        this.hinh = hinh;
        this.name = name;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
