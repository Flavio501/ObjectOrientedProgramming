package com.example.razer.testsumas;

public class Controller extends MainActivity {
    public String helloWorld() {
        return "Hello World Reloaded";
    }

    public float suma(float num1, float num2) {
        return num1+num2;
    }

    public float resta(float num1, float num2){
        return num1-num2;
    }
    public float division(float num1, float num2){
        return num1/num2;
    }
    public float multiplicacion(float num1, float num2){
        return num1*num2;
    }
}
