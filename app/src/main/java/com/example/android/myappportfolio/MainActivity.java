package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button popularMovieButton = (Button) findViewById(R.id.popular_movies_button);
        popularMovieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_text) + popularMovieButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        final Button stockHawkButton = (Button) findViewById(R.id.stock_hawk_button);
        stockHawkButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_text) + stockHawkButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        final Button buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_text) + buildItBiggerButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        final Button makeYourAppMaterialButton = (Button) findViewById(R.id.make_your_app_material_button);
        makeYourAppMaterialButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_text) + makeYourAppMaterialButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        final Button goUbiquitousButton = (Button) findViewById(R.id.go_ubiquitous_button);
        goUbiquitousButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_text) + goUbiquitousButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        final Button capstoneButton = (Button) findViewById(R.id.capstone_button);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_text) + capstoneButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
