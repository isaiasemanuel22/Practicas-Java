package Controllers;

import Models.Adress;
import Models.User;
import Repository.RepoUsers;
import Utilidaes.Inputs;

import java.io.IOException;
import java.util.InputMismatchException;

public class UserController {

    private RepoUsers listUsers;

    public UserController(){
        this.listUsers = listUsers.getInstance();
    }

    public void  createUser() throws InputMismatchException {

        User newuser = new User();

        newuser.setName(new Inputs<String>().input("Ingrese un nombre" ,String.class));

        newuser.setLastname(new Inputs<String>().input("Ingrese un apellido" , String.class));

        newuser.setAge(new Inputs<Integer>().input("Ingrese una edad" , Integer.class));

        newuser.setUserAdress(this.createAdrees());

        this.listUsers.addUser(newuser);

        User user = listUsers.getUser("Isaias" , "Calfin");
        System.out.println("Nombre: " + user.getName());

    }

    private Adress createAdrees(){
        Adress newAdress = new Adress();

        newAdress.setCountry(new Inputs<String>().input("Ingrese Pais" ,String.class));

        newAdress.setProvince(new Inputs<String>().input("Ingrese Provincia" , String.class));

        newAdress.setCity(new Inputs<String>().input("Ingrese Ciudad" , String.class));

        newAdress.setStreet(new Inputs<String>().input("Ingrese Calle" ,String.class));

        newAdress.setNum(new Inputs<Integer>().input("Ingrese numero" , Integer.class));

        return newAdress;
    }


}
