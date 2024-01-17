package it.epicode.week2.day2;

import java.util.*;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Da quanti numeri sarà composta la lista?");
        int numeri = scanner.nextInt();
        List<Integer>ordinata =listaOrdinata( numeri);
        List<Integer> invertita = listaInvertita(ordinata);
        System.out.println(ordinata);
        System.out.println(invertita);
        System.out.println("Scrivi: true, per i numeri pari, scrivi: false,  per i numeri dispari" );
        boolean b = scanner.nextBoolean();
        pariDispari(ordinata, b);

    }


    public static List<Integer> listaOrdinata(int n ){
        Random randomNum = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = randomNum.nextInt(101);
            lista.add(num);
        }

        Collections.sort(lista);
        return lista;
    }

    public static List <Integer> listaInvertita (List<Integer> lista ){
        List<Integer> listaInnvertita = new ArrayList<>();
        listaInnvertita=lista.reversed();
        return  listaInnvertita;

    }

    public static void pariDispari(List<Integer> lista, boolean booleano){

            for (int n: lista){
                if (booleano && n % 2 == 0 ) {
                System.out.println(n);
                } else if (!(n % 2 == 0))  {
                    System.out.println(n);
                }
            }
        }
    }



