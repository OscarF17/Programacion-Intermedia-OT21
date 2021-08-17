//Oscar Luciano Flores Leija 570390
//Objetivo: Calculadora que divide dos números

import java.io.*;
import java.util.*;

class CalculadoraFracciones{
    //Método Main. Todas las variables son double para permitir el uso de cualquier número, decimal y entero, independientemente del tamaño.
    public static void main(String args[]){
        double n1=pedirN1();
        double d1=pedirD1();
        double resultado=dividirND(n1, d1);
        desplegarResultado(resultado);
   }
    //Método para pedir numerador de la operación
    public static double pedirN1(){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese numerador de la operación");
        double n1=s.nextDouble();
        return n1;
    }
    //Método para pedir denominador de la operación. Solo permite números distintos a 0.
    public static double pedirD1(){
        Scanner s=new Scanner(System.in);
        double d1=0;
        while(d1==0){
            System.out.println("Ingrese denominador de la operación (debe de ser distinto a 0)");
            d1=s.nextDouble();
            if(d1==0)
                System.out.println("¡El denominador no puede ser igual a 0!");
        }
        return d1;
    }
    //Método que divide a los números ingresados.
    public static double dividirND(double n1, double d1){
        return n1/d1;
    }
    //Método que despliega el resultado.
    public static void desplegarResultado(double resultado) {
        System.out.println("El resultado de la división es: "+resultado);
    }
}