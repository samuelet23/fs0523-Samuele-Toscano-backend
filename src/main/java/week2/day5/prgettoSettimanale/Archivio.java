package week2.day5.prgettoSettimanale;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static week2.day5.prgettoSettimanale.Catalogo.logger;

public class Archivio {

    public static void main(String[] args) throws Exception {
        Archivio archivio = new Archivio();
        Libri libro = new Libri("mioLibro",2022,300, "Samuele", "comico");
        Libri libro2 = new Libri("mioLibro2",2012,367, "Francesco", "romantico");
        Libri libro3 = new Libri("mioLibro3",2005,248, "Marco", "romanzo");
        Riviste rivista = new Riviste("Rivista", 2003, 35, Periodicità.MENSILE);
        Riviste rivista2 = new Riviste("Rivista2", 2007, 65, Periodicità.SEMESTRALE);
        Riviste rivista3 = new Riviste("Rivista3", 2013, 15, Periodicità.SETTIMANALE);
        archivio.addElement(libro);
        archivio.addElement(libro2);
        archivio.addElement(libro3);
        archivio.addElement(rivista);
        archivio.addElement(rivista2);
        archivio.addElement(rivista3);
//        archivio.saveOnFile();
//        System.out.println(archivio.takeFromFile());

            archivio.removeElementByISBN(10002);

    }

    private List<Catalogo> elements;

    public Archivio(){
        this.elements = new ArrayList<>();
    }

    public void addElement(Catalogo element){
        this.elements.add(element);
    }
    public void removeElementByISBN(long ISBN){
       for (Catalogo prodotto: elements){
           if (prodotto.codiceISBN == ISBN){
               elements.remove(prodotto);

           }
       }
    }

    public void searchByISBN(long ISBN){
      for (Catalogo prodotto: elements){
          if (prodotto.codiceISBN == ISBN){
              System.out.println(prodotto);

          }
      }

    }

    public List<Catalogo> searchByYear(int year){
       return elements.stream()
                .filter(e -> e.getAnnoPubblicazione() == year)
                .toList();
    }
    public List<Catalogo> searchByAuthor(String autore){
       return elements.stream()
               .filter(e -> e instanceof Libri)
               .filter(e -> ((Libri) e).getAutore().equals(autore))
               .toList();
    }

    public void  saveOnFile() throws IOException {
        File file = new File("path/elementi.txt");

        String libri = elements.stream()
                .filter(e -> e instanceof Libri)
                .map(l -> "Codice ISBN: "+l.getCodiceISBN()+"@"
                        + "Titolo: "+ l.getTitolo() +"@"
                        + "Anno di pubblicazione: "+ l.getAnnoPubblicazione()+"@"
                        + "Totale numero pagine: "+ l.getNumeroPagine()+"@"
                        +"Autore: "+((Libri) l).getAutore()+"@"
                        +"Genere: "+((Libri) l).getGenere()+"@")
                .collect(Collectors.joining("#"));

        String riviste = elements.stream()
                .filter(e -> e instanceof Riviste)
                .map(l -> "Codice ISBN: "+l.getCodiceISBN()+"@"
                        + "Titolo: "+ l.getTitolo() +"@"
                        + "Anno di pubblicazione: "+ l.getAnnoPubblicazione()+"@"
                        + "Totale numero pagine: "+ l.getNumeroPagine()+"@"
                        +"Periodicità: "+((Riviste) l).getPeriodicità()+"@")
                .collect(Collectors.joining("#"));
        try {
            FileUtils.writeStringToFile(file, libri, Charset.defaultCharset(),true);
            FileUtils.writeStringToFile(file, riviste, Charset.defaultCharset(),true);
        }catch (IOException e){
            logger.error(e.getMessage());
        }
    }

    public List<String> takeFromFile(){
        List<String> prodotti = new ArrayList<>();
        File file = new File("path/elementi.txt");
        try {
           List<String> prodFile = FileUtils.readLines(file,Charset.defaultCharset());
           for (String prodotto: prodFile){
              String catalogo = prodotto.replaceAll("[@#]", ",");
                prodotti.add(catalogo);
           }
        }catch (IOException e){
            logger.error(e.getMessage());
        }
        return prodotti;
    }
}
