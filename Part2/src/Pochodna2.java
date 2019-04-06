public class Pochodna2 extends Nadrzedna2 {
    int val=2;
    @Override
    void print(){
        System.out.println("Pochodna2 -> val="+val);
    }

    static public void main(String[] args){
        Pochodna2 pochodna2=new Pochodna2();
        pochodna2.print();

        /* output
        Pochodna2 -> val=0
        Pochodna2 -> val=2
        najpierw wywoła się dla klasy nadrzędnej*/
    }
}
