package com.example.admin.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 4/11/2018.
 */

public class SinhVienAdapter extends BaseAdapter{
    Context context;
    int myLayout;
    List<SinhVien> arrSinhViens;

    public SinhVienAdapter(Context context, int myLayout, List<SinhVien> arrSinhViens) {
        this.context = context;
        this.myLayout = myLayout;
        this.arrSinhViens = arrSinhViens;
    }

    @Override
    public int getCount() {
        return arrSinhViens.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout,null);

        //ánh xạ

        TextView txtyear = (TextView)convertView.findViewById(R.id.txyear);
        txtyear.setText(String.valueOf(arrSinhViens.get(position).getYear()));

        TextView txtname = (TextView)convertView.findViewById(R.id.txten);
        txtname.setText(arrSinhViens.get(position).getName());

        return convertView;
    }
}
