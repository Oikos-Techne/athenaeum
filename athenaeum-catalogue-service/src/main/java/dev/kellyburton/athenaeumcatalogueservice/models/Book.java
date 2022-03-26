package dev.kellyburton.athenaeumcatalogueservice.models;

public class Book {

    private String id;
    private String title;

    public Book() {

    }

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getBookId() {
        return id;
    }

    public void setBookId(String bookId) {
        this.id = id;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = title;
    }
}
