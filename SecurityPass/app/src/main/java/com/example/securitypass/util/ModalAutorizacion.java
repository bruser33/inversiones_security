package com.example.securitypass.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.securitypass.Dashboard;
import com.example.securitypass.Pin_propio;
import com.example.securitypass.R;


public class ModalAutorizacion extends Activity {
    TextView primero;
    TextView ultimo ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modal_transferencia);
        this.ultimo= (TextView)findViewById(R.id.primero43);
        this.primero= (TextView)findViewById(R.id.primero28);
        this.primero.requestFocus();

        TextView err= (TextView) findViewById(R.id.error);
        String mensaje = getIntent().getStringExtra("error");
        err.setText(mensaje);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*.85),(int)(height*.55));
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x =0;
        params.y = -20;
        getWindow().setAttributes(params);
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
            finish();

            }
        });
    }
    public void ok(View v){
        this.finish();
    }

}
