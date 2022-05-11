package com.example.ejercicio2_guia2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText horas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText)findViewById(R.id.TxtNombre);
        horas=(EditText)findViewById(R.id.TxtHoras);




        Button info = findViewById(R.id.CalculoSalario);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (v.getContext(), CalculosSalario.class);
                startActivityForResult(i, 0);
                i.putExtra("TxtNombre",nombre.getText().toString());

                startActivity(i);
            }
        });
    }
}