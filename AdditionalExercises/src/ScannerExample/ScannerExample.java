package ScannerExample;

import java.util.InputMismatchException;
import java.util.Scanner;

/* -- Program pobiera 7 temperatur na kolejne dni i liczy średnią -- */
/* -- użycie Scanner (wymaga double), funkcji wielu argumentów -- */

public class ScannerExample {

    static double Suma(double ... numbers){ //funkcja wielu argumentów
        double sum=0;
        for(double temp : numbers){
            sum+=temp;
        }
        return sum;
    }

    public static void main(String[] args){

        double[] temperature=new double[7];
        Scanner inputScanner= new Scanner(System.in);

        for(int i=0; i<temperature.length; i++){
            try {
                System.out.println("Wprowadz temperature dnia " + (i + 1));
                temperature[i]=inputScanner.nextDouble();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Zostal podany bledny parametr!");
                System.exit(1);
            }
        }

        System.out.println("Srednia temperatura: "+Suma(temperature)/7);
    }
}
