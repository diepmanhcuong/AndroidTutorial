package com.example.pc.recyclerview;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SuperHeroAdapter superHeroAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        ArrayList<SuperHero> heroArrayList = new ArrayList<>();
        heroArrayList.add(new SuperHero("haha",R.drawable.aa));
        heroArrayList.add(new SuperHero("haha",R.drawable.bb));
        heroArrayList.add(new SuperHero("haha",R.drawable.cc));
        heroArrayList.add(new SuperHero("haha",R.drawable.dd));
        superHeroAdapter = new SuperHeroAdapter(heroArrayList,getApplicationContext());
        recyclerView.setAdapter(superHeroAdapter);
    }
}
