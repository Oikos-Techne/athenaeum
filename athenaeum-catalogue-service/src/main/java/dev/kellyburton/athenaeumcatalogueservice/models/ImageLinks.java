package dev.kellyburton.athenaeumcatalogueservice.models;

public class ImageLinks {

    private String smallThumbnail;
    private String thumbnail;
    private String small;
    private String medium;
    private String large;

    public ImageLinks() {
    }

    public ImageLinks(String smallThumbnail, String thumbnail, String small, String medium, String large) {
        this.smallThumbnail = smallThumbnail;
        this.thumbnail = thumbnail;
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
}
