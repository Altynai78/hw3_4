package com.example.hw3_4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_4.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<Country> countryList;
    private OnClick onItemClick;

    public CountryAdapter(ArrayList<Country> countryList, OnClick onItemClick) {
        this.countryList = countryList;
        this.onItemClick = onItemClick;
    }



    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(countryList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(position);
            }
        });



    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}
public class CountryViewHolder extends RecyclerView.ViewHolder{
    private ItemCountryBinding binding;



    public CountryViewHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding=binding;

    }
    void bind(Country country){
      binding.tvCountry.setText(country.getName());
      binding.tvCapital.setText(country.getCapital());


    }
}