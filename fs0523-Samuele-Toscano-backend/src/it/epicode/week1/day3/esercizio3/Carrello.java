package it.epicode.week1.day3.esercizio3;

import java.util.ArrayList;

public class Carrello {
    private final String clienteAssociato;
    private final ArrayList<Articolo> elencoArticoli;
    private final int totaleCostoArticoli;
    public Carrello( String clienteAssociato, ArrayList<Articolo> elencoArticoli, int totaleCostoArticoli){

        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.totaleCostoArticoli = totaleCostoArticoli;

    }

    public int getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    public String getClienteAssociato() {
        return clienteAssociato;
    }

    public Articolo getElencoArticoli() {
        for (int i = 0; i< elencoArticoli.size(); i++){
            return elencoArticoli.get(i);
        }
        return null;
    }
}
