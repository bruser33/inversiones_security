package com.example.securitypass;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.beardedhen.androidbootstrap.TypefaceProvider;

public class Login extends AppCompatActivity {
    TextView primero;
    TextView ultimo ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        TypefaceProvider.registerDefaultIconSets();
        this.ultimo= (TextView)findViewById(R.id.primero10);
        this.primero= (TextView)findViewById(R.id.primero12);
        this.primero.requestFocus();
        this.ultimo.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                Intent intent = new Intent(Login.this, Dashboard.class);
                startActivity(intent);
            }
        });
        KeyguardManager KeyguardManager = getSystemService(android.app.KeyguardManager.class);
        FingerprintManager fingerprintManager = (FingerprintManager) getSystemService(Context.FINGERPRINT_SERVICE);
    }

}
