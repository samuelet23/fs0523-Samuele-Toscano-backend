package it.epicode.week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int intero = scanner.nextInt();
        createArr(intero,scanner);
    }

    public static void createArr(int n, Scanner scanner){
        ArrayList<String> parole = new ArrayList<>();
        System.out.println("Inserisci " + n + " parole");
        for (int i = 0; i < n; i++) {
            System.out.println("inserisci la parola numero:" + (i +1) );
            String parola = scanner.next();
            parole.add(parola);
        }
        Set<String> paroleDuplicate = new HashSet<>();
        HashSet<String> paroleNoDuplicate = new HashSet<>();
        for ( String parola: parole){
            if (!paroleNoDuplicate.add(parola)) {
                paroleDuplicate.add(parola);
            }
            paroleNoDuplicate.add(parola);
        }
        System.out.println("Le parole duplicate sono: "+ paroleDuplicate );
        System.out.println("Il numero delle parole distinte è: " + paroleNoDuplicate.size());
        System.out.println("le parole distinte sono:" + paroleNoDuplicate);
    }


}
