package com.example.nurzhigit_ishenov_hw_31_m_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPlacesName;
    public PlacesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPlacesName = itemView.findViewById(R.id.tv_places_name);
    }

    public void onBind(String place){
        tvPlacesName.setText(place);
    }
}
