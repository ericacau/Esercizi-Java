import java.util.Scanner;

public class SommaPositiviNegativiMe {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numeroInserito;
        int sommaPositivi = 0;
        int sommaNegativi = 0;
        
        System.out.println("Inserisci un numero:");
        do{
            numeroInserito = input.nextInt();
            if (numeroInserito >0){
                sommaPositivi = sommaPositivi+numeroInserito;
            }
            else {
                sommaNegativi = sommaNegativi+numeroInserito;
            }
        } while (numeroInserito != 0);

        System.out.println("Somma dei numeri positivi: " + sommaPositivi);
        System.out.println("Somma dei numeri negativi: " + sommaNegativi);
    }
}
