package com.example.touristspotexplorer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TouristSpotAdapter extends RecyclerView.Adapter<TouristSpotAdapter.TouristSpotViewHolder> {

    private List<TouristSpot> touristSpots;

    public TouristSpotAdapter(List<TouristSpot> touristSpots) {
        this.touristSpots = touristSpots;
    }

    @NonNull
    @Override
    public TouristSpotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tourist_spot, parent, false);
        return new TouristSpotViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TouristSpotViewHolder holder, int position) {
        TouristSpot spot = touristSpots.get(position);
        holder.spotName.setText(spot.getName());
        holder.spotDescription.setText(spot.getDescription());
    }

    @Override
    public int getItemCount() {
        return touristSpots.size();
    }

    static class TouristSpotViewHolder extends RecyclerView.ViewHolder {
        TextView spotName, spotDescription;

        public TouristSpotViewHolder(@NonNull View itemView) {
            super(itemView);
            spotName = itemView.findViewById(R.id.tv_spot_name);
            spotDescription = itemView.findViewById(R.id.tv_spot_description);
        }
    }
}
