//  @ Autor : Oscar Luciano Flores Leija 570390
//  @ Objetivo : Calcular el peso corporal y masa ideal de un paciente acorde a su género. Utilizar una contraseña para dar acceso al programa.
//  @ Fecha : 27/08/2021 - 31/08/2021

import java.io.*;
import java.util.*;

public class Paciente {
	private char genero;
	private float altura;
	private byte peso;
	
   //Método constructor
   public Paciente(char genero, float altura, byte peso) {
	   this.genero=genero;
      this.altura=altura;
      this.peso=peso;
	}
	
	//Método para calcular la masa corporal del paciente, independiente al género
   public float calcularMasaCorporal() {
      return (float)(peso/Math.pow(altura,2));
	}
	
	//Método para calcular la masa ideal del paciente, depende del género
   public byte calcularMasaIdeal() {
	   byte masaIdeal;
      if(genero=='m'||genero=='M')
         masaIdeal=(byte)((altura*100)-100);
      else
         masaIdeal=(byte)((altura*100)-110);
       return masaIdeal;
	}
   
   //Método para imprimir datos del paciente
   public String toString(){
      return "La masa corporal de este paciente ("+genero +") es de: "+ calcularMasaCorporal()+"\nSu masa ideal es de: "+calcularMasaIdeal()+"\n";
   }
}

class Principal {
   //Método main
   public static void main(String args[]){
      final String PASSWORD="Oscar17*";
      darAcceso(PASSWORD);
      char genero=pedirGenero();
      float altura=pedirAltura();
      byte peso=pedirPeso();
      Paciente p1=new Paciente(genero, altura, peso);
      System.out.println(p1);
      Paciente p2=new Paciente('f', 1.60f, (byte)50);
      System.out.println(p2);
   }
   
   //Método para dar acceso al programa usando la contraseña establecida, pide que se ingrese la contraseña hasta que esta sea correcta
   public static void darAcceso(String PASSWORD){
      Scanner s=new Scanner(System.in);
      String input;
      do{
         System.out.print("Contraseña: ");
         input=s.next();
      }while(!(input.equals(PASSWORD)));
   }
   
   //Método para pedir género del paciente
   public static char pedirGenero(){
      Scanner s=new Scanner(System.in);
      char genero;
      do{
         System.out.println("Ingrese la inicial de su género, m para masculino y f para femenino");
         genero=s.next().charAt(0);
         if(!(genero=='f'|| genero=='F'||genero=='m'|| genero=='M'))
            System.out.println("Ingrese una inicial válida: m, M, f o F");
      } while(!(genero=='f'|| genero=='F'||genero=='m'|| genero=='M'));
      return genero;
   }
   
   //Método para pedir altura del paciente
   public static float pedirAltura(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese su altura en METROS (por ejemplo: 1.75)");
      return s.nextFloat();
   }
   
   //Método para pedir peso del paciente
   public static byte pedirPeso(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese su peso en KILOGRAMOS sin decimales (por ejemplo: 50)");
      return s.nextByte();
   }
}