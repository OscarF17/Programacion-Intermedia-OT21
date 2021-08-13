//Escuder�a #1. Diego Paredes, Jessica Delgado y Oscar Flores.
//Objetivo: Programa que calcula los t�rminos de una serie y los suma mientras estos sean mayores a un n�mero.

import java.io.*;
import java.util.*;

//Replit forzosamente pide que la clase se llame Main.
class Serie {
  //Clase main.
  public static void main(String[] args) {
    short n=1; 
    double acum=1; 
    double x=Serie.pedirVerificarX(); 
    boolean continuar = true;
    acum = Serie.calcularResultado(n, acum, x, continuar);
    Serie.desplegar(acum);
  }

   //M�todo que llama a los dem�s m�todos para realizar la serie.   
   public static double calcularResultado(short n, double acum, double x, boolean continuar){
     do{
      double termino=Serie.calcularTermino(x,n);
      continuar=Serie.verificarTermino(termino);
      if(continuar==true){
        acum=Serie.sumar(acum, termino);
        n++;
      }
    }while (continuar==true);
    return acum;
  }
  
  //M�todo para pedir el valor de X. Verifica si est� entre 0 y 1 incluidos.
  public static double pedirVerificarX(){
    double x;
    Scanner s= new Scanner(System.in);
    do{
      System.out.println("Ingrese el valor de x");
      x=s.nextDouble();
      if (x>1 || x<0)
        System.out.println("Ingrese un numero entre 0 y 1");
    }while (x>1 || x<0);
    return x;
  }
  
  //M�todo para calcular el valor del termino que se va a sumar
  public static double calcularTermino(double x, short n){
    long acum2 = 1;
    for (int i = n; i>1; i--){
      acum2 *= i;
    }
    double termino = Math.pow(x, n)/acum2;
    return termino;
  }

  //M�todo para verificar que el termino sea mayor a 10^-8
  public static boolean verificarTermino(double termino){
    if (termino > Math.pow(10, -8))
      return true;
    else 
      return false; 
  }

  //M�todo para sumar el acmulador de la serie con el t�rmino calculado. Devuelve el nuevo valor del acumulador.
  public static double sumar(double acum, double termino){
    acum+=termino;
    return acum;
  }

  //M�todo para imprimir el resultado de la serie.
  public static void desplegar(double acum){
    System.out.println("El resultado de la serie es: "+acum);
    }
}