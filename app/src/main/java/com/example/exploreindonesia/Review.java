package com.example.exploreindonesia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Review extends AppCompatActivity {
    private TextView tv;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Review");
    private EditText Comment;
    private String id;
    private float rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
    }


    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    public void showRating(View view) {
//        myRef.orderByChild("Review").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                StringBuffer buffer=new StringBuffer();
//                for(DataSnapshot notedataSnapshot: dataSnapshot.getChildren()){
//                    String rating = notedataSnapshot.child("rating").getValue().toString();
//                    String id = notedataSnapshot.child("id").getValue().toString();
//                    String comment = notedataSnapshot.child("comment").getValue().toString();
//
//                    if(id.equals("1")){
//                        id = "Bandung";
//                    }else{
//                        id = "Jogja";
//                    }
//                    buffer.append("ID : "+ id + "\n");
//                    buffer.append("Comment : "+ comment + "\n");
//                    buffer.append("Rating: "+ rating + "\n");
//
//
//                } showMessage("data found",buffer.toString());
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                showMessage("error",databaseError.getMessage());
//            }
//        });
        Intent intent = new Intent(this, ShowRatingAll.class);
        startActivity(intent);
    }


    public void showReview(View view) {
    }
}



