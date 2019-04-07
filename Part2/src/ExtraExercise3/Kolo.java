package ExtraExercise3;

public class Kolo extends Figura {
    int r;
    Kolo(int promien){
        this.r=promien;
    }
    @Override
    public void PolePowierzchni(){
        System.out.println("Pole: "+Math.PI*r*r);
    }
}
