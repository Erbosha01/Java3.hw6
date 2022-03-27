package com.geektech.java3hw6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private RecyclerView recyclerView;
    private CountryAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler2);


        ArrayList<Country> countries = new ArrayList<>();
        Bundle bundle = getArguments();
        int pos = bundle.getInt(MainFragment.KEY_BUNDLE);
        switch (pos) {
            case 4:
                countries.add(new Country(R.drawable.ic_eur_one, "Кыргызстан", "Бишкек"));
                countries.add(new Country(R.drawable.ic_eur_two, "Казакстан", "Нурсултан"));
                countries.add(new Country(R.drawable.ic_eur_three, "Монголия", "Улан Батор"));
                countries.add(new Country(R.drawable.ic_eurasia_four, "Япония", "Токио"));
                countries.add(new Country(R.drawable.ic_eur_five, "Узбекистан", "Ташкент"));
                break;
            case 0:
                countries.add(new Country(R.drawable.ic_australia_six, "Австралия", "Канберра"));
                countries.add(new Country(R.drawable.ic_new_zeland_seven, "Новая Зеландия",
                        "Веллингтон"));
                countries.add(new Country(R.drawable.ic_fuji_eight, "Фиджи", "Сува"));
                countries.add(new Country(R.drawable.ic_palau_nine, "Палау", "Нгерулмуд"));
                countries.add(new Country(R.drawable.ic_samoa_ten, "Самоа", "Апия"));
                break;
            case 1:
                countries.add(new Country(R.drawable.ic_eleven,"Аргентина","Буэнос Айрес"));
                countries.add(new Country(R.drawable.ic_twelve,"Бразилия","Бразилиа"));
                countries.add(new Country(R.drawable.ic_thirteen,"Уругвая","Монтевидео"));
                countries.add(new Country(R.drawable.ic_fourteen,"Колумбия","Богота"));
                countries.add(new Country(R.drawable.ic_fifteen,"Чили","Сантьяго"));
                break;
            case 2:
                countries.add(new Country(R.drawable.ic_sixteen,"США","Вашингтон"));
                countries.add(new Country(R.drawable.ic_seventeen,"Мексика","Мехико"));
                countries.add(new Country(R.drawable.ic_twenty_one,"Гондурас","Тегусигальпа"));
                countries.add(new Country(R.drawable.ic_nineteen,"Канада","Оттава"));
                countries.add(new Country(R.drawable.ic_twenty,"Куба","Гаванна"));
                break;
            case 3:
                countries.add(new Country(R.drawable.ic_tt,"Алжир","Алжир"));
                countries.add(new Country(R.drawable.ic_tth,"Ангола","Луанда"));
                countries.add(new Country(R.drawable.ic_tn,"Бенин","Порто Ново"));
                countries.add(new Country(R.drawable.ic_tf,"Ботсвана","Габороне"));
                countries.add(new Country(R.drawable.ic_ts,"Буркина Фасо","Уагадугу"));
                break;
            case 5:
                countries.add(new Country(R.drawable.ic_rashka,"Россия","Москва"));
                countries.add(new Country(R.drawable.ic_twelve,"Бразилия","Бразилиа"));
                countries.add(new Country(R.drawable.ic_eurasia_four,"Япония","Токио"));
                countries.add(new Country(R.drawable.ic_new_zeland_seven,"Новая Зеландия","Веллингтон"));
                countries.add(new Country(R.drawable.ic_australia_six,"Австралия","Канберра"));
                break;
        }


        adapter = new CountryAdapter(countries);
        recyclerView.setAdapter(adapter);
    }
}