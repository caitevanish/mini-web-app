package dev.evanishyn.entities;

public class Artwork {
    private int id;
    private String artistIntials;
    private String medium;
    private int price;

    public Artwork(){

    }

    public Artwork(int id, String artistIntials, String medium, int price) {
        this.id = id;
        this.artistIntials = artistIntials;
        this.medium = medium;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistIntials() {
        return artistIntials;
    }

    public void setArtistIntials(String artistIntials) {
        this.artistIntials = artistIntials;
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
