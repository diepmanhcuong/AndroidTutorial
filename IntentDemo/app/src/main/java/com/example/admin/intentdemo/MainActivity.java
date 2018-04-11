package com.example.admin.intentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5;
    Button Ibt,Ibt2,Ibt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        Ibt = (Button) findViewById(R.id.ActionView) ;
        Ibt2 = (Button) findViewById(R.id.ActionSento) ;
        Ibt3 = (Button) findViewById(R.id.ActionCall) ;

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("String","Mèo Đẹp trai");
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Number",132132);
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                String[] str = {"haha","hihi","huhu","kkk"};
                intent.putExtra("Array",str);
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                Student st = new Student(1,"Cường","15SICLC");
                intent.putExtra("Student", (Serializable) st);
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                Bundle bd = new Bundle();
                bd.putString("String","haha");
                intent.putExtra("dulieu",bd);
                startActivity(intent);
            }
        });

        Ibt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=c0C8-s1K0qg&t=55s"));
                startActivity(intent);
            }
        });

        Ibt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.putExtra("sms_body","chào bạn....");
                intent.setData(Uri.parse("sms: 01283221532"));
                startActivity(intent);
            }
        });

        Ibt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                //intent.putExtra("sms_body","chào bạn....");
                intent.setData(Uri.parse("tel: 01283221532"));
                startActivity(intent);
            }
        });
    }
}
