package com.example.securitypass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.beardedhen.androidbootstrap.TypefaceProvider;
import com.example.securitypass.util.ModalAutorizacion;

public class Autorizacion extends AppCompatActivity {
    Intent modalAutorizacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autorizacion);
        TypefaceProvider.registerDefaultIconSets();
        this.modalAutorizacion= new Intent(this, ModalAutorizacion.class);

    }
    public void transferir(View v){
        this.modalAutorizacion.putExtra("error", "Introduce tu pin para aprobar la transferencia");
        startActivity(modalAutorizacion);
    }
}
