package it.epicode.week1.progettoSettimanale;

public class Immagine extends PlayerMultimediale {
    private int luminosità;


    public Immagine(String titolo, int luminosità ) {
        super(titolo);
        this.luminosità = luminosità;
    }


    public void show(){
        System.out.println(titolo +"*".repeat(luminosità));
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "titolo='" + titolo + '\'' +
                ", luminosità=" + luminosità +
                '}';
    }

    @Override
    public void avvia() {
        show();
    }
    public void aumentaLuminosità(){
            luminosità++;
            System.out.println(titolo +"*".repeat(luminosità));

    }
    public void diminuisciLuminosità(){
        if (luminosità >0) {
                luminosità--;
                System.out.println(titolo +"*".repeat(luminosità));
            }
        }

    }
