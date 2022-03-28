package dev.kellyburton.athenaeumcatalogueservice.models;

public class Book {

    private String id;
    private VolumeInfo volumeInfo;

    public Book() {

    }

    public Book(String id, VolumeInfo volumeInfo) {
        this.id = id;
        this.volumeInfo = volumeInfo;
    }

    public String getBookId() {
        return id;
    }

    public void setBookId(String bookId) {
        this.id = id;
    }

    public VolumeInfo getName() {
        return volumeInfo;
    }

    public void setName(String name) {
        this.volumeInfo = volumeInfo;
    }
}
