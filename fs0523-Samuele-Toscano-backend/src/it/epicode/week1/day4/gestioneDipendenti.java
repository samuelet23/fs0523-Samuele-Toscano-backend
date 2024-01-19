package it.epicode.week1.day4;

public class gestioneDipendenti {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(Dipartimento.PRODUZIONE, 1 );
        Dipendente dipendente2 = new Dipendente(Dipartimento.PRODUZIONE, 2);
        Dipendente dipendente3 = new Dipendente(3, Dipendente.stipendioBase*1.2, 10, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente4 = new Dipendente(4, Dipendente.stipendioBase*2, 15, Livello.DIRIGENTE, Dipartimento.VENDTIE);

        dipendente1.promuovi(dipendente1);
        dipendente3.promuovi(dipendente3);

        Dipendente[] dipendenti = new Dipendente[4];

        dipendenti[0]=dipendente1;
        dipendenti[1]=dipendente2;
        dipendenti[2]=dipendente3;
        dipendenti[3]=dipendente4;


        for (int i = 0; i <dipendenti.length ; i++) {
            dipendenti[i].stampaDatiDipendente(dipendenti[i]);
        }

        double somma = 0;

        for (int i = 0; i <dipendenti.length ; i++) {
          double ns = dipendenti[i].calcolaPaga(dipendenti[i], 5);
            somma += ns;
        }
        System.out.println("L'importo dovuto a tutti i dipendenti comprensivo di straordinario è: " + somma);
    }
}
