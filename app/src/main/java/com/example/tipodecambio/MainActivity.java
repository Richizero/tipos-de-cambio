package com.example.tipodecambio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // creamos los elementos (id) que usaremos para la interfaz
    private EditText pesosMexicanos;
    private Button calcular;
    private TextView dolares;
    private TextView yenes;
    private TextView pesosChilenos;
    private TextView librasEsterlinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    // aqui conectaremos lo que es la interfaz con esta clase
    private void init() {
        pesosMexicanos = (EditText) findViewById(R.id.editTextpesosMexicanos);
        calcular = (Button) findViewById(R.id.buttonCalcular);
        dolares = (TextView) findViewById(R.id.Dolares);
        yenes = (TextView) findViewById(R.id.Yenes);
        pesosChilenos = (TextView) findViewById(R.id.PesosChilenos);
        librasEsterlinas = (TextView) findViewById(R.id.LibrasEsterlinas);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularDivisas();
            }
        });
    }

    // aqui pondremos el metodo para calcular los dif tipos de divisas
    private void calcularDivisas() {
        Double pesoMex = Double.parseDouble(pesosMexicanos.getText().toString());

        dolares.setText("Dólares: " + TiposDeCambio.pesoMexDolar(pesoMex));
        yenes.setText("Yenes: " + TiposDeCambio.pesoMexYen(pesoMex));
        pesosChilenos.setText("Pesos Chilenos: " + TiposDeCambio.pesoMexPesoCh(pesoMex));
        librasEsterlinas.setText("Libras esterlinas: " + TiposDeCambio.pesoMexLibra(pesoMex));
    }
}