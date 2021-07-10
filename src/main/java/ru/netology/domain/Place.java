package ru.netology.domain;

public class Place {
    private int placeId;
    private String placeTitle;
    private int latitude;
    private int longitude;
    private int dateCreated;
    private String icon;
    private int checkinsCount;
    private int updated;
    private int type;
    private int country;
    private int city;
    private String adress;

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getPlaceTitle() {
        return placeTitle;
    }

    public void setPlaceTitle(String placeTitle) {
        this.placeTitle = placeTitle;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getCheckinsCount() {
        return checkinsCount;
    }

    public void setCheckinsCount(int checkinsCount) {
        this.checkinsCount = checkinsCount;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
