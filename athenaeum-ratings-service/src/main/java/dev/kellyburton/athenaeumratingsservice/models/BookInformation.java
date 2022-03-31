package dev.kellyburton.athenaeumratingsservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class BookInformation {

    @Id
    private String id;
    private String volumeId;
    private String UUID;
    private String location;
    private boolean read;
    private String TBR;
    private boolean owned;
    private boolean wishlist;
    private int rating;
    private List<String> tags;

    public BookInformation() {
    }

    public BookInformation(String id, String volumeId, String UUID, String location, boolean read, String TBR, boolean owned, boolean wishlist, int rating, List<String> tags) {
        this.id = id;
        this.volumeId = volumeId;
        this.UUID = UUID;
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

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
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
