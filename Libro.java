import java.io.*;
import java.util.*;

public class Libro{
   private String titulo;
   private Autor autor;
   private String isbn;
   private int numPaginas;
   
   public Libro(String titulo, Autor autor, String isbn, int numPaginas){
      setTitulo(titulo);
      setAutor(autor);
      setIsbn(isbn);
      setNumPaginas(numPaginas);
   }
   
   public void setTitulo(String titulo){
      this.titulo=titulo;
   }
   
   public String getTitulo(){
      return titulo;
   }
   
   public void setAutor(Autor autor){
      this.autor=autor;
   }
   
   public Autor getAutor(){
      return autor;
   }
   
   public void setIsbn(String isbn){
      this.isbn=isbn;
   }
   
   public String getIsbn(){
      return isbn;
   }
   
   public void setNumPaginas(int numPaginas){
      this.numPaginas=numPaginas;
   }
   
   public int getNumPaginas(){
      return numPaginas;
   }
   
   public void cambiarNumPaginas(int nuevoNumPaginas){
      setNumPaginas(nuevoNumPaginas);
   }
   
   public void mostrarNumPaginas(){
      System.out.println(getNumPaginas());
   }
   
   public void mostrarIsbn(){
      System.out.println(getIsbn());
   }
   
   public void mostrartitulo(){
      System.out.println(getTitulo());
   }
   
   public void mostrarAutor(){
      autor.mostrarNombre();
   }
}