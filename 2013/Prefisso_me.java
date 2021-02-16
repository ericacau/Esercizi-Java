import java.util.Scanner;


public class Prefisso_me {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringa = input.nextLine();
        System.out.println(estraiPrefisso(stringa));
    }
        private static String estraiPrefisso(String s) {
            if(s.length()>=3){
                s.substring(0,3);
                return s;
            }
    }
}
