//Escudería #1
//Nombres: Oscar Flores, Diego Paredes, Jessica Delgado
//Objetivo: Programa orientado a objetos de ventas de coches

import java.io.*;
import java.util.*;
import java.text.*;

class VentaCoche{
  String nombreCliente;
  String marca;
  float costo;
  float descuento;
  float costoFinal;

  //Método constructor
  VentaCoche(String nombreCliente, String marca, float costo){
    this.nombreCliente=nombreCliente;
    this.marca=marca;
    this.costo=costo;
  }
  
  //Método para calcular el descuento en base a la marca
  public float calcDescuento(){
    if(marca.equals("Mercedes"))
      descuento=costo*0.05f;
    else if(marca.equals("Toyota"))
      descuento=costo*0.10f;
    else if(marca.equals("Chrysler"))
      descuento=costo*0.08f;
    else
      descuento=0;   
    return descuento;
  }

  //Método para calcular el costo final
  public float calcCostoFinal(){
    return costo-descuento;
  }
  
  //Método para imprimir resultados
  public String toString(){
    DecimalFormat format=new DecimalFormat("0.00");
    return "Comprador: "+nombreCliente+"\t Marca: "+marca+"\t Venta: "+format.format(costo)+"\t Descuento: "+format.format(calcDescuento())+"\t Total pagar:$"+format.format(calcCostoFinal());
  }
}

class Main {
  public static void main(String[] args) {
    VentaCoche v1=new VentaCoche(pedirNombre(), pedirMarca(), pedirCosto());
    System.out.println(v1);
  }
  
  //Método para pedir el nombre del cliente
  public static String pedirNombre(){
    Scanner s = new Scanner(System.in);
    System.out.print("Ingrese el nombre del cliente: ");
    return s.nextLine();
  }

  //Método para pedir la marca del auto
  public static String pedirMarca(){
    Scanner x = new Scanner(System.in);
    System.out.println("Ingrese marca del coche");
    return x.next();
  }

  //Método para pedir el costo del auto
  public static float pedirCosto(){
    Scanner x = new Scanner(System.in);
    System.out.println("Ingrese costo del coche");
    return x.nextFloat();
    }
}

