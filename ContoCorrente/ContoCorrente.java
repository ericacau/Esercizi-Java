public class ContoCorrente {

    private double saldo;
    private int numero;
    //variabili condivise

    private static double tasso = 0.02; 
    private static int numeroUltimoContoCreato = 1000;

    public ContoCorrente(double saldoIniziale) {
        saldo = saldoIniziale;
        numeroUltimoContoCreato++;
        numero = numeroUltimoContoCreato;
    }

    public void versa(double somma) {
        saldo += somma;
        System.out.println("Versati " + somma + "euro.");
    }

    public boolean preleva ( double somma ) {
        if ( saldo < somma ) return false ;
        else {
        saldo -= somma ;
        System.out.println (" Prelevati : " + somma + " euro ");
        return true ;
        }
    }
        
    public double ottieniSaldo(){
        return saldo;
    }

    public double ottieniNumero(){
        return numero;
    }

    public double maturaInteressi(){
        saldo += saldo*tasso;
    }
}