package dev.evanishyn.entities;

public class Artwork {
    private int id;
    private String artistInitials;
    private String medium;
    private int price;

    public Artwork(){

    }

    public Artwork(int id, String artistInitials, String medium, int price) {
        this.id = id;
        this.artistInitials = artistInitials;
        this.medium = medium;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistInitials() {
        return artistInitials;
    }

    public void setArtistInitials(String artistInitials) {
        this.artistInitials = artistInitials;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
