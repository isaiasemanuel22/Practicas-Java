package com.company;

import Controllers.UserController;

import java.io.IOException;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        UserController controller = new UserController();

        controller.createUser();
    }
}
