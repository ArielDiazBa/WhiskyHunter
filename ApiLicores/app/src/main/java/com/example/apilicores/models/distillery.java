package com.example.apilicores.models;

import com.google.gson.annotations.SerializedName;

public class distillery {
    @SerializedName("name")
    private String name;

    @SerializedName("slug")
    private String slug;

    @SerializedName("country")
    private String country;

    @SerializedName("whiskybase_whiskies")
    private String whiskybase_whiskies;

    @SerializedName("whiskybase_votes")
    private String whiskybase_votes;

    @SerializedName("whiskybase_rating")
    protected String whiskybase_rating;

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getCountry() {
        return country;
    }

    public String getWhiskybase_whiskies() {
        return whiskybase_whiskies;
    }

    public String getWhiskybase_votes() {
        return whiskybase_votes;
    }

    public String getWhiskybase_rating() {
        return whiskybase_rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setWhiskybase_whiskies(String whiskybase_whiskies) {
        this.whiskybase_whiskies = whiskybase_whiskies;
    }

    public void setWhiskybase_votes(String whiskybase_votes) {
        this.whiskybase_votes = whiskybase_votes;
    }

    public void setWhiskybase_rating(String whiskybase_rating) {
        this.whiskybase_rating = whiskybase_rating;
    }
}
