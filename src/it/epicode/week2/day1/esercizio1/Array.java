package it.epicode.week2.day1.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int [] arrayInt = new int[5];
    Random random = new Random();
        arrayInt[0]= random.nextInt(11);
        arrayInt[1]= random.nextInt(11);
        arrayInt[2]= random.nextInt(11);
        arrayInt[3]= random.nextInt(11);
        arrayInt[4]= random.nextInt(11);

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Array" + arrayInt[i]);
        }


        int numInserito = 1;
        do {
            System.out.println("In che posizione vuoi metterlo?");
            System.out.println("Inserisci la posizione 0 per uscire");
            int numPosizione = scanner.nextInt();
            if (numPosizione == 0) {
                return;
            }


                System.out.println("Inserisci un numero nell'array");
                numInserito = scanner.nextInt();
                if (numPosizione > 0 && numPosizione <= 5) {
                    arrayInt[numPosizione - 1] = numInserito;
                    for (int i = 0; i < arrayInt.length; i++) {
                    System.out.println(arrayInt[i]);
                    }
                } else {
                    System.out.println("Errore: La posizione deve essere compresa tra 1 e 5.");
                }

        } while (numInserito != 0);

    }

}
