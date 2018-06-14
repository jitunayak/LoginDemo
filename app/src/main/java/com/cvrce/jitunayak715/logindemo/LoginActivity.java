package com.cvrce.jitunayak715.logindemo;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import jp.wasabeef.blurry.Blurry;

public class LoginActivity extends AppCompatActivity {

    TextView FogotPassword;
    Dialog popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        popup = new Dialog(this);
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(),SecondActivity.class);
                startActivity(it);
            }
        });

    }

    public void ShowPopup(View v)
    {
        popup.setContentView(R.layout.fragment_buttom_sheet);
        popup.show();

    }
}
