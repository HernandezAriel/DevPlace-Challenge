package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int sumNumber(List<Integer> list) {
        int total = 0;
        //Recorro la lista de numeros y voy sumando mientras recorro la lista.
        for (int i: list) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner reader = new Scanner(System.in);
        int total;
        int num;
        System.out.println("Introduce numeros(El -1 es para salir): ");

        do {
            num = reader.nextInt();
            if(num != -1) list.add(num);
        } while (num != -1);

        total = sumNumber(list);
        System.out.println("La suma de todos los numeros es: " + total);
        /*Uso las libreria colecctions para buscar el maximo. Si no trabajara con listas tendria que recorrer mi array
        Y comparar los numeros uno por uno para buscar tanto el mayor como el menor.*/
        System.out.println("El numero mayor es: " + Collections.max(list));
        System.out.println("El numero menor es: " + Collections.min(list));

    }
}
