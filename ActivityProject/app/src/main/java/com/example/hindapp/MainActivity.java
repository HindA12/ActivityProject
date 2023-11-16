package com.example.hindapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Snackbar.make(findViewById(android.R.id.content), "Activite est creee", Snackbar.LENGTH_SHORT).show();
        Log.i("onCreate():", "Activite est creee");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Snackbar.make(findViewById(android.R.id.content), "Activite est demarree", Snackbar.LENGTH_SHORT).show();
        Log.i("onStart():", "Activite est demarree");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Snackbar.make(findViewById(android.R.id.content), "Activite est redemarree", Snackbar.LENGTH_SHORT).show();
        Log.i("onRestart():", "Activite est redemarree");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Snackbar.make(findViewById(android.R.id.content), "Activite est reprise", Snackbar.LENGTH_SHORT).show();
        Log.i("onResume():", "Activite est reprise");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Snackbar.make(findViewById(android.R.id.content), "Activite est en pause", Snackbar.LENGTH_SHORT).show();
        Log.i("onPause():", "Activite est en pause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Snackbar.make(findViewById(android.R.id.content), "Activite est stoppee", Snackbar.LENGTH_SHORT).show();
        Log.i("onStop():", "Activite est stoppee");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Snackbar.make(findViewById(android.R.id.content), "Activite est detruite", Snackbar.LENGTH_SHORT).show();
        Log.i("onDestroy():", "Activite est detruite");
    }

}