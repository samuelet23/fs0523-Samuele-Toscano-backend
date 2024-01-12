package it.epicode.week1.progettoSettimanale;

public class Video extends PlayerMultimediale implements Riproducibile{
    protected int volume;
    protected int luminosità;
    protected int durata;
    public Video(String titolo, int volume, int luminosità, int durata) {
        super(titolo);
        this.volume = volume;
        this.luminosità = luminosità;
        this.durata = durata;
    }

    @Override
    public void avvia() {
        play();
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo +"!".repeat(volume));
        }

    }

    @Override
    public String toString() {
        return "Video{" +
                "titolo='" + titolo + '\'' +
                ", volume=" + volume +
                ", luminosità=" + luminosità +
                ", durata=" + durata +
                '}';
    }

    public void aumentaLuminosità(){
            for (int i = 0; i < durata; i++) {
                luminosità++;
                System.out.println(titolo +"*".repeat(luminosità));
            }
        }
        public void diminuisciLuminosità(){
            if (luminosità >0) {
                for (int i = 0; i < durata; i++) {
                    luminosità--;
                    System.out.println(titolo +"*".repeat(luminosità));
                }
            }

        }
}
