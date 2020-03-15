package com.example.exploreindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.analytics.FirebaseAnalytics;

public class Login extends AppCompatActivity {
//    private FirebaseAnalytics mFirebaseAnalytics;
    private EditText password;
    private EditText Email;
    private String pass;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        password = (EditText) findViewById(R.id.password);
        Email = (EditText) findViewById(R.id.email);

    }

    public void Loginn(View view) {
        pass = password.getText().toString();
        email = Email.getText().toString();

        if((pass.equals("12345")) && (email.equalsIgnoreCase("123@gmail.com"))){
            Log.d("Login sukses", "Cus");
            Intent i = new Intent(Login.this,Register.class);
            startActivity(i);
        }else{
            Intent i = new Intent(this,Login.class);
            startActivity(i);
        }
    }

    public void LoginFB(View view) {

    }

    public void LoginGmail(View view) {
    }
}
