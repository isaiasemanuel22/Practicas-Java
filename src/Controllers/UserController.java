package Controllers;

import Models.User;
import Repository.RepoUsers;
import Utilidaes.Inputs;

public class UserController {

    private static RepoUsers listUsers;
    private User user;

    public UserController(){
     this.listUsers = listUsers.getInstance();
    }

    public void  createUser(){
        String obj = "obj";
        System.out.println("Ingrese nombre de usuario");
        user.setName(new Inputs<String>().input("Ingrese un nombre" , obj ));

    }


}
