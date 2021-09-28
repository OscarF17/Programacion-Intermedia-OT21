import java.io.*;
import java.util.*;

public class Autor{
   private String nombre;
   private String apellido;
   
   public Autor(String nombre, String apellido){
      setNombre(nombre);
      setApellido(apellido);
   }
   
   public void setNombre(String nombre){
      this.nombre=nombre;
   }
   
   public String getNombre(){
      return nombre;
   }
   
   public void setApellido(String apellido){
      this.apellido=apellido;
   }
   
   public String getApellido(){
      return apellido;
   }
   
   public void mostrarNombre(){
      System.out.println(nombre+" "+apellido);
   }
}