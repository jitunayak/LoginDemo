package com.cvrce.jitunayak715.logindemo;

import android.content.Intent;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class SecondActivity extends AppCompatActivity {

    Switch darkmode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.darktheme);
        } else
            setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        darkmode = findViewById(R.id.themetool);

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES)
            darkmode.setChecked(true);
        else
            darkmode.setChecked(false);
        darkmode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if (isChecked) {


                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    restartApp();

                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    restartApp();
                }
            }
        });
    }

    private void restartApp() {
        Intent in = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(in);
        finish();
    }

    public void showtoast(View view) {
        Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();
        Toasty.error(getApplicationContext(), "This is an error toast.", Toast.LENGTH_SHORT, true).show();
        Toasty.info(getApplicationContext(), "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
        Toasty.warning(getApplicationContext(), "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
       // Toasty.normal(getApplicationContext(), "Normal toast w/ icon", ).show();
    }
}
