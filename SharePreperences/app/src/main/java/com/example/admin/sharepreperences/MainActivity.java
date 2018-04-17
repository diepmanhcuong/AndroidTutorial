package com.example.admin.sharepreperences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btSave,btread, btRemove,btRemoveAll;
    private final String SHARE_PREFERENCES_NAME = "Cường";
    private final String MY_NAME = "my_name";
    private final String AGE = "age";
    private final String IS_SINGLE = "is_single";
    private final String WEIGHT = "WEIGHT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSave = (Button)findViewById(R.id.btSave);
        btread = (Button)findViewById(R.id.btread);
        btRemove = (Button)findViewById(R.id.btRemove);
        btRemoveAll = (Button)findViewById(R.id.btRemoveAll);
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               putData();
                //editor.commit();
            }
        });

        btread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readData();
            }
        });

        btRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeByKey(MY_NAME);
                readData();
            }
        });

        btRemoveAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeAll();
                readData();
            }
        });
    }
    public void putData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARE_PREFERENCES_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(MY_NAME,"Diệp Mạnh Cường");
        editor.putInt(AGE,22);
        editor.putBoolean(IS_SINGLE,true);
        editor.putLong(WEIGHT,59);

        editor.apply();
        Toast.makeText(MainActivity.this,"SAVE SUCCESSFULLY",Toast.LENGTH_SHORT).show();
    }

    public void readData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARE_PREFERENCES_NAME,Context.MODE_PRIVATE);
        String name = sharedPreferences.getString(MY_NAME,"Cường");
        int age = sharedPreferences.getInt(AGE,22);
        Boolean is_single = sharedPreferences.getBoolean(IS_SINGLE,true);
        long weight = sharedPreferences.getLong(WEIGHT,50);
        String address = sharedPreferences.getString("ADDRESS","Đà Nẵng");
        Log.d("AAAA","tên: "+name+"\tage: "+age+"\tis_single"+is_single+"\tweight: "+weight+"\taddress: "+address);
    }
    public void removeByKey(String key){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARE_PREFERENCES_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(key);
        editor.apply();
    }
    public  void removeAll(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARE_PREFERENCES_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
