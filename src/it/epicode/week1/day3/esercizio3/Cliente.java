package it.epicode.week1.day3.esercizio3;

import java.util.Date;

public class Cliente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(int codiceCliente, String nome, String cognome, String email, Date dataIscrizione){
       this.codiceCliente = codiceCliente;
       this.nome = nome;
       this.cognome = cognome;
       this.email = email;
       this.dataIscrizione = dataIscrizione;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

}
