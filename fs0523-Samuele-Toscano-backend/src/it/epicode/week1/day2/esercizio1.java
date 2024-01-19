package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un parola");
        String parola = scanner.next();
        System.out.println(stringaPariDispari(parola));

        System.out.println("Inserisci un anno per vedere se è bisestile");
        int anno = scanner.nextInt();
        System.out.println(annoBisestile(anno));
    }

    public static boolean stringaPariDispari(String stringa) {
        if (stringa.length() % 2 == 0) {
            return true;
        }return false;

    }
    public static boolean annoBisestile(int anno){
        if (anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0  ){
            return true;
        }return false;
    }
}