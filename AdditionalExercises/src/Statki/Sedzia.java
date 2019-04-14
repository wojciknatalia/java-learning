package Statki;

public class Sedzia {

    Tablica pierwsza;
    Tablica druga;
    int punktyGraczA=0;
    int punktyGraczB=0;

    void setTablicaOne(Tablica a){
        this.pierwsza=a;
    }

    void setTablicaTwo(Tablica b){
        this.druga=b;
    }

    //strzela gracz1
    void strzal1(int wiersz, int kolumna){
        if((druga.shipsTab[wiersz][kolumna])==1)
        {
            druga.shipsTab[wiersz][kolumna]=0;
            punktyGraczA++;
            System.out.println("Punkty A: "+punktyGraczA);
            if(punktyGraczA==19){
                System.out.println("Wygrał gracz A!");
            }
        }
    }

    //strzela gracz2
    void strzal2(int wiersz, int kolumna){
        if((pierwsza.shipsTab[wiersz][kolumna])==1)
        {
            pierwsza.shipsTab[wiersz][kolumna]=0;
            punktyGraczB++;
            System.out.println("Punkty B: "+punktyGraczB);
            if(punktyGraczB==19){
                System.out.println("Wygrał gracz A!");
            }
        }
    }
}
