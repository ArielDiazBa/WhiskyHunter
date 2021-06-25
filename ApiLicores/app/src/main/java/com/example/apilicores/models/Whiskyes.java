package com.example.apilicores.models;

import com.google.gson.annotations.SerializedName;

public class Whiskyes {
    @SerializedName("name")
    private String name;

    @SerializedName("slug")
    private String slug;

    @SerializedName("url")
    private String url;

    @SerializedName("buyers_fee")
    private double buyers_fee;

    @SerializedName("sellers_fee")
    private double sellers_fee;

    @SerializedName("reserve_fee")
    private double reserve_fee;

    @SerializedName("listing_fee")
    private double listing_fee;

    @SerializedName("base_currency")
    private String base_currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getBuyers_fee() {
        return buyers_fee;
    }

    public void setBuyers_fee(double buyers_fee) {
        this.buyers_fee = buyers_fee;
    }

    public double getSellers_fee() {
        return sellers_fee;
    }

    public void setSellers_fee(double sellers_fee) {
        this.sellers_fee = sellers_fee;
    }

    public double getReserve_fee() {
        return reserve_fee;
    }

    public void setReserve_fee(double reserve_fee) {
        this.reserve_fee = reserve_fee;
    }

    public double getListing_fee() {
        return listing_fee;
    }

    public void setListing_fee(double listing_fee) {
        this.listing_fee = listing_fee;
    }

    public String getBase_currency() {
        return base_currency;
    }

    public void setBase_currency(String base_currency) {
        this.base_currency = base_currency;
    }
}
