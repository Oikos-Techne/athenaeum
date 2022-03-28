package dev.kellyburton.athenaeumcatalogueservice.models;

import java.util.List;

public class BookInformation {

    private String id;
    private String location;
    private boolean read;
    private String TBR;
    private boolean owned;
    private boolean wishlist;
    private int rating;
    private List<String> tags;

    public BookInformation() {
    }

    public BookInformation(String id, String location, boolean read, String TBR, boolean owned, boolean wishlist, int rating, List<String> tags) {
        this.id = id;
        this.location = location;
        this.read = read;
        this.TBR = TBR;
        this.owned = owned;
        this.wishlist = wishlist;
        this.rating = rating;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getTBR() {
        return TBR;
    }

    public void setTBR(String TBR) {
        this.TBR = TBR;
    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public boolean isWishlist() {
        return wishlist;
    }

    public void setWishlist(boolean wishlist) {
        this.wishlist = wishlist;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
