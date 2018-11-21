package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv in siffervärde: ");
        double baseValue = input.nextDouble();
        double i;

        for (i=2; i<=10; i++){
            System.out.printf("Vald siffra:           %.2f", baseValue);
            System.out.println(" SEK");
            System.out.printf("Procentsats:           %.2f", (i/100)*100);
            System.out.println("%");
            System.out.printf("Saldo efter 1 år:      %.2f", baseValue+(baseValue*(i/100)));
            System.out.println();
            System.out.println("----------------------");
        }

    }
}

