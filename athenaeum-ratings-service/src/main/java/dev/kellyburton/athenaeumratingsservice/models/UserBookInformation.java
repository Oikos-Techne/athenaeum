package dev.kellyburton.athenaeumratingsservice.models;

import java.util.List;

public class UserBookInformation {
    private List<BookInformation> bookInformation;

    public UserBookInformation() {
    }

    public UserBookInformation(List<BookInformation> bookInformation) {
        this.bookInformation = bookInformation;
    }

    public List<BookInformation> getBookInformation() {
        return bookInformation;
    }

    public void setBookInformation(List<BookInformation> bookInformation) {
        this.bookInformation = bookInformation;
    }
}
