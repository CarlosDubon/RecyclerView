package com.example.carlos.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder> {
    private ArrayList<Serie> series;

    public static class SeriesViewHolder extends RecyclerView.ViewHolder{
        CardView card;
        TextView text;
        ImageView image;

        public SeriesViewHolder(View itemView){
            super(itemView);
            card = itemView.findViewById(R.id.card_view);
            text = itemView.findViewById(R.id.text_title);
            image = itemView.findViewById(R.id.img);
        }
    }

    public SeriesAdapter(ArrayList<Serie> series){
        this.series = series;
    }

    @Override
    public SeriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
        return (new SeriesViewHolder(view));
    }

    @Override
    public void onBindViewHolder(SeriesViewHolder holder, int position) {
        holder.text.setText(series.get(position).getName());
        holder.image.setImageResource(series.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return series.size();
    }
}
