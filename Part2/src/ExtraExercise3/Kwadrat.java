package ExtraExercise3;

public class Kwadrat extends Figura {
    int bok;
    Kwadrat(int a){
        this.bok=a;
    }
    @Override
    public void PolePowierzchni(){
        System.out.println("Pole: "+bok*bok);
    }
}
