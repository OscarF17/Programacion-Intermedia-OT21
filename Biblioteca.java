import java.io.*;
import java.util.*;

public class Biblioteca{
   public static void main(String args[]){
      Libro l1=new Libro("La insoportable levedad del ser", new Autor("Milan","Kunadera"),"35128",336);
      Libro l2=new Libro("La metamorfosis", new Autor("Franz","Kafka"), "36995",224);
      Libro l3=new Libro("El hombre duplicado", new Autor("José", "Saramago"), "16998", 407);
      l1.mostrarAutor();
      l2.mostrarIsbn();
      l3.mostrarNumPaginas();
      l3.cambiarNumPaginas(432);
      l3.mostrarNumPaginas();
   }
}