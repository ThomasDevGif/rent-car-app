package com.utilisateur.server.domain;

public class Car {

    private String plateNumber;
    private String price;
    private String manufacturer;
    private String brand;
    private String year;
    private String km;
    private String image;

    public Car() {

    }

    public Car(String plateNumber, String price, String manufacturer, String brand, String year, String km, String image) {
        this.plateNumber = plateNumber;
        this.price = price;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.year = year;
        this.km = km;
        this.image = image;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
