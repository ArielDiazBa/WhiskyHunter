package com.example.apilicores.models;

public class Slug {
    public String dt;
    public double winning_bid_max;
    public double winning_bid_min;
    public double winning_bid_mean;
    public double auction_trading_volume;
    public int auction_lots_count;
    public int all_auctions_lots_count;
    public String auction_name;
    public String auction_slug;

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public double getWinning_bid_max() {
        return winning_bid_max;
    }

    public void setWinning_bid_max(double winning_bid_max) {
        this.winning_bid_max = winning_bid_max;
    }

    public double getWinning_bid_min() {
        return winning_bid_min;
    }

    public void setWinning_bid_min(double winning_bid_min) {
        this.winning_bid_min = winning_bid_min;
    }

    public double getWinning_bid_mean() {
        return winning_bid_mean;
    }

    public void setWinning_bid_mean(double winning_bid_mean) {
        this.winning_bid_mean = winning_bid_mean;
    }

    public double getAuction_trading_volume() {
        return auction_trading_volume;
    }

    public void setAuction_trading_volume(double auction_trading_volume) {
        this.auction_trading_volume = auction_trading_volume;
    }

    public int getAuction_lots_count() {
        return auction_lots_count;
    }

    public void setAuction_lots_count(int auction_lots_count) {
        this.auction_lots_count = auction_lots_count;
    }

    public int getAll_auctions_lots_count() {
        return all_auctions_lots_count;
    }

    public void setAll_auctions_lots_count(int all_auctions_lots_count) {
        this.all_auctions_lots_count = all_auctions_lots_count;
    }

    public String getAuction_name() {
        return auction_name;
    }

    public void setAuction_name(String auction_name) {
        this.auction_name = auction_name;
    }

    public String getAuction_slug() {
        return auction_slug;
    }

    public void setAuction_slug(String auction_slug) {
        this.auction_slug = auction_slug;
    }
}
