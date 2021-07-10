package ru.netology.domain;

public class Geo {
    private String placeType;
    private String coordinatesOfPlace;
    //?объект Place - описание места?

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public String getCoordinatesOfPlace() {
        return coordinatesOfPlace;
    }

    public void setCoordinatesOfPlace(String coordinatesOfPlace) {
        this.coordinatesOfPlace = coordinatesOfPlace;
    }
}
