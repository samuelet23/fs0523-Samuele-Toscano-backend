package it.epicode.week1.progettoSettimanale;

import java.util.Scanner;

public class lettoreMultimediale {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner =  new Scanner(System.in);
        //istanzio l'array di player multimediale
        PlayerMultimediale[] lettore = new PlayerMultimediale[5];
        int codiceScelto;
        do {
            System.out.println("Inserisci il titolo del file multimediale");
            String titolo = scanner.next();
            System.out.println("Inserisci il codice: 1 per un imamgine, 2 per un video, 3 per un audio, 4 per un'altra immagine, 5 per un'altro audio");
            codiceScelto = scanner.nextInt();

            switch (codiceScelto) {
                case 0:
                    // qui invio solo il messaggio in caso di 0, nel while termino il programma
                    System.out.println("Programma terminato");
                    break;
                case 1:
                    System.out.println("Hai scelto l'immagine");
                    //chiedo il parametro per la luminosità
                    System.out.println("Inserisci la luminosità dell'immagine");
                    int luminositàImg = scanner.nextInt();
                    // istanzio la classe Immagine con i parametri dati dall'utente
                    lettore[0] = new Immagine(titolo, luminositàImg);
                    //effettuo un casting per prendere i metodi della classe Immagine
                    if (lettore[0] instanceof Immagine) {
                        // questa è semplicemente una prova per vedere se i metodi funzionano effettivamente
                        Immagine img = (Immagine) lettore[0];
                        img.aumentaLuminosità();
                        img.aumentaLuminosità();
                        img.diminuisciLuminosità();
                    }
                    //stampo la classe
                    System.out.println(lettore[0]);
                    //essendo la classe immagine verrà usato il metodo show()
                    lettore[0].avvia();
                    break;
                case 2:
                    System.out.println("Hai scelto il video");
                    System.out.println("Inserisci la durata");
                    int durata = scanner.nextInt();
                    System.out.println("Insrisci la luminosità");
                    int luminositàVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume");
                    int volume = scanner.nextInt();
                    lettore[1] = new Video(titolo, volume, luminositàVideo, durata);
                    if (lettore [1] instanceof Video) {
                        Video v = (Video) lettore[1];
                        v.aumentaLuminosità();
                        v.aumentaLuminosità();
                        v.diminuisciLuminosità();
                    }
                    System.out.println(lettore[1]);
                    lettore[1].avvia();
                    break;
                case 3:
                    System.out.println("Hai scelto l'audio");
                    //chiedo il parametro per il volume
                    System.out.println("Inserisci il volume");
                    int volumeAudio = scanner.nextInt();
                    // chiedo il parametro per la durata
                    System.out.println("Inserisci la durata");
                    int durataAudio = scanner.nextInt();
                    // istanzio la classe con i parametri passati dall'utente
                    lettore[2] = new Audio(titolo, volumeAudio, durataAudio);
                    //effettuo un casting per prendere i metodi della classe Audio
                    if (lettore[2] instanceof Audio) {
                        // questa è semplicemente una prova per vedere se i metodi funzionano effettivamente
                        Audio audio = (Audio) lettore[2];
                        audio.aumentaVolume();
                        audio.aumentaVolume();
                        audio.diminuisciVolume();
                    }
                    //Stampo l'oggetto della classe
                    System.out.println(lettore[2]);
                    //Essendo un audio viene eseguito il metodo Play()
                    lettore[2].avvia();
                    break;
                case 4:
                    System.out.println("Hai scelto l'immagine");
                    //chiedo il parametro per la luminosità
                    System.out.println("Inserisci la luminosità dell'immagine");
                    int luminosità = scanner.nextInt();
                    // istanzio la classe Immagine con i parametri dati dall'utente
                    lettore[3] = new Immagine(titolo, luminosità);
                    //effettuo un casting per prendere i metodi della classe Immagine
                    if (lettore[3] instanceof Immagine) {
                        // questa è semplicemente una prova per vedere se i metodi funzionano effettivamente
                        Immagine img = (Immagine) lettore[3];
                        img.aumentaLuminosità();
                        img.aumentaLuminosità();
                        img.diminuisciLuminosità();
                    }
                    //stampo la classe
                    System.out.println(lettore[3]);
                    //essendo la classe immagine verrà usato il metodo show()
                    lettore[3].avvia();
                    break;
                case 5:
                    System.out.println("Hai scelto l'audio");
                    //chiedo il parametro per il volume
                    System.out.println("Inserisci il volume");
                    int volumeAudio2 = scanner.nextInt();
                    // chiedo il parametro per la durata
                    System.out.println("Inserisci la durata");
                    int durataAudio2 = scanner.nextInt();
                    // istanzio la classe con i parametri passati dall'utente
                    lettore[4] = new Audio(titolo, volumeAudio2, durataAudio2);
                    //effettuo un casting per prendere i metodi della classe Audio
                    if (lettore[4] instanceof Audio) {
                    // questa è semplicemente una prova per vedere se i metodi funzionano effettivamente
                        Audio audio = (Audio) lettore[4];
                        audio.aumentaVolume();
                        audio.aumentaVolume();
                        audio.diminuisciVolume();
                    }
                    //Stampo l'oggetto della classe
                    System.out.println(lettore[4]);
                    //Essendo un audio viene eseguito il metodo Play()
                    lettore[4].avvia();
                    break;
                default:
                    //in caso l'utente scrivesse qualche altro numero che non sia compreso tra 1-5
                    System.out.println("ERRORE:Tipo file inesistene, scegli il file digitando da 1-5, con il numero 0 termini il programma");
            }
            //termino il programma
        } while (codiceScelto!= 0);

    }
}
