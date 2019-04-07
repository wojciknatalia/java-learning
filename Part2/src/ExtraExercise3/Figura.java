package ExtraExercise3;

abstract public class Figura {
    abstract void PolePowierzchni();

    public static void Wywolaj(Figura fig){
        fig.PolePowierzchni();
    }

    static public void main(String[] args){
        Kwadrat kwadrat=new Kwadrat(2);
        Kolo kolo=new Kolo(3);
        Trojkat trojkat=new Trojkat(2,3);

        Wywolaj(kwadrat);
        Wywolaj(kolo);
        Wywolaj(trojkat);
    }
}
