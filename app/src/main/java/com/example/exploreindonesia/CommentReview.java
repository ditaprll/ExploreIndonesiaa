package com.example.exploreindonesia;

import java.util.ArrayList;

public class CommentReview {

    private String comment,id;
    private float rating;

    private ArrayList<CommentReview> cr = new ArrayList<>();

    public CommentReview(String comment, String id, float rating) {
        this.comment = comment;
        this.id = id;
        this.rating = rating;
    }

    public CommentReview(){

    }
    public String getComment() {

        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
