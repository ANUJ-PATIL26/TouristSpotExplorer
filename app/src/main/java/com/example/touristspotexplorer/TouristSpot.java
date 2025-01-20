package com.example.touristspotexplorer;

public class TouristSpot {
    private String name;
    private String description;

    public TouristSpot(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
