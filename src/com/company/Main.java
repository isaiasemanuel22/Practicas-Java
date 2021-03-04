package com.company;

import Controllers.UserController;

public class Main {

    public static void main(String[] args) {
        UserController controller = new UserController();

        controller.createUser();
    }
}
