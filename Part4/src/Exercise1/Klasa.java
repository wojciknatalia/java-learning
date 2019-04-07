package Exercise1;

public class Klasa {
    Klasa(){
        System.out.println(this.getClass().getSimpleName());
    }
    Klasa(String arg){
        System.out.println(this.getClass().getSimpleName()+" + "+arg);
    }
    class InnerKlasa{
        InnerKlasa(){
            System.out.println(this.getClass().getSimpleName());
        }
    }

    public static void main(String[] args){
        Klasa[] klasy=new Klasa[2];

        Klasa mojaklasa1=new Klasa();
        klasy[0]=mojaklasa1;
        klasy[1]=new Klasa("Dwa");

        Klasa.InnerKlasa iKl=mojaklasa1.new InnerKlasa();

        //Klasa.Wewnętrza obj=mainKlasa.new Wewnętrzna();
        //typ=obiekt.create inner
    }
}
