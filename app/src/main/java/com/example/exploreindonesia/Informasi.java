package com.example.exploreindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Informasi extends AppCompatActivity {

    private EditText btnLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        //sesuaikan intent home untuk pengambilan data lokasi wisata
        getSupportActionBar().setTitle("Nama Lokasi Wisata");

    }

    public void btnwishlist(View view) {
        //butuh query sqlite untuk wishlist
        Toast.makeText(this, "Wishlist ditambahkan", Toast.LENGTH_SHORT).show();

    }

    public void btnlocation(View view) {
        //Butuh nama lokasi spesifik dari home
        String loc = "Kawah Putih";
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }

    }
}
