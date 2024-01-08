package it.epicode.week1.day1;

import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo lato del rettangolo");
          double lato1 = scanner.nextDouble();
          System.out.println("Inserisci il secondo lato del rettangolo");
          double lato2 = scanner.nextDouble();
        System.out.println("Il perimetro del rettangolo è:");
        System.out.println(perimetroRettangolo(lato1, lato2));
        System.out.println("------------------------");
        System.out.println("Inserisci un numero, se il risultato è 0, vuol dire che è Pari, se è 1 sarà Dispari");
        int number = scanner.nextInt();
        System.out.println("Il risultao è:");
        System.out.println(pariDispari(number));
        System.out.println("--------------------------");
        System.out.println("Inserisci la base del Triangolo");
        double base = scanner.nextDouble();
        System.out.println("Inserisci l'altezza del Triangolo");
        double altezza = scanner.nextDouble();
        System.out.println("L'area del Triangolo è:");
        System.out.println(areaTriangolo(base, altezza));



    }




    static double perimetroRettangolo (double lato1, double lato2) {
        return lato1 + lato2;
    }
    static int pariDispari(int number){
        if (number % 2 == 0){
            return 0;
        } else {
            return 1;
        }
    }
    static double areaTriangolo(double base, double altezza){
    return base * altezza;
    }
}
    











