package Serialization;

import java.io.Serializable;

public class ExampleClas implements Serializable {
    int wiek;
    String imie;
    boolean czyM;

    ExampleClas(int w, String n, boolean czy){
        this.wiek=w;
        this.imie=n;
        this.czyM=czy;
    }
}
