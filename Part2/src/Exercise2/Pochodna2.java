package Exercise2;

public class Pochodna2 extends Nadrzedna2 {
    int val=2;
    @Override
    void print(){
        System.out.println("Exercise2.Pochodna2 -> val="+val);
    }

    static public void main(String[] args){
        Pochodna2 pochodna2=new Pochodna2();
        pochodna2.print();

        /* output
        Exercise2.Pochodna2 -> val=0
        Exercise2.Pochodna2 -> val=2
        najpierw wywoła się dla klasy nadrzędnej*/
    }
}
