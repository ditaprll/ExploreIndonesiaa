package com.example.exploreindonesia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class DetailReview extends AppCompatActivity {

    private RecyclerView rvListReview;
    private ArrayList<CommentReview> commentReviews = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_review);

        setTitle("Review");
        rvListReview =findViewById(R.id.rv_listComment);
        rvListReview.setLayoutManager(new LinearLayoutManager(this));
        rvListReview.setAdapter(new ListReviewAdapter(commentReviews));

    }

    }

