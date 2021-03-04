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
        User newuser = new User();

        newuser.setName(new Inputs<String>().input("Ingrese un nombre" , "obj"));
        System.out.println("nombre: " + newuser.getName());

        newuser.setLastname(new Inputs<String>().input("Ingrese un apellido" , "obj"));
        System.out.println("apellido: " + newuser.getLastname());

        newuser.setAge(new Inputs<Integer>().input("Ingrese una edad" , 1));
        System.out.println("edad: " + newuser.getAge());
    }


}
