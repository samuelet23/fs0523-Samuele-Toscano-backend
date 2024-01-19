package week2.day5.prgettoSettimanale;

public class Libri extends Catalogo {

    private String autore;
    private String genere;


    public Libri(String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super( titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
        this.codiceISBN = getCodiceISBN();

    }

    public Libri(long codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
        this.codiceISBN = codiceISBN;

    }



    @Override
    public String toString() {
        return "Libri{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", codiceISBN=" + codiceISBN +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", numeroPagine=" + getNumeroPagine() +
                '}';
    }

    public String getAutore() {

        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

}
