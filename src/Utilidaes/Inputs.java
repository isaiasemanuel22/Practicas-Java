package Utilidaes;

import Models.User;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

public class Inputs <T> {

     private  T t;

     public Inputs(){

     }

     public T input (String mensaje , T obj){
         t = obj;
         Scanner scan = new Scanner(System.in);
         System.out.println(mensaje);
         String obj1="obj1";
         T entrada = null;
         if ((t.getClass().getName()) == (obj1.getClass().getName())) {
             try {
                 System.out.println("entro 1");
                String input = scan.nextLine();
                entrada = (T) input;
             }
             catch (Exception e){
                 System.out.println("Ingrese una entrada valida");
             }
         }else{
             try {
                 System.out.println("entro 2");
                 Integer  input = scan.nextInt();
                 entrada = (T) input;

             }
             catch (Exception e){
                 System.out.println("Ingrese una entrada valida");
             }
         }

         System.out.println("entro");
         return entrada;
     }
}
