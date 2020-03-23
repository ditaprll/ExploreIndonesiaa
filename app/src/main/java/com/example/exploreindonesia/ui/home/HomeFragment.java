package com.example.exploreindonesia.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.exploreindonesia.R;
import com.example.exploreindonesia.papua;
import com.example.exploreindonesia.jawa_barat;
import com.example.exploreindonesia.bengkulu;


public class HomeFragment extends Fragment {

    private RelativeLayout jawa_barat;
    private RelativeLayout aceh;
    private RelativeLayout maluku;
    private RelativeLayout banten;
    private RelativeLayout bengkulu;
    private RelativeLayout jakarta;
    private RelativeLayout jawa_tengah;
    private RelativeLayout kalimantan_barat;
    private RelativeLayout kalimantan_selatan;
    private RelativeLayout kalimantan_tengah;
    private RelativeLayout kalimantan_timur;
    private RelativeLayout kalimantan_utara;
    private RelativeLayout kepulauan_bangka_belitung;
    private RelativeLayout kepulauan_riau;
    private RelativeLayout lampung;
    private RelativeLayout maluku_utara;
    private RelativeLayout jambi;
    private RelativeLayout papua;
    private RelativeLayout bali;
    private RelativeLayout jawa_timur;
    private RelativeLayout gorontalo;
    private RelativeLayout nusa_tenggara_timur;
    private RelativeLayout papua_barat;
    private RelativeLayout riau;
    private RelativeLayout sulawesi_barat;
    private RelativeLayout sulawesi_selatan;
    private RelativeLayout sulawesi_tengah;
    private RelativeLayout sulawesi_tenggara;
    private RelativeLayout sulawesi_utara;
    private RelativeLayout sumatera_barat;
    private RelativeLayout sumatera_selatan;
    private RelativeLayout sumatera_utara;
    private RelativeLayout yogyakarta;
    private RelativeLayout nusa_tenggara_barat;


    private LinearLayout mLinearLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.navigation_home);

        jawa_barat = (RelativeLayout) rootView.findViewById(R.id.jawa_barat);
        jawa_barat.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast.makeText(getActivity(), "klick me" , Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.jawa_barat.class);
                startActivity(goPindah);
            }
        });

        aceh = (RelativeLayout) rootView.findViewById(R.id.aceh);
        aceh.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast.makeText(getActivity(), "klick me" , Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.aceh.class);
                startActivity(goPindah);
            }
        });

        banten = (RelativeLayout) rootView.findViewById(R.id.banten);
        banten.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast.makeText(getActivity(), "klick me" , Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.banten.class);
                startActivity(goPindah);
            }
        });

        maluku = (RelativeLayout) rootView.findViewById(R.id.maluku);
        maluku.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast.makeText(getActivity(), "klick me" , Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.maluku.class);
                startActivity(goPindah);
            }
        });

        bali = (RelativeLayout) rootView.findViewById(R.id.bali);
        bali.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.bali.class);
                startActivity(goPindah);
            }
        });
        bengkulu = (RelativeLayout) rootView.findViewById(R.id.bengkulu);
        bengkulu.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.bengkulu.class);
                startActivity(goPindah);
            }
        });
        jakarta = (RelativeLayout) rootView.findViewById(R.id.jakarta);
        jakarta.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.jakarta.class);
                startActivity(goPindah);
            }
        });
        jawa_tengah = (RelativeLayout) rootView.findViewById(R.id.jawa_tengah);
        jawa_tengah.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.jawa_tengah.class);
                startActivity(goPindah);
            }
        });
        kalimantan_barat = (RelativeLayout) rootView.findViewById(R.id.kalimantan_barat);
        kalimantan_barat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.kalimantan_barat.class);
                startActivity(goPindah);
            }
        });
        kalimantan_selatan = (RelativeLayout) rootView.findViewById(R.id.kalimantan_selatan);
        kalimantan_selatan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.kalimantan_selatan.class);
                startActivity(goPindah);
            }
        });
        kalimantan_tengah = (RelativeLayout) rootView.findViewById(R.id.kalimantan_tengah);
        kalimantan_tengah.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.kalimantan_tengah.class);
                startActivity(goPindah);
            }
        });
        kalimantan_timur = (RelativeLayout) rootView.findViewById(R.id.kalimantan_timur);
        kalimantan_timur.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.kalimantan_timur.class);
                startActivity(goPindah);
            }
        });
        kalimantan_utara = (RelativeLayout) rootView.findViewById(R.id.kalimantan_utara);
        kalimantan_utara.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.kalimantan_utara.class);
                startActivity(goPindah);
            }
        });
        kepulauan_bangka_belitung = (RelativeLayout) rootView.findViewById(R.id.kepulauan_bangka_belitung);
        kepulauan_bangka_belitung.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.kepulauan_bangka_belitung.class);
                startActivity(goPindah);
            }
        });
        kepulauan_riau = (RelativeLayout) rootView.findViewById(R.id.kepulauan_riau);
        kepulauan_riau.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.kepulauan_riau.class);
                startActivity(goPindah);
            }
        });
        lampung = (RelativeLayout) rootView.findViewById(R.id.lampung);
        lampung.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.lampung.class);
                startActivity(goPindah);
            }
        });
        maluku_utara = (RelativeLayout) rootView.findViewById(R.id.maluku_utara);
        maluku_utara.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.maluku_utara.class);
                startActivity(goPindah);
            }
        });
        jambi = (RelativeLayout) rootView.findViewById(R.id.jambi);
        jambi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.jambi.class);
                startActivity(goPindah);
            }
        });
        papua = (RelativeLayout) rootView.findViewById(R.id.papua);
        papua.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.papua.class);
                startActivity(goPindah);
            }
        });
        jawa_timur = (RelativeLayout) rootView.findViewById(R.id.jawa_timur);
        jawa_timur.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.jawa_timur.class);
                startActivity(goPindah);
            }
        });
        gorontalo = (RelativeLayout) rootView.findViewById(R.id.gorontalo);
        gorontalo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.gorontalo.class);
                startActivity(goPindah);
            }
        });
        nusa_tenggara_timur = (RelativeLayout) rootView.findViewById(R.id.nusa_tenggara_timur);
        nusa_tenggara_timur.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.nusa_tenggara_timur.class);
                startActivity(goPindah);
            }
        });
        papua_barat = (RelativeLayout) rootView.findViewById(R.id.papua_barat);
        papua_barat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah = new Intent(getActivity(), com.example.exploreindonesia.papua_barat.class);
                startActivity(goPindah);
            }
        });

        nusa_tenggara_barat = (RelativeLayout) rootView.findViewById(R.id.nusa_tenggara_barat);
        nusa_tenggara_barat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah;
                goPindah = new Intent(getActivity(), com.example.exploreindonesia.nusa_tenggara_barat.class);
                startActivity(goPindah);
            }
        });

        riau = (RelativeLayout) rootView.findViewById(R.id.riau);
        riau.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah;
                goPindah = new Intent(getActivity(), com.example.exploreindonesia.riau.class);
                startActivity(goPindah);
            }
        });

        sulawesi_barat = (RelativeLayout) rootView.findViewById(R.id.sulawesi_barat);
        sulawesi_barat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah;
                goPindah = new Intent(getActivity(), com.example.exploreindonesia.sulawesi_barat.class);
                startActivity(goPindah);
            }
        });

        sulawesi_selatan = (RelativeLayout) rootView.findViewById(R.id.sulawesi_selatan);
        sulawesi_selatan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getActivity(), "klick me", Toast.LENGTH_LONG).show();

                Intent goPindah;
                goPindah = new Intent(getActivity(), com.example.exploreindonesia.sulawesi_selatan.class);
                startActivity(goPindah);
            }
        });

        return rootView;
    }
}
