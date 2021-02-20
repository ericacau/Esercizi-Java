public class Rettangolo{
    //stato interno del triangolo
    private double altezza;
    private double base;
    //metodi
    public Rettangolo(double altezzaIniziale, double baseIniziale){
        altezza = altezzaIniziale;
        base = baseIniziale;
    }

    public void ridimensiona(double nuovaAltezza, double nuovaBase) {
        altezza = nuovaAltezza;
        base = nuovaBase;
    }

    public double perimetro(){
        return 2*(altezza+base);
    }

    public double area(){
        return base*altezza;
    }
}