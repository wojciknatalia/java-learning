package Exercise3;

public class Klasa {
    private double zmienna=6;
    private void Metoda(){
        System.out.println("Klasa: metoda");
    }

    public class InnerKlasa{
        public void InnerMetoda(){
            Klasa zewKlasa=new Klasa();
            zewKlasa.zmienna=15;
            System.out.println("X to: "+zewKlasa.zmienna);
            zewKlasa.Metoda();
        }
    }

    public void MetodaDwa(){
        InnerKlasa innerKlasa=new InnerKlasa();
        innerKlasa.InnerMetoda();
    }

    public static void main(String[] args){
        Klasa kl=new Klasa();
        kl.MetodaDwa();
        System.out.println("X to: "+kl.zmienna);
    }
}
