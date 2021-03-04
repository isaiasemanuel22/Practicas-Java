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
        String obj = "obj";
        User usernuevo = new User();
        System.out.println("Ingrese nombre de usuario");
        usernuevo.setName(new Inputs<String>().input("Ingrese un nombre" , obj));
        System.out.println("nombre: " + usernuevo.getName());
    }


}
