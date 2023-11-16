package com.example.hindapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bouton_explicite, bouton_implicite, bouton_explicite1, bouton_implicite1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bouton_explicite = (Button)findViewById(R.id.button);
        bouton_implicite = (Button) findViewById(R.id.button2);
        bouton_explicite1 = (Button)findViewById(R.id.button3);
        bouton_explicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), DeuxiemeActivite.class);
                intent.putExtra("nom", "Allaoui");
                intent.putExtra("prenom", "Hind");
                startActivity(intent);
            }
        });
        bouton_implicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.inpt.ac.ma"));
                startActivity(intent);
            }
        });
        bouton_explicite1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), TroisiemeActivite.class);
                startActivity(intent);
            }
        });
        bouton_implicite1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.gmail.com"));
                startActivity(intent);
            }
        });
    }
}