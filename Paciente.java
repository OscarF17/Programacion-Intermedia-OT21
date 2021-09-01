//  @ Autor : Oscar Luciano Flores Leija 570390
//  @ Objetivo : Calcular el peso corporal y masa ideal de un paciente acorde a su gï¿½nero. Utilizar una contraseï¿½a para dar acceso al programa.
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
	
	//Mï¿½todo para calcular la masa corporal del paciente, independiente al gï¿½nero
   public float calcularMasaCorporal() {
      return (float)(peso/Math.pow(altura,2));
	}
	
	//Mï¿½todo para calcular la masa ideal del paciente, depende del gï¿½nero
   public byte calcularMasaIdeal() {
	   byte masaIdeal;
      if(genero=='m'||genero=='M')
         masaIdeal=(byte)((altura*100)-100);
      else
         masaIdeal=(byte)((altura*100)-110);
       return masaIdeal;
	}
   
   //Mï¿½todo para imprimir datos del paciente
   public String toString(){
      return "La masa corporal de este paciente ("+genero +") es de: "+ calcularMasaCorporal()+"\nSu masa ideal es de: "+calcularMasaIdeal()+"\n";
   }
}

class Principal {
   //Mï¿½todo main
   public static void main(String args[]){
      final String USUARIO="olfl17";
      final String PASSWORD="Oscar17*";
      darAcceso(PASSWORD, USUARIO);
      char genero=pedirGenero();
      float altura=pedirAltura();
      byte peso=pedirPeso();
      Paciente p1=new Paciente(genero, altura, peso);
      System.out.println(p1);
      Paciente p2=new Paciente('f', 1.60f, (byte)50);
      System.out.println(p2);
   }
   
   //Mï¿½todo para dar acceso al programa usando la contraseï¿½a establecida, pide que se ingrese la contraseï¿½a hasta que esta sea correcta
   public static void darAcceso(String PASSWORD, String USUARIO){
      Scanner s=new Scanner(System.in);
      String input, input2;
      do{
         System.out.print("Ingrese usuario: ");
         input2=s.next();
         System.out.print("Ingrese contraseÃ±a: ");
         input=s.next();
         if(!(input.equals(PASSWORD)&&input2.equals(USUARIO)))
            System.out.println("Ingrese los datos correctos");
      }while(!(input.equals(PASSWORD)&&input2.equals(USUARIO)));
   }
   
   //Mï¿½todo para pedir gï¿½nero del paciente
   public static char pedirGenero(){
      Scanner s=new Scanner(System.in);
      char genero;
      do{
         System.out.println("Ingrese la inicial de su gï¿½nero, m para masculino y f para femenino");
         genero=s.next().charAt(0);
         if(!(genero=='f'|| genero=='F'||genero=='m'|| genero=='M'))
            System.out.println("Ingrese una inicial vï¿½lida: m, M, f o F");
      } while(!(genero=='f'|| genero=='F'||genero=='m'|| genero=='M'));
      return genero;
   }
   
   //Mï¿½todo para pedir altura del paciente
   public static float pedirAltura(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese su altura en METROS (por ejemplo: 1.75)");
      return s.nextFloat();
   }
   
   //Mï¿½todo para pedir peso del paciente
   public static byte pedirPeso(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese su peso en KILOGRAMOS sin decimales (por ejemplo: 50)");
      return s.nextByte();
   }
}