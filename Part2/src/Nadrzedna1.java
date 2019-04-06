public class Nadrzedna1 {
    public void MetodaJeden(){
        System.out.println(this.getClass().getCanonicalName());
        MetodaDwa();
    }

    public void MetodaDwa(){
        System.out.println("Nadrzedna1 -> MetodaDwa");
    }

    public static void main(String[] args){
        Pochodna1 pochodna=new Pochodna1();
        Nadrzedna1 rzutowana=(Nadrzedna1)pochodna;
        rzutowana.MetodaJeden();
    }
}
