package Controllers;

import Models.User;
import Repository.RepoUsers;
import Utilidaes.Inputs;

public class UserController {

    private RepoUsers listUsers;

    public UserController(){
        listUsers = listUsers.getInstance();

    }

    public void  createUser(){
<<<<<<< HEAD
<<<<<<< HEAD
        User newuser = new User();

        newuser.setName(new Inputs<String>().input("Ingrese un nombre" ,String.class));
        System.out.println("nombre: " + newuser.getName());

        newuser.setLastname(new Inputs<String>().input("Ingrese un apellido" , String.class));
        System.out.println("apellido: " + newuser.getLastname());

        newuser.setAge(new Inputs<Integer>().input("Ingrese una edad" , Integer.class));
        System.out.println("edad: " + newuser.getAge());
=======
=======
>>>>>>> 9eebe9e7f0408df5805f6bae70189d10a4bb3f4b
        User usernuevo = new User();

        usernuevo.setName(new Inputs<String>().input("Ingrese un nombre" , "obj"));
        System.out.println("nombre: " + usernuevo.getName());

        usernuevo.setLastname(new Inputs<String>().input("Ingrese un apellido" , "obj"));
        System.out.println("apellido: " + usernuevo.getLastname());

        usernuevo.setAge(new Inputs<Integer>().input("Ingrese una edad" , 1));
        System.out.println("edad: " + usernuevo.getAge());
<<<<<<< HEAD
>>>>>>> refs/remotes/java/master
=======
>>>>>>> 9eebe9e7f0408df5805f6bae70189d10a4bb3f4b
    }


}
