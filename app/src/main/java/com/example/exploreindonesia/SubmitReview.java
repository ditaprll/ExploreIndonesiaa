package com.example.exploreindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;


import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Comment;

public class SubmitReview extends AppCompatActivity {
    private AppCompatRatingBar ratingBar;
    private Button btRating;
    private TextView tvRating;
    private EditText Comment;
    private String id;
    private float rating;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Review");

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_review);
        ratingBar = (AppCompatRatingBar) findViewById(R.id.rt_bar);
        tvRating = (TextView) findViewById(R.id.tv_rate);
        Comment = findViewById(R.id.isi);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tvRating.setText("Rate : "+rating);
        }

    });
}



    public void submitReview(View view) {
        id = getIntent().getStringExtra("idWisata");
        rating = ratingBar.getRating();
        CommentReview commentReview = new CommentReview(Comment.getText().toString(), id, rating);
        myRef.push().setValue(commentReview);
        Intent intent= new Intent(this, Review.class);
        startActivity(intent);
    }


}
