package com.geektech.java3hw6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {

    private ArrayList<Country> countries;

    public CountryAdapter(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {

        private TextView country, capital;
        private ImageView flag;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            country = itemView.findViewById(R.id.country);
            capital = itemView.findViewById(R.id.capital);
            flag = itemView.findViewById(R.id.flag);
        }

        public void bind(Country country) {
            this.country.setText(country.getName());
            capital.setText(country.getCapital());
            flag.setImageResource(country.getFlag());
        }
    }
}
