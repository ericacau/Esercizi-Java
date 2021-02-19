import java.util.Scanner;

public class SpeciePrimaProva {
    public String nome;
    public int popolazione;
    public double tassocrescita;

    public void leggiInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual è il nome della specie?");
        nome = input.nextLine();
        System.out.println("A quanto ammonta la popolazione");
        popolazione = input.nextInt();
        System.out.println("Inserisci il tasso di crescita" + "(% crescita per anno)");
        tassocrescita = input.nextDouble();
    }
    public void scriviOutput(){
        System.out.println("Nome = " + nome);
        System.out.println("Popolazione = " + popolazione);
        System.out.println("Tasso Crescita = " + tassocrescita + "%");
    }

    public int prediciPopolazione(int anni){
        int risultato = 0;
        double totalePopolazione = popolazione;
        int contatore = anni;

        while((contatore > 0) && (totalePopolazione > 0)){
            totalePopolazione = (totalePopolazione + (tassocrescita/100)*totalePopolazione);
            contatore--;
        }
        if(totalePopolazione > 0)
            risultato = (int) totalePopolazione;
        return risultato;
    }

}