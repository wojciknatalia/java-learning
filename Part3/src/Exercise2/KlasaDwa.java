package Exercise2;

public class KlasaDwa extends Klasa {
    public Interfejs zwrocKlase(){ //nie mogę zwracać typu innerKlasa - jest protected
        Klasa obj=new Klasa();
        return (Interfejs)(obj.zwrocInnerKlase());
        /*Metoda zwrocInnerKlase() musiała powstać, bo inaczej nie moglbyśmy
        * się dostać do zagniezdzonej klasy - ma modyfkator protected
        * i jest niedostępna z klasy dziedziczącej*/
    }
}
