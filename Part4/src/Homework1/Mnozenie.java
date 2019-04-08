package Homework1;

public class Mnozenie {
        public static void main(String[] args){
            double res=mnozenie(Double.valueOf(args[0]),Double.valueOf(args[1]));
            System.out.println("Iloczyn to: "+res);
        }

        static public double mnozenie(double a, double b){
            return a*b;
        }
}
