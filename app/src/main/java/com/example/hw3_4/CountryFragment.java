package com.example.hw3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hw3_4.databinding.ActivityMainBinding;
import com.example.hw3_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment implements OnClick {
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
        countryList = new ArrayList<>();
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/1200px-Flag_of_Kyrgyzstan.svg.png", "Кыргызстан", "Бишкек"));
        countryList.add(new Country("data:image/png;base64,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", "Китай", "Пекин"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/250px-Flag_of_South_Korea.svg.png", "Корея", "Сеул"));
        countryList.add(new Country("https://militaryarms.ru/wp-content/uploads/2021/08/naom_5b4dabf7f38e9.jpg", "Казакстан", "Астана"));
        countryList.add(new Country("https://blazon.ru/wp-content/uploads/2019/02/206.jpg", "Япония", "Токио"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/800px-Flag_of_Canada_%28Pantone%29.svg.png", "Канада", "Оттава"));
        countryList.add(new Country("https://tolerance-homes.ru/storage/images/pages/l0Ifgk8JbUb7tKmC9LbJA5aukc8XjwzPqvvH9jph.jpeg", "Турция", "Анкара"));
        countryList.add(new Country("https://img.freepik.com/free-photo/flag-of-germany_1401-118.jpg", "Германия", "Берлин"));
        countryList.add(new Country("https://img.freepik.com/free-vector/illustration-of-india-flag_53876-27130.jpg", "Индия", "Нью Дели"));
        countryList.add(new Country("https://www.france.promotour.info/symbole/images/drapeau006.jpg", "Франция", "Париж"));

    }
            @Override
            public void onClick(int position){
        Country country=countryList.get(position);
        Bundle bundle=new Bundle();
        Bundle.putSerializable("COUNTRY",country);
        CountryDetailFragment fragment=new CountryDetailFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(androidx.core.R.id.action_container,fragment).addToBackStack(null).commit();







    }


    }