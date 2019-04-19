package com.example.app2.model;

public class Contact {
    private String name;
    private String phone;
    private int photo;
    private int points;

    public Contact(String name, String phone, int photo, int points) {
        this.name = name;
        this.phone = phone;
        this.photo = photo;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
