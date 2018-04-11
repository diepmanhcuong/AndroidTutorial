package com.example.admin.listviewandlistviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<String> monHoc;
    Button bt,btUpdate;
    EditText edt;
    int viTri =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.lisView);
        monHoc = new ArrayList<>();
        monHoc.add("Android");
        monHoc.add("IOS");
        monHoc.add("Java");
        monHoc.add("Unity");
        monHoc.add("PHP");
        monHoc.add("Ruby");

        final ArrayAdapter arrayAdapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                monHoc
        );
        lv.setAdapter(arrayAdapter);
        bt = (Button)findViewById(R.id.btadd);
        btUpdate = (Button)findViewById(R.id.btupdate);
        edt = (EditText)findViewById(R.id.edt);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,monHoc.get(position)+","+position,Toast.LENGTH_SHORT).show();
            }
        });

        //longClick and xóa list view
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"bạn đã xóa "+monHoc.get(position)+","+position,Toast.LENGTH_SHORT).show();
                monHoc.remove(position);
                arrayAdapter.notifyDataSetChanged();
                return false;
            }
        });



        //Insert ListView
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String insert = edt.getText().toString();
                monHoc.add(insert);
                arrayAdapter.notifyDataSetChanged();
                edt.setText("");
            }
        });

        //update Listview

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edt.setText(monHoc.get(position));
                viTri = position;
            }
        });

        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String update = edt.getText().toString();
                monHoc.set(viTri,update);
                arrayAdapter.notifyDataSetChanged();
                edt.setText("");
            }
        });
    }
}
