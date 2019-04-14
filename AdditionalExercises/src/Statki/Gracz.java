package Statki;

import java.util.Random;

public class Gracz{

    Tablica tablica;
    Sedzia sedzia;
    Random rand=new Random();

    Gracz(Sedzia judge){
        this.tablica=new Tablica();
        this.sedzia=judge;
        tablica.genereteTab();
    }

    public void setTablicaA(){
        sedzia.setTablicaOne(tablica);
    }

    public void setTablicaB(){
        sedzia.setTablicaTwo(tablica);
    }

    public void graA() throws InterruptedException{
        while (true){
            synchronized (this){
                sedzia.strzal1(rand.nextInt(9), rand.nextInt(9));
                notify();
            }
        }
    }

    public void graB() throws InterruptedException{
        while (true){
            synchronized (this){
                sedzia.strzal2(rand.nextInt(9), rand.nextInt(9));
                notify();
            }
        }
    }

}
