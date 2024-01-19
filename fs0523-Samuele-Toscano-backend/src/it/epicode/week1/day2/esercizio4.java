package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero ");
        int n = scanner.nextInt();

        for (int i = n; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
