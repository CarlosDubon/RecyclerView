package com.example.carlos.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder> {
    private ArrayList<Serie> series;

    public static class SeriesViewHolder extends RecyclerView.ViewHolder{
        CardView card;
        TextView text;
        ImageView image;
        Button btnVer;

        public SeriesViewHolder(View itemView){
            super(itemView);
            card = itemView.findViewById(R.id.card_view);
            text = itemView.findViewById(R.id.text_title);
            image = itemView.findViewById(R.id.img);
            btnVer = itemView.findViewById(R.id.btn_ver);

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
    public void onBindViewHolder(final SeriesViewHolder holder, final int position) {
        holder.text.setText(series.get(position).getName());
        holder.image.setImageResource(series.get(position).getImg());
        holder.btnVer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(),series.get(position).getDesc(),Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return series.size();
    }

}
