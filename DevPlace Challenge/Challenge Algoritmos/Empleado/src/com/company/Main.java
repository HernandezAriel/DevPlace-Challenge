package com.company;

import java.util.Scanner;

public class Main {

    public static float salary (float price, int years, int hours) {
        float pay;
        if(years > 10)
        pay = (price * hours) + (years * 30);
        else pay = (price * hours);
        return pay;
    }

    public static void employeeInfo(String name, int years, float pay) {
        System.out.println("Nombre: " + name);
        System.out.println("\nAntigüedad: " + years);
        System.out.println("\nTotal a cobrar: " + pay);
    }

    public static void main(String[] args) {

        float price;
        String name;
        int years;
        int hours;
        float pay;

        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Valor hora del empleado: ");
        price = scan.nextFloat();
        System.out.println("Ingrese nombre: ");
        name = sc.nextLine();
        System.out.println("Ingrese antigüedad: ");
        years = scan.nextInt();
        System.out.println("Ingrese horas trabajadas por mes: ");
        hours = scan.nextInt();
        scan.close();

        pay = salary (price, years, hours);
        employeeInfo(name, years, pay);


    }
}
