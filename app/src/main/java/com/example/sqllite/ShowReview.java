package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exploreindonesia.R;

public class ShowReview extends AppCompatActivity {

//    DatabaseHelper myDb;
    private EditText etTitle, etAuthor, etArticle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_review);

        setTitle("Create Article");

//        myDb = new DatabaseHelper(this);
        etTitle = findViewById(R.id.edt_input_title);
        etAuthor = findViewById(R.id.edt_input_author);


    }

    public void clickPost(View view) {

           /* boolean insert = myDb.insertData(etTitle.getText().toString());
            if (insert) {
                etTitle.setText("");
                Toast.makeText(this, "Artikel berhasil di tambahkan", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Artikel gagal di tambahkan", Toast.LENGTH_SHORT).show();

            }*/

        }}