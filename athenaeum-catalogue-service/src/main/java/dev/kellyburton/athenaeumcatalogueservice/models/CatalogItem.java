package dev.kellyburton.athenaeumcatalogueservice.models;

import java.util.List;

public class CatalogItem {

    private Book book;
    private BookInformation bookInformation;

    public CatalogItem() {
    }

    public CatalogItem(Book book, BookInformation bookInformation) {
        this.book = book;
        this.bookInformation = bookInformation;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookInformation getBookInformation() {
        return bookInformation;
    }

    public void setBookInformation(BookInformation bookInformation) {
        this.bookInformation = bookInformation;
    }
}
