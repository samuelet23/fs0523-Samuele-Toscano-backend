package it.epicode.week1.day3.esercizio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sim {
    private final String phoneNumber;
    private double creditoDisponibile;
    private final ArrayList<Chiamate> list;
    public Sim(String phoneNumber, double creditoDisponibile){
        this.phoneNumber = phoneNumber;
        creditoDisponibile = 0;
        this.list = new ArrayList<>();
    }

        public void effettuaChiamata(double durata, String numeroChiamato){
            if(creditoDisponibile > 0){
                Chiamate chiamata = new Chiamate(durata, numeroChiamato);
                list.addFirst(chiamata);
                if (list.size() > 5){
                    list.remove(5);
                }
                creditoDisponibile -= costoChiamata(durata);
            }
            System.out.println("Il tuo credito è inferiore o uguale a 0. Effettua una ricarica");

        }
        private double costoChiamata(double durata){
            return 0.20*durata;
        }
        public double effettuaRicarica(double ricarica){
           return creditoDisponibile += ricarica;
        }
        public void stampaDatiSim(){
        System.out.println(phoneNumber);
        System.out.println(creditoDisponibile);
            for (int i = 0; i < list.size(); i++) {
                Chiamate chiamata = list.get(i);
                System.out.println("Durata: " + chiamata.getDurata() + " minuti, Numero chiamato: " + chiamata.getNumeroChiamato());
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi il tuo numero di telefono");
        String number = scanner.next();
        Sim sim = new Sim(number, 0);
        sim.effettuaChiamata(2.0, "3477798014");

        sim.stampaDatiSim();
    }
}
