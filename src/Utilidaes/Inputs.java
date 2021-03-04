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
         T entrada = null;
         if ((t.getClass().getName()) == ("obj".getClass().getName())) {
             try {

                String input = scan.nextLine();
                entrada = (T) input;
             }
             catch (Exception e){
                 System.out.println("Ingrese una entrada valida");
             }
         }else{
             try {

                 Integer  input = scan.nextInt();
                 entrada = (T) input;

             }
             catch (Exception e){
                 System.out.println("Ingrese una entrada valida");
             }
         }

         return entrada;
     }
}
