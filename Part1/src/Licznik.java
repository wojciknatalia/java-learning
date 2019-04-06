public class Licznik {
    static int counter=0;
    Licznik(){
        counter++;
    }

    public static void Wypisz(){
        System.out.println("Counter: "+counter);
    }

    public static void main(String[] args){
        Licznik.Wypisz();
        Licznik c1=new Licznik();
        Licznik c2=new Licznik();
        Licznik.Wypisz();
    }
}
