package Utilidaes;

import Models.User;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

public class Inputs <T> {

<<<<<<< HEAD
<<<<<<< HEAD
=======
     private  T t;
>>>>>>> refs/remotes/java/master
=======
     private  T t;
>>>>>>> 9eebe9e7f0408df5805f6bae70189d10a4bb3f4b

     public Inputs(){

     }

<<<<<<< HEAD
<<<<<<< HEAD
     public T input (String mensaje , Object obj){

         Scanner scan = new Scanner(System.in);
         System.out.println(mensaje);
         T entrada = null;
         if (obj.equals(String.class)) {
             try {
                 System.out.println("error1");
                String input = scan.nextLine();
                entrada = (T) input;
                System.out.println(input);
=======
=======
>>>>>>> 9eebe9e7f0408df5805f6bae70189d10a4bb3f4b
     public T input (String mensaje , T obj){
         t = obj;
         Scanner scan = new Scanner(System.in);
         System.out.println(mensaje);
         T entrada = null;
         if ((t.getClass().getName()) == ("obj".getClass().getName())) {
             try {

                String input = scan.nextLine();
                entrada = (T) input;
<<<<<<< HEAD
>>>>>>> refs/remotes/java/master
=======
>>>>>>> 9eebe9e7f0408df5805f6bae70189d10a4bb3f4b
             }
             catch (Exception e){
                 System.out.println("Ingrese una entrada valida");
             }
         }else{
             try {
<<<<<<< HEAD
<<<<<<< HEAD
                 System.out.println("error");
=======

>>>>>>> refs/remotes/java/master
=======

>>>>>>> 9eebe9e7f0408df5805f6bae70189d10a4bb3f4b
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
