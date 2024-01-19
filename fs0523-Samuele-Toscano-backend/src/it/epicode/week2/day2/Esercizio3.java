package it.epicode.week2.day2;

import java.util.HashMap;
import java.util.Map;

public class Esercizio3 {

    public static void main(String[] args) {
        addContact("samuele", "3477798014");
        addContact("samuele1", "3477798013");
        addContact("samuele2", "3477798012");
        addContact("samuele3", "3477798011");
        addContact("samuele4", "3477798010");

        stampaContatti();

//        removeContact("samuele1");
//        removeContact("samuele2","3477798012" );

        stampaContatti();

        try{
        findByName("samuele3");
        } catch (MessageException e){
            System.out.println(e.getMessage());
        }
        try{
            findByTel("3477798012");
        } catch (MessageException x){
            System.out.println(x.getMessage());
        }
    }
    static HashMap<String,String > rubrica = new HashMap<>();
    public static void addContact(String nome, String numeroTel ){
        rubrica.put(nome, numeroTel);
    }
    public static void removeContact(String nome){
        rubrica.remove(nome);
    }
    public static  void removeContact(String nome, String numeroTel){
        rubrica.remove(nome, numeroTel);
    }
    public static void findByTel(String numeroTel) throws MessageException {
        for (String nome: rubrica.keySet()){
            String telefono = rubrica.get(nome);
            if (telefono.equals(numeroTel)) {
                System.out.println("Nome trovato: " + nome);
                return;
            }
        }
        throw new MessageException("Utente non trovato");

    }
    public  static void findByName(String nome) throws MessageException {
        for (Map.Entry<String, String> entry : rubrica.entrySet()){
            String n = entry.getKey();
            String tel = entry.getValue();
            if (n.equals(nome)) {
                System.out.println("Telefono trovato: " + tel );
                return;
            }
        }
        throw new MessageException("Utente non trovato");
    }

    @Override
    public String toString() {
        return "Esercizio3{" +
                "Nome= " + rubrica.keySet() +
                "Numero Telefono= " + rubrica.values() +
                '}';
    }

    public static void stampaContatti(){
            System.out.println(rubrica);
    }
}
