package com.example.admin.reviewcustomllistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 4/11/2018.
 */

public class SinhVienAdapter extends BaseAdapter {
    Context myContext;
    List<SinhVien> sinhViens;
    int myLayout;

    public SinhVienAdapter(Context myContext, List<SinhVien> sinhViens, int myLayout) {
        this.myContext = myContext;
        this.sinhViens = sinhViens;
        this.myLayout = myLayout;
    }

    @Override
    public int getCount() {
        return sinhViens.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout,null);

        TextView txname = (TextView)convertView.findViewById(R.id.txname);
        txname.setText(sinhViens.get(position).getName());
        TextView txid = (TextView)convertView.findViewById(R.id.txid);
        txid.setText(String.valueOf(sinhViens.get(position).getId()));

        ImageView imageView = (ImageView)convertView.findViewById(R.id.avatar);
        imageView.setImageResource(sinhViens.get(position).getAvatar());
        return convertView;
    }
}
