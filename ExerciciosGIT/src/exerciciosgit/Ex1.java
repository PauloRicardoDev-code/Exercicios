package exerciciosgit;

/**
 *
 * @author paulo
 */
public class Ex1 {

    private double C;
    private double F;
    private double K;
    private double Re;
    private double Ra;

    public Ex1() {
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getF() {
        return F;
    }

    public void setF(double F) {
        this.F = F;
    }

    public double getK() {
        return K;
    }

    public void setK(double K) {
        this.K = K;
    }

    public double getRe() {
        return Re;
    }

    public void setRe(double Re) {
        this.Re = Re;
    }

    public double getRa() {
        return Ra;
    }

    public void setRa(double Ra) {
        this.Ra = Ra;
    }
    
    public double fahrenheit(double C) {
        double F = C * 1.8 + 32;
        return F;
    }
    
    public double kelvin(double C) {
        double K = C + 273.15;
        return K;
    }
    
    public double reaumur(double C) {
        double Re = C * 0.8; 
        return Re;
    }
    
    public double rankine(double C) {
        double Ra = C * 1.8 + 32 + 459.67;
        return Ra;
    }
    
    public void descrever(double C){
        
        Ex1 celsius = new Ex1();
        
        System.out.println("A temperatura em Celsius - C°" + celsius.getC());
        
        System.out.println("A temperatura em Fahrenheit - F°" + celsius.fahrenheit(celsius.getC()));
        
        System.out.println("A temperatura em Kelvin - K°" + celsius.kelvin(celsius.getC()));
        
        System.out.println("A temperatura em reaumur - Re°" + celsius.reaumur(celsius.getC()));
        
        System.out.println("A temperatura em rankine - Ra°" + celsius.rankine(celsius.getC()));
    }
    
}
