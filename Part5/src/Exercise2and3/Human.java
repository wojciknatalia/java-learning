package Exercise2and3;

import java.io.Serializable;

public class Human implements Serializable {
    transient int wiek; //teraz nie będzie można odczytać wieku - będzie zapisany jako null
    String imie;
    Human(int age, String name){
        this.wiek=age;
        this.imie=name;
    }

    //Wyjątek będzie, jeśli klasa nie będzie miała "implements Serializable"
}
