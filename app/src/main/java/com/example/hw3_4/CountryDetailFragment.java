package com.example.hw3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw3_4.databinding.FragmentCountryDetailBinding;


public class CountryDetailFragment extends Fragment {
    private FragmentCountryDetailBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentCountryDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInsaitState) {
        super.onViewCreated(view,savedInsaitState);
        Country country=(Country) getArguments().getSerializable("COUNTRY");
        binding.tvName.setText(country.getName());
        binding.tvCapital.setText(country.getCapital());
        Glide.with(binding.imgFlag).load(country.getFlag()).into(binding.imgFlag);


    }



