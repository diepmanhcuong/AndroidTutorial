package com.example.admin.fragmentdemo2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txMain;
    Button btAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txMain = (TextView)findViewById(R.id.txMain);
        btAdd = (Button)findViewById(R.id.btAdd);
        FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentA fragmentA = new FragmentA();
                Bundle bundle = new Bundle();
                bundle.putString("hoten","Diệp Mạnh Cường");
                fragmentA.setArguments(bundle);
                fragmentTransaction.add(R.id.linearMain,fragmentA);
                fragmentTransaction.commit();
            }
        });
    }
}
