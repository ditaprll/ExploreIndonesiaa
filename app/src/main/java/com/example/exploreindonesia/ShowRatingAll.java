package com.example.exploreindonesia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ShowRatingAll extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    DatabaseReference myRef;
    private RatingAdapter adapter;
    ArrayList<CommentReview> commentReviews = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_rating_all);

        adapter = new RatingAdapter();

        mRecyclerView = findViewById(R.id.rv_rating);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        setTitle("Rating Keseluruhan");

    }

    @Override
    protected void onStart() {
        super.onStart();

        myRef = FirebaseDatabase.getInstance().getReference().child("Review");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                commentReviews.clear();
                for (DataSnapshot notedataSnapshot : dataSnapshot.getChildren()) {
                    CommentReview commentReview = notedataSnapshot.getValue(CommentReview.class);
                    /*String rating = notedataSnapshot.child("rating").getValue().toString();
                    String id = notedataSnapshot.child("id").getValue().toString();

                    if (id.equals("1")) {
                        id = "Bandung";
                    } else {
                        id = "Jogja";
                    }*/
//                    }
//                    buffer.append("ID : "+ id + "\n");
//                    buffer.append("Rating: "+ rating + "\n");
//
                    System.out.println("Ditaa " + commentReview.getId());
                    commentReviews.add(commentReview);
                }
                adapter.setCr(commentReviews);
                mRecyclerView.setAdapter(adapter);
//                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                System.out.println("Failed to read value." + databaseError.toException());
            }
        });
    }
}
