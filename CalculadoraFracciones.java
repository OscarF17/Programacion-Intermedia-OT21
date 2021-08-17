//Oscar Luciano Flores Leija 570390
//Objetivo: Calculadora que divide dos n�meros

import java.io.*;
import java.util.*;

class CalculadoraFracciones{
    //M�todo Main. Todas las variables son double para permitir el uso de cualquier n�mero, decimal y entero, independientemente del tama�o.
    public static void main(String args[]){
        double n1=pedirN1();
        double d1=pedirD1();
        double resultado=dividirND(n1, d1);
        desplegarResultado(resultado);
   }
    //M�todo para pedir numerador de la operaci�n
    public static double pedirN1(){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese numerador de la operaci�n");
        double n1=s.nextDouble();
        return n1;
    }
    //M�todo para pedir denominador de la operaci�n. Solo permite n�meros distintos a 0.
    public static double pedirD1(){
        Scanner s=new Scanner(System.in);
        double d1=0;
        while(d1==0){
            System.out.println("Ingrese denominador de la operaci�n (debe de ser distinto a 0)");
            d1=s.nextDouble();
            if(d1==0)
                System.out.println("�El denominador no puede ser igual a 0!");
        }
        return d1;
    }
    //M�todo que divide a los n�meros ingresados.
    public static double dividirND(double n1, double d1){
        return n1/d1;
    }
    //M�todo que despliega el resultado.
    public static void desplegarResultado(double resultado) {
        System.out.println("El resultado de la divisi�n es: "+resultado);
    }
}