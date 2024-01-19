package it.epicode.week1.progettoSettimanale;

public abstract class PlayerMultimediale {
    protected String titolo;

    @Override
    public String toString() {
        return "PlayerMultimediale{" +
                "titolo='" + titolo + '\'' +
                '}';
    }

    public PlayerMultimediale(String titolo){
        this.titolo = titolo;
    }
    public abstract void avvia();
}
