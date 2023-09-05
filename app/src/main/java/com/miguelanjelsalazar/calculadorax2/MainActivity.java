package com.miguelanjelsalazar.calculadorax2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText base, altura;
    TextView resultado;
    Button calculo;

    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        esta variable tiene el valor que tengan los inputs (declaradas en el activity_main)
        base = findViewById(R.id.sideone);
        altura = findViewById(R.id.sidetwo);
        resultado = findViewById(R.id.resultado);
        calculo = findViewById(R.id.calcular);

//        se activa cuando se le da click en el botón

        calculo.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                float valueOne = Float.parseFloat(base.getText().toString());
                float  valueTwo = Float.parseFloat(altura.getText().toString());
                result = ((valueOne*valueTwo)/2);
                resultado.setText("El resultado es: " + String.valueOf(result));
            }
        });
    }
}