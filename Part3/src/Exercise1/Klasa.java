package Exercise1;

/*Stwórz interfejs zawierający przynajmniej jedną metodę. Zaimplementuj go
poprzez zdefiniowanie klasy zagnieżdżonej w obszarze metody, która zwraca referencje do
Twojego interfejsu. */

public class Klasa {
    public Interfejs ZwrocInter(){
        class InnerKlasa implements Interfejs{ //klasa zagnieżdżona
            public void MetodaPierwsza(){
                System.out.println("InnerKlasa: Metoda pierwsza");
            }
        }
        return new InnerKlasa(); //zwraca referencję do interfejsu
    }

    public static void main(String[] args){
        Klasa klasa=new Klasa();
        Interfejs interfejs=klasa.ZwrocInter();
        interfejs.MetodaPierwsza();
    }
}
