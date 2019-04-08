package Homework1;

public class Suma {
    public static void main(String[] args){
        double res=suma(Double.valueOf(args[0]),Double.valueOf(args[1]));
        System.out.println("Suma to: "+res);
    }

    static public double suma(double a, double b){
        return a+b;
    }
}
