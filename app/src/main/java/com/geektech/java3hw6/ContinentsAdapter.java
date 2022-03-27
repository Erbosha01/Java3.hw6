package com.geektech.java3hw6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContinentsAdapter extends RecyclerView.Adapter<ContinentsAdapter.ContinentsViewHolder> {

    private ArrayList<Continent> continents;
    private ClickListener onClickListener;

    public ContinentsAdapter(ArrayList<Continent> continents, ClickListener clickListener) {
        this.continents = continents;
        onClickListener = clickListener;
    }

    @NonNull
    @Override
    public ContinentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentsViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_continent,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentsViewHolder holder, int position) {
        holder.bind(continents.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.Click(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    class ContinentsViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView img;
        public ContinentsViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.continent);
        }

        public void bind(Continent continent) {
            name.setText(continent.getName());
            img.setImageResource(continent.getImg());
        }
    }
}
