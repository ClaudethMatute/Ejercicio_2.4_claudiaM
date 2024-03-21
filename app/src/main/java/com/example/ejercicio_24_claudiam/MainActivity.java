package com.example.ejercicio_24_claudiam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btncrear, btnlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncrear = (Button) findViewById(R.id.btncrear);
        btnlista = (Button) findViewById(R.id.btnlista);

        btncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityCrearFirma.class));
            }
        });
        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityListaFirmas.class));
            }
        });
    }
}