package com.example.hindapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class TroisiemeActivite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troisieme_activite);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nom = extras.getString("Hind");
            String prenom = extras.getString("Allaoui");

            if (nom != null && prenom != null) {
                String message = "Nom et prénom : " + nom + " " + prenom;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        }
    }
}