package week2.prgettoSettimanale;

public class Riviste extends Catalogo {

   private Periodicità periodicità;

    public Riviste(String titolo, int annoPubblicazione, int numeroPagine, Periodicità periodicità) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }

    public Riviste(long codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicità periodicità) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
        this.codiceISBN = codiceISBN;


    }

    @Override
    public String toString() {
        return "Riviste{" +
                "Codice ISBN: "+ getCodiceISBN() +
                "periodicità=" + periodicità +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione()+
                ", numeroPagine=" + getNumeroPagine() +
                '}';
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }
}
