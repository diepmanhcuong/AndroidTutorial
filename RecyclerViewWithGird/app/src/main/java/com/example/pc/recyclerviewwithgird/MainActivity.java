package com.example.pc.recyclerviewwithgird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Book> bookArrayList;
    final int SELECT_IMAGE = -1;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book(R.drawable.eee,"abc"));
        bookArrayList.add(new Book(R.drawable.qqq,"abc"));
//        bookArrayList.add(new Book(R.drawable.www,"abc"));
//        bookArrayList.add(new Book(R.drawable.eee,"abc"));
//       // bookArrayList.add(new Book(R.drawable.rrr,"abc"));
//        bookArrayList.add(new Book(R.drawable.yyy,"abc"));
//        bookArrayList.add(new Book(R.drawable.uuu,"abc"));
//        bookArrayList.add(new Book(R.drawable.iii,"abc"));
//        bookArrayList.add(new Book(R.drawable.ooo,"abc"));
//        bookArrayList.add(new Book(R.drawable.ppp,"abc"));
//        bookArrayList.add(new Book(R.drawable.sss,"abc"));
//        bookArrayList.add(new Book(R.drawable.eee,"abc"));
//        bookArrayList.add(new Book(R.drawable.qqq,"abc"));
//        bookArrayList.add(new Book(R.drawable.www,"abc"));
//        bookArrayList.add(new Book(R.drawable.eee,"abc"));
//        bookArrayList.add(new Book(R.drawable.yyy,"abc"));
//        bookArrayList.add(new Book(R.drawable.uuu,"abc"));
//        bookArrayList.add(new Book(R.drawable.iii,"abc"));
//        bookArrayList.add(new Book(R.drawable.ooo,"abc"));
//        bookArrayList.add(new Book(R.drawable.ppp,"abc"));
//        bookArrayList.add(new Book(R.drawable.sss,"abc"));
        BookAdapter bookAdapter = new BookAdapter(getApplicationContext(),bookArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(bookAdapter);
    }


    public void pickimage(View view) {
        bt = (Button) view;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,"Select File"),SELECT_IMAGE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == SELECT_IMAGE){
            Intent getIntent = new Intent(Intent.ACTION_GET_CONTENT);
            getIntent.setType("image/*");

            Intent pickIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            pickIntent.setType("image/*");

            Intent chooserIntent = Intent.createChooser(getIntent, "Select Image");
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Intent[] {pickIntent});

            startActivityForResult(chooserIntent, SELECT_IMAGE);

            Toast.makeText(getApplicationContext(), "" + pickIntent, Toast.LENGTH_SHORT).show();
        }
    }
}
