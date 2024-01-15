package it.epicode.week2.day1.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class auto {
    private static final Logger logger = LoggerFactory.getLogger(auto.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci il numero di Km percorsi: ");
            double kmPercorsi = scanner.nextDouble();

            System.out.print("Inserisci i litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();

            double kmPerLitro = calcolaKmPerLitro(kmPercorsi, litriConsumati);
            System.out.println("Il numero di km/litro percorsi è: " + kmPerLitro);

        } catch (java.util.InputMismatchException e) {
            logger.error("Errore: Inserire un valore numerico valido.", e);
        } catch (java.lang.ArithmeticException e) {
            logger.error("Errore: Divisione per zero. Assicurarsi che il numero di litri consumati non sia zero.", e);
        }
    }

    private static double calcolaKmPerLitro(double kmPercorsi, double litriConsumati) {
        if (litriConsumati == 0) {
            throw new ArithmeticException("Divisione per zero. Assicurarsi che il numero di litri consumati non sia zero.");
        }
        return kmPercorsi / litriConsumati;
    }
}

