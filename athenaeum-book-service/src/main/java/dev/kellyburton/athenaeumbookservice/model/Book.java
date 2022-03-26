package dev.kellyburton.athenaeumbookservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

    private String id;
    private VolumeInfo volumeInfo;

    public Book() {
    }

    public Book(String id, VolumeInfo volumeInfo) {
        this.id = id;
        this.volumeInfo = volumeInfo;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
