package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int longitud;

        System.out.println("Ingrese longitud de contraseña: ");
        longitud = scan.nextInt();
        scan.nextLine();
        Password pass = new Password(longitud);
        System.out.println(pass.getContraseña());
        if(pass.esFuerte()) System.out.println("La contraseña es fuerte");
        else System.out.println("La contraseña es debil");


        //Se pedia que por defecto la longitud de la cadena sea de 8 caracteres, pero para que la contraseña
        //sea fuerte necesita un minimo de 9 caracteres.
        System.out.println("Ingrese una contraseña: (9 o mas caracteres) ");
        String passW = scan.nextLine();
        scan.close();
        Password pass2 = new Password(passW);
        System.out.println(pass2.getContraseña());
        //La funcion solo evalua los 9 primeros caracteres porque la longitud default es de 9.
        if(pass2.esFuerte()) System.out.println("La contraseña es fuerte");
        else System.out.println("La contraseña es debil");
    }
}
