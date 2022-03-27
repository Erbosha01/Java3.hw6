package com.geektech.java3hw6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView recyclerView;
    private ContinentsAdapter adapter;
    public static final String KEY_BUNDLE = "Siuuuuu";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);

        ArrayList<Continent> continents = new ArrayList<>();

        continents.add(new Continent("Австралия", R.drawable.ic_australia));
        continents.add(new Continent("Южная америка", R.drawable.ic_south_am));
        continents.add(new Continent("Северная Америка", R.drawable.ic_north_am));
        continents.add(new Continent("Африка", R.drawable.ic_africa));
        continents.add(new Continent("Евразия", R.drawable.ic_eurasia));
        continents.add(new Continent("Антарктида", R.drawable.ic_antarctida));

        adapter = new ContinentsAdapter(continents, new ClickListener() {
            @Override
            public void Click(int pos) {
                Bundle bundle = new Bundle();
                bundle.putInt(KEY_BUNDLE, pos);
                Fragment fragment = new SecondFragment();
                fragment.setArguments(bundle);
                if (savedInstanceState == null) {
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,
                            fragment).addToBackStack("").commit();
                }
            }
        });

        recyclerView.setAdapter(adapter);
    }
}