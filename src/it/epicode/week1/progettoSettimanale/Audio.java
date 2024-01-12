package it.epicode.week1.progettoSettimanale;

public class Audio extends PlayerMultimediale implements Riproducibile {
    protected int volume;
    private int durata;

    public Audio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }


    public void aumentaVolume() {
        for (int i = 0; i < durata; i++) {
            volume++;
            System.out.println(titolo + "!".repeat(volume));
        }
    }
        public void diminuisciVolume () {
            if (volume > 0) {
            for (int i = 0; i < durata; i++) {
                volume--;
                System.out.println(titolo + "!".repeat(volume));
            }
            return;
            }
            System.out.println("volume a 0");
        }

        @Override
        public int getDurata () {
            return durata;
        }

        @Override
        public void play () {
            for (int i = 0; i < durata; i++) {
                System.out.println(titolo + "!".repeat(volume));
            }
        }

        @Override
        public void avvia () {
            play();
        }

    @Override
    public String toString() {
        return "Audio{" +
                "titolo='" + titolo + '\'' +
                ", volume=" + volume +
                ", durata=" + durata +
                '}';
    }
}

