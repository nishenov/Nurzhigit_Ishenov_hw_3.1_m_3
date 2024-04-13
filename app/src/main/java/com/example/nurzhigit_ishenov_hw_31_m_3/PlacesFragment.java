package com.example.nurzhigit_ishenov_hw_31_m_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {
    private RecyclerView rvPlaces;
    private ArrayList<String> placesList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_places, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvPlaces = requireActivity().findViewById(R.id.rv_places);
        loadData();
        PlacesAdapter placesAdapter = new PlacesAdapter(placesList);
        rvPlaces.setAdapter(placesAdapter);
    }
    public void loadData(){
        placesList.add("Бишкек");
        placesList.add("Москва");
        placesList.add("Лондон");
        placesList.add("Вашингтон");
        placesList.add("Париж");
        placesList.add("Амстердам");
        placesList.add("Рига");
        placesList.add("Вена");
        placesList.add("Ош");
        placesList.add("Астана");
        placesList.add("Казань");
        placesList.add("Токио");
        placesList.add("Пекин");
        placesList.add("Сеул");

    }
}