package com.example.pc.getimagefromgallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Book> bookArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book(R.drawable.qqq,"abc"));
        bookArrayList.add(new Book(R.drawable.eee,"abc"));
        bookArrayList.add(new Book(R.drawable.www,"abc"));
        bookArrayList.add(new Book(R.drawable.rrr,"abc"));
        bookArrayList.add(new Book(R.drawable.yyy,"abc"));
        bookArrayList.add(new Book(R.drawable.uuu,"abc"));
        bookArrayList.add(new Book(R.drawable.iii,"abc"));
        bookArrayList.add(new Book(R.drawable.ooo,"abc"));
        bookArrayList.add(new Book(R.drawable.ppp,"abc"));
        bookArrayList.add(new Book(R.drawable.sss,"abc"));
        BookAdapter bookAdapter = new BookAdapter(bookArrayList,MainActivity.this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(bookAdapter);
    }
}
