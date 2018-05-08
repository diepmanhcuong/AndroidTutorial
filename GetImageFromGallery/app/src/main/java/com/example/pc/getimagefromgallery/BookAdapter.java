package com.example.pc.getimagefromgallery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder>{

    ArrayList<Book> alBook = new ArrayList<>();
    Context mContext;

    public BookAdapter(ArrayList<Book> alBook, Context mContext) {
        this.alBook = alBook;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view  = layoutInflater.inflate(R.layout.book_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txView.setText(alBook.get(position).getName());
        holder.imageView.setImageResource(alBook.get(position).getHinh());
    }

    @Override
    public int getItemCount() {
        return alBook.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txView;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            txView = itemView.findViewById(R.id.txView);
            imageView = itemView.findViewById(R.id.imgView);
        }
    }
}

