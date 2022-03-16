package com.company;

import java.util.Scanner;

public class Main {

    public static boolean compareNumbers(int randomNumber, int num) {
        //Comparo que numero es mayor y cual es el menor
        return randomNumber > num;
    }

    public static void main(String[] args) {

        int randomNumber;
        int num;
        boolean compare;
        randomNumber = (int) Math.floor(Math.random()*1000+1);
        System.out.println(randomNumber);

        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero: ");
            num = scan.nextInt();
            compare = compareNumbers(randomNumber, num);
            //primero evaluo si el numero es el mismo
            if(randomNumber == num) {
                System.out.println("Numero correcto!");
                //En caso de no ser correcto llamo a la funcion compare para saber el mayor y el menor.
            }else if(compare) System.out.println("El numero ingresado es menor.");
                else System.out.println("El numero ingresado es mayor");
        }while(randomNumber != num); //Ejecuto el do while hasta que el numero sea igual.
    }
}
