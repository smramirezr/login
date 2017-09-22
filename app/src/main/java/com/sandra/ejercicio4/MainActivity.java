package com.sandra.ejercicio4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton;
    EditText text, text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settingElements();
        boton.setOnClickListener(this);
    }

    private void settingElements() {
        boton = (Button) findViewById(R.id.Actividad2);
        text = (EditText) findViewById(R.id.editTextusu);
        text2 = (EditText) findViewById(R.id.editTextpass);
    }

    @Override
    public void onClick(View view) {
        if (text2.getText().toString().equals("admin")) {
            if (text.getText().toString().equals("admin")) {
                Intent intent = new Intent(this, Actividad2.class);
                startActivity(intent);
            }
        }
            else if (text.getText().toString().isEmpty() || text2.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this, "uno o mas campos están vacios", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "usuario y/o contraseña incorrectos, ingrese los datos nuevamente", Toast.LENGTH_SHORT).show();

            }
        }
    }






