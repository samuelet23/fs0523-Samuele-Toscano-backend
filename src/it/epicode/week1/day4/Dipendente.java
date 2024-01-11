package it.epicode.week1.day4;

public class Dipendente {
    public static final double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente( Dipartimento dipartimento,int matricola){
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERARIO;
    }
    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimenti(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Livello getLivelli() {
        return livello;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public void stampaDatiDipendente(Dipendente dipendente){
        double straordinario = calcolaPaga(dipendente,importoOrarioStraordinario);
        System.out.println(this +", stipendio con aggiunta Straordinario: "+straordinario);

    }
    public Livello promuovi(Dipendente dipendente){
        if (dipendente.livello == Livello.OPERARIO){
            dipendente.livello = Livello.IMPIEGATO;
            this.stipendio = dipendente.stipendioBase*1.2;
            return dipendente.livello.IMPIEGATO;
        } else if (livello == Livello.IMPIEGATO) {
            dipendente.livello = Livello.QUADRO;
            this.stipendio = dipendente.stipendioBase*1.5;
            return Livello.QUADRO;
        }else if (dipendente.livello == Livello.QUADRO) {
            dipendente.livello = Livello.DIRIGENTE;
            this.stipendio = dipendente.stipendioBase*2;
            return Livello.DIRIGENTE;
        }
            System.out.println("Che promozione vuoi? Sei già il boss");
            return Livello.DIRIGENTE;

    }

    public double calcolaPaga(Dipendente dipendente){
        return dipendente.stipendio;
    }
    public double calcolaPaga(Dipendente dipendente, double oreStraordinario){
       double costoStraordinario = dipendente.importoOrarioStraordinario * oreStraordinario;
       double stipendioConStraordinario = dipendente.stipendio + costoStraordinario;
       return stipendioConStraordinario;
    }
}
