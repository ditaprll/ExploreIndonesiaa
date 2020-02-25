package com.example.exploreindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

public class Login extends AppCompatActivity {
//    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    public void Loginn(View view) {

    }

    public void LoginFB(View view) {
        Intent i = new Intent(Login.this,Register.class);
        startActivity(i);
    }

    public void LoginGmail(View view) {

    }
}
