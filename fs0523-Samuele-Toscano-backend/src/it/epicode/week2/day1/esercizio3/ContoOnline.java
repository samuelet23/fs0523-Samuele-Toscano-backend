package it.epicode.week2.day1.esercizio3;

public class ContoOnline {
    public static class ContoOnLine extends ContoCorrente {
        double maxPrelievo;

        ContoOnLine(String titolare, double saldo, double maxP) {
            super(titolare, saldo);
            this.maxPrelievo = maxP;
        }

        void stampaSaldo() {

            System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                    + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
        }

        void preleva(double x) throws BancaException {
            if (x <= maxPrelievo) {
                super.preleva(x);
            }
            if (x > maxPrelievo) {
                throw new BancaException(" il prelievo non è disponibile ");
            }
        }
    }


}
