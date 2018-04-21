package com.example.admin.listfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.zip.Inflater;

/**
 * Created by Admin on 4/21/2018.
 */

public class fragmentList extends ListFragment {
    String[] country = {"vietnam","america","korea","china","russia"};
    ArrayAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,country);
         setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_list,container,false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity(),country[position],Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);
    }
}
