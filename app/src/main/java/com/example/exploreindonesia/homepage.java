package com.example.exploreindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void bttnLogin(View view) {
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }

    public void bttnRegist(View view) {
        Intent intent = new Intent(this, Informasi.class);
        startActivity(intent);
    }
}
