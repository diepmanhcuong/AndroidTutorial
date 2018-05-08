package com.example.pc.recyclerviewwithgird;

public class Book  {
    private int hinhAnh;
    private String name;

    public Book(int hinhAnh, String name) {
        this.hinhAnh = hinhAnh;
        this.name = name;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
