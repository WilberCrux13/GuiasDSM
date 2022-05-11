package com.example.ejercicio2_guia2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculosSalario extends AppCompatActivity {
 private TextView TvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_salario);

        TvNombre=(TextView)findViewById(R.id.TxtViewNombre);

        Bundle bundle = getIntent().getExtras();
        String nombre =bundle.getString("TxtNombre");

        TvNombre.setText(nombre);
    }
}