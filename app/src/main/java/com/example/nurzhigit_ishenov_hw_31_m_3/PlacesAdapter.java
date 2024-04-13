package com.example.nurzhigit_ishenov_hw_31_m_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesViewHolder> {
    private ArrayList<String> placesList;

    public PlacesAdapter(ArrayList<String> placesList) {
        this.placesList = placesList;
    }

    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlacesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_places, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesViewHolder holder, int position) {
        holder.onBind(placesList.get(position));
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }
}
