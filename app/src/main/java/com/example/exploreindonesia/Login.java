package com.example.exploreindonesia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private EditText password;
    private EditText Email;
    private String pass;
    private String email;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        password = (EditText) findViewById(R.id.password);
        Email = (EditText) findViewById(R.id.email);
        mAuth = FirebaseAuth.getInstance();
        
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
        Intent w = new Intent(Login.this,Wishlist.class);
        startActivity(w);
    }
}
