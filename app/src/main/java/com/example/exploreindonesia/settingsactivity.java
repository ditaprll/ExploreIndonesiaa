package com.example.exploreindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class settingsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new settingsfragment())
                .commit();


    }
}
