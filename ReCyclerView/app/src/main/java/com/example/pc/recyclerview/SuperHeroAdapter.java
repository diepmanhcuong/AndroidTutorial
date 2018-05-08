package com.example.pc.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.ViewHolder> {
    ArrayList<SuperHero> heroArrayList= new ArrayList<>();
    Context context;

    public SuperHeroAdapter(ArrayList<SuperHero> heroArrayList, Context context) {
        this.heroArrayList = heroArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.super_hero,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(heroArrayList.get(position).getAvarta());
        holder.textView.setText(heroArrayList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return heroArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imgView);
        }
    }
}
