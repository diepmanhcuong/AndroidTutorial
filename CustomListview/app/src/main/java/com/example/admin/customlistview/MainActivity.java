package com.example.admin.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<SinhVien> alSv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        alSv = new ArrayList<>();
        alSv.add(new SinhVien("mèo",1996));
        alSv.add(new SinhVien("Cường",1997));
        alSv.add(new SinhVien("chó",1998));
        alSv.add(new SinhVien("Khỉ",1999));
        alSv.add(new SinhVien("gà",1995));
        SinhVienAdapter adapter = new SinhVienAdapter(
                MainActivity.this,
                R.layout.sinh_vien,
                alSv
        );
        lv.setAdapter(adapter);
    }
}
