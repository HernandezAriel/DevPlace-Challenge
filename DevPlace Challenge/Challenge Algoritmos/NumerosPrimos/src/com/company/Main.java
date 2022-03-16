package com.company;

import java.util.Scanner;

public class Main {

    static boolean checkPrime(int n) {
        //Tomo como que el numero es primo en primera instancia.
        boolean isItPrime = true;
        /* El numero 0 y 1 no son primos asi que analizo primero esta situacion. */
        if (n <= 1) {
            isItPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if ((n % i) == 0) {
                    //Si el resto es 0 retorna falso, lo que significa que el numero no es primo
                    isItPrime = false;
                    break;
                }
            }
        }
        return isItPrime;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = scan.nextInt();
        scan.close();
        //Llamo al metodo y asigno lo que retorna a una variable para usarla mas adelante.
        boolean isItPrime = checkPrime(num);

        if (isItPrime) System.out.println(num + " Es un numero primo.");
        else System.out.println(num + " No es un numero primo.");
    }
}