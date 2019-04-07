package Exercise2;

public class Klasa {
    protected class InnerKlasa implements Interfejs{
        public void Metoda(){
            System.out.println("InnerKlasa: metoda");
        }
    }
    public Interfejs zwrocInnerKlase(){
        return new InnerKlasa();
    } //inaczej nie będzie dostępu do InnerKlasy z klasy dziedziczącej,
    //bo ma modyfikator protected
}
