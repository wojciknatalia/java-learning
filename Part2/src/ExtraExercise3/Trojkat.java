package ExtraExercise3;

public class Trojkat extends Figura{
    int bok;
    int h;
    Trojkat(int a, int wys){
        this.bok=a;
        this.h=wys;
    }
    @Override
    public void PolePowierzchni(){
        System.out.println("Pole: "+bok*h/2);
    }
}
