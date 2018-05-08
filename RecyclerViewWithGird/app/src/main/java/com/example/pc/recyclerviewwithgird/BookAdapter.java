package com.example.pc.recyclerviewwithgird;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder>{

    Context mContext;
    ArrayList<Book> bookArrayList = new ArrayList<>();
    private int PICK_IMAGE_REQUEST =1;

    public BookAdapter(Context mContext, ArrayList<Book> bookArrayList) {
        this.mContext = mContext;
        this.bookArrayList = bookArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cardview_book_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txView.setText(bookArrayList.get(position).getName());
        holder.imageView.setImageResource(bookArrayList.get(position).getHinhAnh());

    }



    @Override
    public int getItemCount() {
        return bookArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txView;
        ImageView imageView;
        CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            txView = itemView.findViewById(R.id.txView);
            imageView = itemView.findViewById(R.id.imgView);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
