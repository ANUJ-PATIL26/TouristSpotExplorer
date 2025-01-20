package com.example.touristspotexplorer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private TouristSpotAdapter adapter;
    private List<TouristSpot> touristSpotList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        loadTouristSpots();

        adapter = new TouristSpotAdapter(touristSpotList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void loadTouristSpots() {
        touristSpotList = new ArrayList<>();
        touristSpotList.add(new TouristSpot("Eiffel Tower", "Iconic tower in Paris, France."));
        touristSpotList.add(new TouristSpot("Great Wall of China", "Historical landmark in China."));
        touristSpotList.add(new TouristSpot("Statue of Liberty", "Famous landmark in New York, USA."));
        touristSpotList.add(new TouristSpot("Taj Mahal", "Symbol of love in India."));
        touristSpotList.add(new TouristSpot("Colosseum", "Ancient amphitheater in Rome, Italy."));
    }
}
