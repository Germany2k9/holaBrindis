package com.germany.holabrindis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtContador;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txtContador = findViewById(R.id.txtContador);
         contador=0;

    }

    public void mostrarSaludo(View view) {
        Toast.makeText(this, R.string.saludo, Toast.LENGTH_SHORT).show();
    }

    public void actualizarContador(View view) {
        contador++;
        txtContador.setText(Integer.toString(contador));
    }
}