package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String parole;
        do {
            System.out.println("Inserisci una parola");
            parole = scanner.next();
            System.out.println("programma finito");

            String[] parola = parole.split("");
            String risultato = String.join(",", parola);
            System.out.println(risultato);
        } while(!parole.equalsIgnoreCase(":q"));

        System.out.println("programma finito");
    }
}
