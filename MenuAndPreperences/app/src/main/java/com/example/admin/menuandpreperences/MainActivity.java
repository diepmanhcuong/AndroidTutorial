package com.example.admin.menuandpreperences;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt,bt1;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button)findViewById(R.id.btMenu);
        bt1 = (Button)findViewById(R.id.bt1);
        linearLayout = (LinearLayout)findViewById(R.id.linear);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu();
            }
        });
        registerForContextMenu(bt1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudemo,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.exit:
                Toast.makeText(MainActivity.this,"bạn đã chọn Exit",Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(MainActivity.this,"bạn đã chọn Exit",Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(MainActivity.this,"bạn đã chọn Exit",Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                Toast.makeText(MainActivity.this,"bạn đã chọn Exit",Toast.LENGTH_SHORT).show();
                break;
            case R.id.phone:
                Toast.makeText(MainActivity.this,"bạn đã chọn Exit",Toast.LENGTH_SHORT).show();
                break;
            case R.id.email:
                Toast.makeText(MainActivity.this,"bạn đã chọn Exit",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void showMenu(){
        PopupMenu popupMenu = new PopupMenu(this,bt);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.them:
                        bt.setText("thêm");
                        break;
                    case R.id.xoa:
                        bt.setText("xoa");
                        break;
                    case R.id.sua:
                        bt.setText("sửa");
                        break;
                    case R.id.update:
                        bt.setText("update");
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);
        menu.setHeaderTitle("chọn màu");
        menu.setHeaderIcon(R.mipmap.ic_launcher);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.vang:
                linearLayout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.red:
                linearLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.den:
                linearLayout.setBackgroundColor(Color.BLACK);
                break;
            case R.id.green:
                linearLayout.setBackgroundColor(Color.GREEN);
                break;
        }
        return super.onContextItemSelected(item);

    }
}
