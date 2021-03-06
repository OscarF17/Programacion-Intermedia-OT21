//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Estudiante.java
//  @ Date : 24/08/2021
//  @ Author : Oscar Flores
//  @ Objetivo: Generar una clase estudiante con sus respectivos valores

public class Estudiante {
	private int matricula;
	private float cal1;
	private float cal2;
	private float cal3;
	
   //M?todo constructor, debe de no llevar nada 
   public Estudiante(int matricula, float cal1, float cal2, float cal3) { 
      this.matricula=matricula;
      this.cal1=cal1;
      this.cal2=cal2;
      this.cal3=cal3;   
	}
	
	//M?todo para retornar el promedio de las 3 calificaciones. No necesita par?metros porque las variables ya est?n en la clase
   public double calPromedio() {
	   return (cal1+cal2+cal3)/3;
	}
	
	//M?todo para desplegar directamente el resultado
   public String toString() {
	   return "Matr?cula: "+matricula+"\t Promedio: "+calPromedio();
	}
}

class Principal{
   public static void main(String args[]){
      Estudiante e1=new Estudiante(570390, 100.0f, 90, 95f);
      System.out.println(e1);
      Estudiante e2=new Estudiante(570391, 100.0f, 90, 95f);
      System.out.println(e2);
   }

}