package com.example.securitypass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.beardedhen.androidbootstrap.TypefaceProvider;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        TypefaceProvider.registerDefaultIconSets();
    }
    public void autorizar(View v) {
        Intent intent = new Intent(this, Autorizacion.class);
        startActivity(intent);
    }
}
