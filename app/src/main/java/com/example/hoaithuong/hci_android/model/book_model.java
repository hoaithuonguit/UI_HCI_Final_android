package com.example.hoaithuong.hci_android.model;

import java.util.ArrayList;

/**
 * Created by hoai thuong on 1/17/2018.
 */

public class book_model {
    private String Title;
    private String Author;
    private String Description;
    private String Image;
    private ArrayList<String> tags;
    private int Status;// 0: chua so huu; //1: da so huu

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public book_model(String title, String author, String description, String image, ArrayList<String> tags, int status) {
        Title = title;
        Author = author;
        Description = description;
        Image = image;
        this.tags = tags;
        Status = status;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
