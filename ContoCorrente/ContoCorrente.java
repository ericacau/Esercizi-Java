public class ContoCorrente {

    private double saldo;

    public ContoCorrente(double saldoIniziale) {
        saldo = saldoIniziale;
    }

    public void versa(double somma) {
        saldo += somma;
        System.out.println("Versati " + somma + "euro.");
    }

    public boolean preleva(double somma) {
        if (saldo < somma) {
            return false;
        }
        else {
            saldo -= somma;
            System.out.println("Prelevati" + somma + "euro.");
            return true;
        }
    }

    public double ottieniSaldo(){
        return saldo;
    }
}