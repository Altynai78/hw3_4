package com.example.hw3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw3_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnClick {
    private FragmentCountryBinding binding;
    private ArrayList<Country> countryList;
    private CountryAdapter adapter;
    private Log log;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentCountryBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        adapter=new CountryAdapter(countryList,this);
        binding.rvCountry.setAdapter(adapter);
    }
    private void loadData() {
        countryList=new ArrayList<>();
      countryList.add(new Country("",));
    }
}