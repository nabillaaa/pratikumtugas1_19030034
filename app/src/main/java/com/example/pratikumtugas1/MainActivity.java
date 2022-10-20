package com.example.pratikumtugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Input (View view) {
        EditText inputnamatimA = findViewById(R.id.TimA);
        EditText inputnamatimB = findViewById(R.id.TimB);

        String namatimA = inputnamatimA.getText().toString();
        Log.d(TAG, namatimA);
        String namatimB = inputnamatimB.getText().toString();
        Log.d(TAG, namatimB);

        Intent intent = new Intent(this, skor.class);
        intent.putExtra("Tim A", namatimA);
        intent.putExtra("Tim B", namatimB);
        startActivity(intent);    }
}


