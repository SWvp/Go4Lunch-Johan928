package com.example.go4lunch.factory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.go4lunch.details.DetailsViewModel;
import com.example.go4lunch.mapsView.MapsViewViewModel;
import com.example.go4lunch.repositories.LocationRepository;
import com.example.go4lunch.repositories.NearbySearchRepository;
import com.example.go4lunch.listview.ListViewViewModel;
import com.example.go4lunch.repositories.PlaceRepository;

public class ViewModelFactory implements ViewModelProvider.Factory {

    private final NearbySearchRepository nearbySearchRepository;
    private final LocationRepository locationRepository;
    private final PlaceRepository placeRepository;


    private static ViewModelFactory factory;

    public static ViewModelFactory getInstance() {

        if (factory == null) {
            synchronized (ViewModelFactory.class) {
                if (factory == null) {
                    factory = new ViewModelFactory();
                }
            }
        }
        return factory;
    }

    private ViewModelFactory() {

        this.nearbySearchRepository = new NearbySearchRepository();
        this.locationRepository = new LocationRepository();
        this.placeRepository = new PlaceRepository();
        this.locationRepository.startLocationRequest();
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(ListViewViewModel.class)) {
            return (T) new ListViewViewModel(locationRepository,nearbySearchRepository);
        } else if (modelClass.isAssignableFrom(MapsViewViewModel.class)) {
            return  (T) new MapsViewViewModel(locationRepository,nearbySearchRepository);
        } else if (modelClass.isAssignableFrom(DetailsViewModel.class)) {
            return  (T) new DetailsViewModel(nearbySearchRepository,placeRepository);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");

    }
}
