package it.epicode.week1.day3.esercizio1;

import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi l'altezza del rettangolo 1");
        int altezza = scanner.nextInt();
        System.out.println("Scrivi la base del rettangolo 1");
        int base = scanner.nextInt();

        rettangolo rettangolo = new rettangolo(altezza, base);
        stampaRettangolo(rettangolo);

        System.out.println("Scrivi l'altezza del rettangolo 2");
        int altezza2 = scanner.nextInt();
        System.out.println("Scrivi la base del rettangolo 2");
        int base2 = scanner.nextInt();

        rettangolo rettangolo2 = new rettangolo(altezza2, base2);

        stampaDueRettangoli(rettangolo, rettangolo2 );
    }

    public static void stampaRettangolo(rettangolo rettangolo){
        System.out.println(rettangolo.perimetro());
        System.out.println(rettangolo.area());
    }
    public static void stampaDueRettangoli(rettangolo rett1, rettangolo rett2){
        System.out.println("rettangolo1");
        System.out.println(rett1.perimetro());
        System.out.println(rett1.area());
        System.out.println("rettangolo2");
        System.out.println(rett2.perimetro());
        System.out.println(rett2.area());
        System.out.println("somma");
        System.out.println(rett1.area() + rett2.area());
        System.out.println(rett1.perimetro() + rett2.perimetro());
    }
}
