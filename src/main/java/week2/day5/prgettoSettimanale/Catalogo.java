package week2.day5.prgettoSettimanale;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

public abstract class Catalogo {
   long codiceISBN;
   private String titolo;
   private int annoPubblicazione;

   private int numeroPagine;

   private Set<Long> numeriISBN = new HashSet<>();
  private static long contatore= 10000;
   protected static Logger logger = LoggerFactory.getLogger("errore");

   public Catalogo(String titolo, int annoPubblicazione, int numeroPagine) {
      this.titolo = titolo;
      this.annoPubblicazione = annoPubblicazione;
      this.numeroPagine = numeroPagine;
   }

   public Catalogo(long codiceISBN, String titolo, int annoPubblicazione, int numeroPagine) {
      this.codiceISBN = codiceISBN;
      this.titolo = titolo;
      this.annoPubblicazione = checkYear(annoPubblicazione);
      this.numeroPagine = numeroPagine;
   }

   public long getCodiceISBN() {
      return generateUnivoqueISBN();
   }

   private int checkYear(int anno) {
      int currentYear = Year.now().getValue();
      if (anno >= 1000 && anno <= currentYear) {
         return currentYear;
      } else {
         logger.error("ERRORE: L'anno inserito deve essere tra 1000 e " + currentYear);
      }
      return 0;
   }


   protected long generateUnivoqueISBN(){

        return contatore++;
   };






   public String getTitolo() {
      return titolo;
   }

   public void setTitolo(String titolo) {
      this.titolo = titolo;
   }

   public int getAnnoPubblicazione() {
      return annoPubblicazione;
   }

   public void setAnnoPubblicazione(int annoPubblicazione) {
      this.annoPubblicazione = annoPubblicazione;
   }

   public int getNumeroPagine() {
      return numeroPagine;
   }

   public void setNumeroPagine(int numeroPagine) {
      this.numeroPagine = numeroPagine;
   }

}
