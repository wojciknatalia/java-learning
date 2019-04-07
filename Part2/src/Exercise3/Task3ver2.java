package Exercise3;

public class Task3ver2 {

    public static void Rzutowanie(Nadrzedna3 nadrzedna){
        nadrzedna.print();
    }

    public static void main(String[] args){
        Rzutowanie(new Pochodna3a());
        Rzutowanie(new Pochodna3b());
    }
}
