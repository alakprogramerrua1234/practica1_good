package com.example.samirvega.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mlado,maltura,mbase,mradio,marea,mperimetro,mvolumen;
    RadioButton mcuadro,mtriangulo,mcirculo,mcubo;
    String texto1="",texto2="";
    double data1=0,data2=0;
    int fig=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlado= findViewById(R.id.ladoid);
        maltura=findViewById(R.id.alturaid);
        mbase=findViewById(R.id.baseid);
        mradio=findViewById(R.id.radioid);
        marea=findViewById(R.id.areaid);
        mperimetro=findViewById(R.id.perimetroid);
        mvolumen=findViewById(R.id.volumenid);
        mtriangulo=findViewById(R.id.trianguloid);
        mcirculo=findViewById(R.id.circuloid);
        mcubo=findViewById(R.id.cuboid);
        mcuadro=findViewById(R.id.cuadroid);
        mradio.setVisibility(View.INVISIBLE);
        maltura.setVisibility(View.INVISIBLE);
        mlado.setVisibility(View.INVISIBLE);
        mbase.setVisibility(View.INVISIBLE);
    }


    public void onRadioButtonClicked(View view) {
        switch (view.getId()){
            case R.id.cuadroid:
                if(mcuadro.isChecked()){
                   fig = view.getId();
                    mradio.setVisibility(View.INVISIBLE);
                    maltura.setVisibility(View.INVISIBLE);
                    mlado.setVisibility(View.VISIBLE);
                    mbase.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.circuloid:
                if(mcirculo.isChecked()){
                    fig = view.getId();
                    mradio.setVisibility(View.VISIBLE);
                    maltura.setVisibility(View.INVISIBLE);
                    mlado.setVisibility(View.INVISIBLE);
                    mbase.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.trianguloid:
                if(mtriangulo.isChecked()){
                    fig = view.getId();
                    mradio.setVisibility(View.INVISIBLE);
                    maltura.setVisibility(View.VISIBLE);
                    mlado.setVisibility(View.INVISIBLE);
                    mbase.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cuboid:
                if(mcubo.isChecked()){
                    fig = view.getId();
                    mradio.setVisibility(View.INVISIBLE);
                    maltura.setVisibility(View.INVISIBLE);
                    mlado.setVisibility(View.VISIBLE);
                    mbase.setVisibility(View.INVISIBLE);
                }
                break;
        }

    }

    public void BotonPulsado(View view) {

        switch (fig){
            case R.id.cuadroid:
                if(mcuadro.isChecked()){
                    texto1=mlado.getText().toString();
                    if(texto1.matches("")) {
                        Toast.makeText(getApplicationContext(), "Faltan datos", Toast.LENGTH_SHORT).show();
                    }else {
                        data1 = Double.parseDouble(mlado.getText().toString());
                        data2 = Double.parseDouble(mlado.getText().toString());
                        data1 = data1 * data1;
                        data2 = data2 * 4;
                        marea.setText(String.valueOf(data1));
                        mperimetro.setText(String.valueOf(data2));
                    }
                }
                break;
            case R.id.circuloid:
                if(mcirculo.isChecked()) {
                    texto1 = mradio.getText().toString();
                    if (texto1.matches("")) {
                        Toast.makeText(getApplicationContext(), "Faltan datos", Toast.LENGTH_SHORT).show();
                    } else {
                        data1 = Double.parseDouble(mradio.getText().toString());
                        data2 = Double.parseDouble(mradio.getText().toString());
                        data1 = data1 * 2 * 3.14159;
                        data2 = data2 * data2 * 3.14159;
                        marea.setText(String.valueOf(data2));
                        mperimetro.setText(String.valueOf(data1));
                    }
                }


            case R.id.trianguloid:
                if(mtriangulo.isChecked()) {
                    texto1 = maltura.getText().toString();
                    texto2 = mbase.getText().toString();
                    if (texto1.matches("") || texto2.matches("")) {
                        Toast.makeText(getApplicationContext(), "Faltan datos", Toast.LENGTH_SHORT).show();
                    } else {
                        data1 = Double.parseDouble(maltura.getText().toString());
                        data2 = Double.parseDouble(mbase.getText().toString());
                        data1 = data1 * data2 / 2;
                        data2 = data2 * 1;
                        marea.setText(String.valueOf(data1));
                        mperimetro.setText(String.valueOf(data2));
                    }
                }

            case R.id.cuboid:
                if(mcubo.isChecked()) {
                    texto1 = mlado.getText().toString();
                    if (texto1.matches("")) {
                        Toast.makeText(getApplicationContext(), "Faltan datos", Toast.LENGTH_SHORT).show();
                    } else {
                        data1 = Double.parseDouble(mlado.getText().toString());
                        data1 = data1 * data1 * data1;
                        mvolumen.setText(String.valueOf(data1));
                    }
                }
        }
    }
}
