package Exercise1;

public class Nadrzedna1 {
    public void MetodaJeden(){
        System.out.println(this.getClass().getCanonicalName());
        MetodaDwa();
    }

    public void MetodaDwa(){
        System.out.println("Exercise1.Nadrzedna1 -> MetodaDwa");
    }

    public static void main(String[] args){
        Pochodna1 pochodna=new Pochodna1();
        Nadrzedna1 rzutowana=(Nadrzedna1)pochodna;
        rzutowana.MetodaJeden();
    }
}
