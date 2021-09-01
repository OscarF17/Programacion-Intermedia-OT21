import java.io.*;
import java.util.*;
import java.time.*;


class Fecha{
    public static void main(String[] args) {
        LocalDate nuevaFecha=calcularFecha();
        System.out.println("La fecha siguiente (en formato YYYY/MM/DD) es: "+nuevaFecha.toString());
    }
    
    //Método para calular la fecha siguiente
    public static LocalDate calcularFecha(){
        Scanner s=new Scanner(System.in);
        int dia, mes, year;
        long periodo[]=new long[2];
        //Ingresar año
        System.out.println("Ingrese año");
        do{
            year=s.nextInt();
            if(year<1)
            System.out.println("Ingrese un año valido");
        }while(year<1);
        //Ingresar mes    
        System.out.println("Ingrese mes");
        do{
            mes=s.nextInt();
            if(!(mes>=1 && mes<=12))
            System.out.println("Ingrese un numero del 1 al 12");
        }while(!(mes>=1 && mes<=12));
        //Ingresar dia    
        System.out.println("Ingrese dia del mes");
        //Meses con 31 dias 
        byte limite;   
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            limite=31;
            do{
                dia=s.nextInt();
                if(!(dia>=1 && dia<=limite))
                System.out.println("Ingrese un dia entre 1 y "+limite);
            }while(!(dia>=1 && dia<=limite));
        }
        //Meses con 30 dias
        else if(mes==4 || mes==6 || mes==9 || mes==11){
            limite=30;
            do{
                dia=s.nextInt();
                if(!(dia>=1 && dia<=limite))
                System.out.println("Ingrese un dia entre 1 y "+limite);
            }while(!(dia>=1 && dia<=limite));
        }
        //Febrero
        else{
        limite=28;
        if(year%4==0 && (!(year%100==0)||year%400==0))//Es bisiesto cuando es divisible entre 4 y no divisile entre 100 o divisible entre 400.
            //2000 es bisiesto, 1900 no.
            limite=29;
            do{
                dia=s.nextInt();
                if(!(dia>=1 && dia<=limite))
                System.out.println("Ingrese un dia entre 1 y "+limite);
            }while(!(dia>=1 && dia<=limite));
        }
        LocalDate fechaActual=LocalDate.of(year, mes, dia);
        periodo=pedirPeriodo();
        LocalDate nuevaFecha=calcularNuevaFecha(fechaActual, periodo);
        return nuevaFecha;
    }

    //Método para pedir el periodo
    public static long[] pedirPeriodo(){
        Scanner s=new Scanner(System.in);
        long periodo[]=new long[2];
        for(byte i=1; i>-1; i--){
            if(i==1){
                System.out.println("Ingrese el numero indicado dependiendo de si la siguiente fecha sera dentro de x cantidad de...\n0 - dias\n1 - semanas\n2 - meses\n3 - años");
                do{
                    periodo[1]=s.nextLong();
                    if(!(periodo[1]==0 || periodo[1]==1 || periodo[1]==2 || periodo[1]==3)){
                    System.out.println("Ingrese un numero valido, 0 para dias, 1 para semanas, 2 para meses y 3 para años");
                    }
                }while(!(periodo[1]==0 || periodo[1]==1 || periodo[1]==2 || periodo[1]==3));
            }
            else{
                System.out.print("Ingrese dentro de cuantos ");;
                if(periodo[1]==0)
                    System.out.println("dias sera la siguiente fecha");
                else if(periodo[1]==1)
                    System.out.println("semanas sera la siguiente fecha");
                else if(periodo[1]==2)
                    System.out.println("meses sera la siguiente fecha");
                else
                    System.out.println("años sera la siguiente fecha");
                do{
                    periodo[0]=s.nextLong();
                    if(periodo[0]<1)
                        System.out.println("Ingrese un valor valido");
                }while(periodo[0]<1);
            }
        }
        return periodo;
    }
    
    //Método para calclar la nueva fecha utilizando la fecha original y el periodo
    public static LocalDate calcularNuevaFecha(LocalDate fechaActual, long[]periodo){
        LocalDate nuevaFecha=LocalDate.of(1,1,1);
        if(periodo[1]==0)
            nuevaFecha=fechaActual.plusDays(periodo[0]);
        else if(periodo[1]==1)
            nuevaFecha=fechaActual.plusWeeks(periodo[0]);
        else if(periodo[1]==2)
            nuevaFecha=fechaActual.plusMonths(periodo[0]);
        else if(periodo[1]==3)
            nuevaFecha=fechaActual.plusYears(periodo[0]);
        return nuevaFecha;
        }
}