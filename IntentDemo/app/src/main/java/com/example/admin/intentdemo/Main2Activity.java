package com.example.admin.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {
    TextView tx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tx1 = (TextView)findViewById(R.id.tx1);

//        Bundle bundle = getIntent().getExtras();
//        String bd = bundle.getString("String");
//        if(bundle!=null){
//            tx1.setText(bd+" ");
//        }
//        Bundle bd2 = getIntent().getExtras();
//        int numb = bd2.getInt("Number");
//        if(bd2!=null){
//            tx1.setText(numb+" ");
//        }
//        Bundle bd3 = getIntent().getExtras();
//        String[] str = bd3.getStringArray("Array");
//        if(bd3!=null){
//            tx1.setText(str[3]+" ");
//        }

//        Bundle bd4 = getIntent().getExtras();
//        Student st = (Student) bd4.getSerializable("Student");
//        if(bd4!=null){
//            tx1.setText(st.getId()+"\t"+st.getName()+"\t"+st.getLop());
//        }
        Bundle bd5 = getIntent().getBundleExtra("dulieu");
        String strs = bd5.getString("String");

        if(bd5!=null){
            tx1.setText(strs+"");
        }
    }
}
