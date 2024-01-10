package it.epicode.week1.day3.esercizio2;

public class Chiamate {
    private double durata;
    private String numeroChiamato;
    public Chiamate(double durata, String numeroChiamato){
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }
    public double getDurata() {
        return durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

}
