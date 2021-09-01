//  @ Autor : Oscar Luciano Flores Leija 570390
//  @ Objetivo : Calcular el peso corporal y masa ideal de un paciente acorde a su g�nero. Utilizar una contrase�a para dar acceso al programa.
//  @ Fecha : 27/08/2021 - 31/08/2021

import java.io.*;
import java.util.*;

public class Paciente {
	private char genero;
	private float altura;
	private byte peso;
	
   //M�todo constructor
   public Paciente(char genero, float altura, byte peso) {
	   this.genero=genero;
      this.altura=altura;
      this.peso=peso;
	}
	
	//M�todo para calcular la masa corporal del paciente, independiente al g�nero
   public float calcularMasaCorporal() {
      return (float)(peso/Math.pow(altura,2));
	}
	
	//M�todo para calcular la masa ideal del paciente, depende del g�nero
   public byte calcularMasaIdeal() {
	   byte masaIdeal;
      if(genero=='m'||genero=='M')
         masaIdeal=(byte)((altura*100)-100);
      else
         masaIdeal=(byte)((altura*100)-110);
       return masaIdeal;
	}
   
   //M�todo para imprimir datos del paciente
   public String toString(){
      return "La masa corporal de este paciente ("+genero +") es de: "+ calcularMasaCorporal()+"\nSu masa ideal es de: "+calcularMasaIdeal()+"\n";
   }
}

class Principal {
   //M�todo main
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
   
   //M�todo para dar acceso al programa usando la contrase�a establecida, pide que se ingrese la contrase�a hasta que esta sea correcta
   public static void darAcceso(String PASSWORD, String USUARIO){
      Scanner s=new Scanner(System.in);
      String input, input2;
      do{
         System.out.print("Ingrese usuario: ");
         input2=s.next();
         System.out.print("Ingrese contraseña: ");
         input=s.next();
         if(!(input.equals(PASSWORD)&&input2.equals(USUARIO)))
            System.out.println("Ingrese los datos correctos");
      }while(!(input.equals(PASSWORD)&&input2.equals(USUARIO)));
   }
   
   //M�todo para pedir g�nero del paciente
   public static char pedirGenero(){
      Scanner s=new Scanner(System.in);
      char genero;
      do{
         System.out.println("Ingrese la inicial de su g�nero, m para masculino y f para femenino");
         genero=s.next().charAt(0);
         if(!(genero=='f'|| genero=='F'||genero=='m'|| genero=='M'))
            System.out.println("Ingrese una inicial v�lida: m, M, f o F");
      } while(!(genero=='f'|| genero=='F'||genero=='m'|| genero=='M'));
      return genero;
   }
   
   //M�todo para pedir altura del paciente
   public static float pedirAltura(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese su altura en METROS (por ejemplo: 1.75)");
      return s.nextFloat();
   }
   
   //M�todo para pedir peso del paciente
   public static byte pedirPeso(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese su peso en KILOGRAMOS sin decimales (por ejemplo: 50)");
      return s.nextByte();
   }
}