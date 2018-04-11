package com.example.admin.reviewcustomllistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<SinhVien> alSV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.lv);
        alSV = new ArrayList<>();
        alSV.add(new SinhVien(1,"mèo",R.drawable.user));
        alSV.add(new SinhVien(2,"cường",R.drawable.usera));
        alSV.add(new SinhVien(3,"nhàn",R.drawable.userb));
        alSV.add(new SinhVien(4,"bò",R.drawable.userc));
        alSV.add(new SinhVien(5,"khỉ",R.drawable.userd));
        SinhVienAdapter sinhVienAdapter = new SinhVienAdapter(
                MainActivity.this,
                alSV,
                R.layout.sinh_vien
        );
        lv.setAdapter(sinhVienAdapter);
    }
}
