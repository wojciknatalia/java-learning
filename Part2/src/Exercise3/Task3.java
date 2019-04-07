package Exercise3;

public class Task3 {

    public static void Rzutowanie(Nadrzedna3 nadrzedna){
        if(nadrzedna instanceof Pochodna3a){
            Pochodna3a pA=(Pochodna3a)nadrzedna;
            pA.print();
        }
        else  if(nadrzedna instanceof Pochodna3b){
            Pochodna3b pB=(Pochodna3b)nadrzedna;
            pB.print();
        }
        else
            System.out.println("Error, bad instance");
    }

    public static void main(String[] args){
        Pochodna3a p1=new Pochodna3a();
        Pochodna3b p2=new Pochodna3b();

        Task3.Rzutowanie(p1);
        Task3.Rzutowanie(p2);
    }
}
