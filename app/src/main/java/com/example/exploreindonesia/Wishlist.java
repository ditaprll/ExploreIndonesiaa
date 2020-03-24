package com.example.exploreindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Wishlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);
        Intent get = getIntent();
    }

    public void button2(View view) {
        Intent intent = new Intent ();
    }

    public void button(View view) {
        Intent intent2 = new Intent ();
    }
}
