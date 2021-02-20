public class TestRettangolo {
    public static void main(String[] args){
    Rettangolo r1 = new Rettangolo(10,20);
    Rettangolo r2 = new Rettangolo(13,17);
    Rettangolo r3 = new Rettangolo(9,16);


    //ne calcola la somma delle aree e la somma dei perimetri 
    //(stampando i risultati), ridimensiona uno dei tre rettangoli 
    //e ristampa le somme.

    System.out.println("La somma delle aree dei tre rettangoli: " +r1.area()+ r2.area()+ r3.area());
    System.out.println("La somma dei perimetri dei tre rettangoli  " + r1.perimetro()+ r2.perimetro()+ r3.perimetro());

    }
    
}