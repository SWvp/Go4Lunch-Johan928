package com.example.go4lunch.user;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String uid;
    private String username;
    private String urlPicture;
    private String selectedRestaurantPlaceId;
    private List<String> favoriteRestaurantsList;
    private String selectedRestaurantName;
    private String selectedRestaurantAddress;



    public User() {
        //required for incoming documentSnapShot from firestore to be recovered
    }

    public User(String uid,String username,String urlPicture) {
        this.uid = uid;
        this.username = username;
        this.urlPicture = urlPicture;

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }

    public String getSelectedRestaurantPlaceId() {
        return selectedRestaurantPlaceId;
    }

    public void setSelectedRestaurantPlaceId(String selectedRestaurantPlaceId) {
        this.selectedRestaurantPlaceId = selectedRestaurantPlaceId;
    }

    public List<String> getFavoriteRestaurantsList() {
        return favoriteRestaurantsList;
    }

    public void setFavoriteRestaurantsList(ArrayList<String> favoriteRestaurantsList) {
        this.favoriteRestaurantsList = favoriteRestaurantsList;
    }

    public String getSelectedRestaurantName() {
        return selectedRestaurantName;
    }

    public void setSelectedRestaurantName(String selectRestaurantName) {
        this.selectedRestaurantName = selectRestaurantName;
    }

    public String getSelectedRestaurantAddress() {
        return selectedRestaurantAddress;
    }

    public void setSelectedRestaurantAddress(String selectRestaurantAddress) {
        this.selectedRestaurantAddress = selectRestaurantAddress;
    }
}
