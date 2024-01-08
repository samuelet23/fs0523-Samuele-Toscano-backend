package it.epicode.week1.day1;

public class esercizio1 {
    public static void main (String[] args){

        moltiplica(2,4);
        concatena(4, "Siamo in");
        String[] array = {"ciao", "ciao1", "ciao2", "Ciao3", "Ciao4"};
        String stringa = "Nuova stringa";
        String[] results = inserisciInArray(array,stringa);
        System.out.println(results);
    }
    static int moltiplica(int number, int number2){
        return number*number2;
    }
    static String concatena (int number, String stringa){
        return stringa + number;
    }
    static String[] inserisciInArray(String[] array , String stringa ){

        String[] risultato = new String [6];
        System.arraycopy(array,0, risultato,0, 2 );
        risultato[2]= stringa;
        System.arraycopy(array,3, risultato, 4, 2);
        return risultato;
    }
}
