package com.example.securitypass;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.beardedhen.androidbootstrap.TypefaceProvider;

public class Pin_sms extends AppCompatActivity {
    TextView primero;
    TextView ultimo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pin_sms);
        TypefaceProvider.registerDefaultIconSets();
        this.ultimo= (TextView)findViewById(R.id.primero);
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
                Intent intent = new Intent(Pin_sms.this, Pin_propio.class);
                startActivity(intent);
            }
        });

    }

}
