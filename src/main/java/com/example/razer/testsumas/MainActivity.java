package com.example.razer.testsumas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , buttonPoint , buttonC , buttonEqual ;

    EditText Resultado ;

    float num1 , num2 ;

    boolean esSuma , esResta ,esMulti ,esDiv, esResul ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPoint = (Button) findViewById(R.id.buttonpoint);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        Resultado = (EditText) findViewById(R.id.Resultado);
        final Controller cont = new Controller();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+"0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Resultado == null){
                    Resultado.setText("");
                }else {
                    num1 = Float.parseFloat(Resultado.getText() + "");
                    esSuma = true;
                    Resultado.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(Resultado.getText() + "");
                esResta = true ;
                Resultado.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(Resultado.getText() + "");
                esMulti = true ;
                Resultado.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(Resultado.getText()+"");
                esDiv = true ;
                Resultado.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num2 = Float.parseFloat(Resultado.getText() + "");
                }catch(Exception e){
                    Resultado.setText("Syntax Error");
                }

                if (esSuma == true){

                    Resultado.setText(cont.suma(num1,num2) +"");
                    esSuma=false;
                }


                if (esResta == true){
                    Resultado.setText(cont.resta(num1,num2)+"");
                    esResta=false;
                }

                if (esMulti == true){
                    Resultado.setText(cont.multiplicacion(num1,num2)+"");
                    esMulti=false;
                }

                if (esDiv == true){
                    if(num2 != 0){
                        Resultado.setText(cont.division(num1,num2)+"");
                        esDiv=false;
                    }else{
                        Resultado.setText("Syntax Error");
                        esDiv=false;
                    }
                }
                esResul = true;
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resultado.setText("");
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esResul();
                Resultado.setText(Resultado.getText()+".");
            }
        });
    }
    
    public void esResul(){
        if(esResul){
            Resultado.setText("");
            esResul = false;
        }
    }



}