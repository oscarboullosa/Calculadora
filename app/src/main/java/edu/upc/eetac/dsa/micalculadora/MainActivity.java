package edu.upc.eetac.dsa.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView pantalla;
    float numeroUno=0.0f;
    float numeroDos=0.0f;
    String operacion="";
    String grados="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla=findViewById(R.id.textView);
    }

    public void EscribirCero(View view) {
        if(pantalla.getText()=="0"){
            pantalla.setText("0");
        }
        else{
            pantalla.setText(pantalla.getText()+"0");
        }
    }

    public void EscribirUno(View view) {
        if(pantalla.getText()=="0"){
            pantalla.setText("1");
        }
        else{
            pantalla.setText(pantalla.getText()+"1");
        }
    }

    public void EscribirDos(View view) {
        if(pantalla.getText()=="0"){
            pantalla.setText("2");
        }
        else{
            pantalla.setText(pantalla.getText()+"2");
        }
    }

    public void EscribirTres(View view) {
        if(pantalla.getText()=="0"){
            pantalla.setText("3");
        }
        else{
            pantalla.setText(pantalla.getText()+"3");
        }
    }

    public void EscribirCuatro(View view) {
        if(pantalla.getText()=="0"){
            pantalla.setText("4");
        }
        else{
            pantalla.setText(pantalla.getText()+"4");
        }
    }

    public void EscribirCinco(View view) {
        if(pantalla.getText()=="0"){

            pantalla.setText("5");
        }
        else{
            pantalla.setText(pantalla.getText()+"5");
        }
    }

    public void EscribirSeis(View view) {
        if(pantalla.getText()=="0"){
            pantalla.setText("6");
        }
        else{
            pantalla.setText(pantalla.getText()+"6");
        }
    }

    public void EscribirSiete(View view) {
        if(pantalla.getText() == "0"){
            pantalla.setText("7");
        }
        else{
            pantalla.setText(pantalla.getText()+"7");
        }
    }

    public void EscribirOcho(View view) {
        if(pantalla.getText()=="0"){
            pantalla.setText("8");
        }
        else{
            pantalla.setText(pantalla.getText()+"8");
        }
    }

    public void EscribirNueve(View view) {
        if(pantalla.getText()=="0"){
            pantalla.setText("9");
        }
        else{
            pantalla.setText(pantalla.getText()+"9");
        }
    }

    public void Borrar(View view) {
        pantalla.setText("0");
        numeroUno=0.0f;
        numeroDos=0.0f;
        operacion="";
    }

    public void Division(View view) {
        numeroUno=Float.parseFloat(pantalla.getText().toString());
        operacion="/";
        pantalla.setText("0");

    }

    public void Igual(View view) {
        numeroDos = Float.parseFloat(pantalla.getText().toString());
        if (operacion.equals("/")) {
            if (numeroDos == 0.0f) {
                pantalla.setText("0");
                Toast.makeText(this, "No te recomiendo dividir entre 0...", Toast.LENGTH_LONG).show();

            } else {
                float resultado = numeroUno;
                pantalla.setText(resultado + "");
            }
        }
        if (operacion.equals("*")) {
            float result = numeroUno * numeroDos;
            String resultado = Float.toString(result);
            pantalla.setText(resultado);
        }
        if (operacion.equals("+")) {
            float result = numeroUno + numeroDos;
            String resultado = Float.toString(result);
            pantalla.setText(resultado);
        }
        if (operacion.equals("-")) {
            float result = numeroUno - numeroDos;
            String resultado = Float.toString(result);
            pantalla.setText(resultado);
        }
        if (operacion.equals("sin")){
            if(grados.equals("grados")){
                numeroDos= (float) (numeroDos*Math.PI/180);
                double result= Math.sin(numeroDos);
                String resultado=Double.toString(result);
                pantalla.setText(resultado);
            }
            else {
                double result = Math.sin(numeroDos);
                String resultado = Double.toString(result);
                pantalla.setText(resultado);
            }
        }
        if (operacion.equals("cos")){
            if(grados.equals("grados")){
                numeroDos= (float) (numeroDos*Math.PI/180);
                double result= Math.cos(numeroDos);
                String resultado=Double.toString(result);
                pantalla.setText(resultado);
            }
            else {
                double result = Math.cos(numeroDos);
                String resultado = Double.toString(result);
                pantalla.setText(resultado);
            }
        }
        if (operacion.equals("tan")){
            if (numeroDos == 0.0f) {
                pantalla.setText("0");
                Toast.makeText(this, "No te recomiendo dividir entre 0...", Toast.LENGTH_LONG).show();
            }
            else {
                if (grados.equals("grados")) {
                    numeroDos = (float) (numeroDos * Math.PI / 180);
                    double result = Math.tan(numeroDos);
                    String resultado = Double.toString(result);
                    pantalla.setText(resultado);
                } else {
                    double result = Math.tan(numeroDos);
                    String resultado = Double.toString(result);
                    pantalla.setText(resultado);
                }
            }
        }
    }

    public void Multiplicacion(View view) {
        numeroUno=Float.parseFloat(pantalla.getText().toString());
        operacion="*";
        pantalla.setText("0");
    }

    public void Suma(View view) {
        numeroUno=Float.parseFloat(pantalla.getText().toString());
        operacion="+";
        pantalla.setText("0");
    }

    public void Resta(View view) {
        numeroUno=Float.parseFloat(pantalla.getText().toString());
        operacion="-";
        pantalla.setText("0");

    }

    public void Decimal(View view) {
        pantalla.setText(pantalla.getText()+".");
    }

    public void seno(View view) {
        numeroUno=Float.parseFloat(pantalla.getText().toString());
        operacion="sin";
        pantalla.setText("0");
    }

    public void coseno(View view) {
        numeroUno=Float.parseFloat(pantalla.getText().toString());
        operacion="cos";
        pantalla.setText("0");
    }

    public void tangente(View view) {
        numeroUno=Float.parseFloat(pantalla.getText().toString());
        operacion="tan";
        pantalla.setText("0");
    }
    public void Grados(View view) {
        grados="grados";
    }

}