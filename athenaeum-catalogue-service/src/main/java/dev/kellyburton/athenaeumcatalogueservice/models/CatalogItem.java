package dev.kellyburton.athenaeumcatalogueservice.models;

public class CatalogItem {

    private Volume volume;
    private BookInformation bookInformation;

    public CatalogItem() {
    }

    public CatalogItem(Volume volume, BookInformation bookInformation) {
        this.volume = volume;
        this.bookInformation = bookInformation;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public BookInformation getBookInformation() {
        return bookInformation;
    }

    public void setBookInformation(BookInformation bookInformation) {
        this.bookInformation = bookInformation;
    }
}
