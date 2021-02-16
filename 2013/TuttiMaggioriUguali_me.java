import java.util.Scanner;

/*Scrivere un programma "TuttiMaggioriUguali" che prevede un array di 10 numeri interi
contenente valori a piacere (senza bisogno di chiederli all’utente) e stampa "tutti maggiori o uguali
al primo" se i valori dell’array sono tutti maggiori o uguali al primo (ad esempio: {5, 7, 9, 21, 76, 5,
10, 34, 67, 43} oppure stampa "NO" altrimenti. (Il programma deve essere scritto facendo finta di
non sapere quali siano i valori inseriti nell’array)*/
public class TuttiMaggioriUguali_me {
    public static void main(String[] args) {
        boolean maggioriUguali = true;

        int[] array_numerico = {5, 7, 9, 21, 76, 5,
10, 34, 67, 43};
        
        for(int i : array_numerico){
            if (i < array_numerico[0]){
                maggioriUguali = false;
            }
        }
        if(maggioriUguali){
            System.out.println("Tutti maggiori o uguali");
        } else
        System.out.println("NO");
    }
}

