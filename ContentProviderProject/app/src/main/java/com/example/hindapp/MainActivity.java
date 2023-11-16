package com.example.hindapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.content.ContentValues;
import android.database.Cursor;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickAjouterNoteInptiste(View view) {
        // Ajouter une note d etudiant
        ContentValues values = new ContentValues();
        values.put(InptisteProvider.NOM,
                ((EditText)findViewById(R.id.nom)).getText().toString());
        values.put(InptisteProvider.NOTE,
                ((EditText)findViewById(R.id.note)).getText().toString());
        values.put(InptisteProvider.FILIERE,
                ((EditText)findViewById(R.id.filiere)).getText().toString());
        values.put(InptisteProvider.CIN,
                ((EditText)findViewById(R.id.cin)).getText().toString());
        Uri uri = getContentResolver().insert(
                InptisteProvider.CONTENT_URI, values);
        assert uri != null;
        Toast.makeText(getBaseContext(),
                uri.toString(), Toast.LENGTH_LONG).show();
    }
    public void onClickRetrouverNotesInptistes(View view) {
        // Retrouver les notes des etudiants
        String URL = "content://com.example.applicationbasedonnees.InptisteProvider";
        Uri inptistes = Uri.parse(URL);
        Cursor c;
        c = getContentResolver().query(inptistes, null, null, null, "nom");
        assert c != null;
        if (c.moveToFirst()) {
            do Toast.makeText(this, c.getString(c.getColumnIndexOrThrow(InptisteProvider._ID)) + "; " + c.getString(c.getColumnIndexOrThrow(InptisteProvider.NOM)) + "; " + c.getString(c.getColumnIndexOrThrow(InptisteProvider.NOTE)), Toast.LENGTH_SHORT).show();
            while (c.moveToNext());
        }
    }
}