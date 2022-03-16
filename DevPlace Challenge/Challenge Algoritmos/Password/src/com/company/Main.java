package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static boolean comparePassword(String pass, String newPass) {
        boolean flag = false;
        if (Objects.equals(newPass, pass)) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {

        int i = 0;
        String pass;
        String newPass;
        boolean password;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una contraseña: ");
        pass = scan.nextLine();

        do {
            System.out.println("Ingrese su contraseña: ");
            newPass = scan.nextLine();

            password = comparePassword(pass, newPass);
            if (password) System.out.println("Felicitaciones recordás tu contraseña");
            else {
                System.out.println("Tenes que ejercitar la memoria");
                i++;
            }

        }while(password == false && i < 3);
    }
}
