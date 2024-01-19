package it.epicode.week1.day3.esercizio3;

public class Articolo {
    private int codiceArticolo;
    private String descrizione;
    private int prezzo;
    private int pezziDisponibili;
    public Articolo(int codiceArticolo, String descrizione, int prezzo, int pezziDisponibili){
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.pezziDisponibili =pezziDisponibili;
    }

    public int getCodice() {
        return codiceArticolo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
