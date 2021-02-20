public class Rettangolo{
    //stato interno del triangolo
    private double altezza;
    private double base;
    private double area;
    //metodi
    public Rettangolo(double nuovaAltezza, double nuovaBase){
        altezza = nuovaAltezza;
        base = nuovaBase;
    }

    public void ridimensiona(double nuovaAltezza, double nuovaBase) {
        altezza = nuovaAltezza;
        base = nuovaBase;
    }

    public double perimetro(double altezza, double base){
        return 2*(altezza+base);
    }

    public double area(){
        return base*altezza;
    }
}