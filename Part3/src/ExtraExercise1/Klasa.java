package ExtraExercise1;

public class Klasa implements InterfejsOne, InterfejsTwo {
    public void Metoda1(){
        System.out.println("Metoda 1");
    }
    public void Metoda2(){
        System.out.println("Metoda 2");
    }

    public static void main(String[] args){
        Klasa klasa=new Klasa();
        klasa.Metoda1();
        klasa.Metoda2();

        /*If two interfaces contains a method with same signature but different return types,
        then it is impossible to implement both the interface simultaneously.*/
    }
}
