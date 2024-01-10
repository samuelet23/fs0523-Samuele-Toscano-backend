package it.epicode.week1.day3.esercizio1;

public class rettangolo {
    private double altezza;
    private double larghezza;
    public rettangolo (double altezza,double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    public double perimetro(){
        return (this.altezza + this.larghezza)*2;
    }
    public double area(){
        return  this.altezza * this.larghezza;
    }

}
