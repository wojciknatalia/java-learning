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
        setTablicaA();
        while (true){
            synchronized (sedzia.lock){
                while(sedzia.lock.flag!=1)
                    sedzia.lock.wait();
                sedzia.strzal1(rand.nextInt(9), rand.nextInt(9));
                sedzia.lock.setVal(2);
                sedzia.lock.notify();
            }
        }
    }

    public void graB() throws InterruptedException{
        setTablicaB();
        while (true){
            synchronized (sedzia.lock){
                while(sedzia.lock.flag!=2)
                    sedzia.lock.wait();
                sedzia.strzal2(rand.nextInt(9), rand.nextInt(9));
                sedzia.lock.setVal(1);
                sedzia.lock.notify();
            }
        }
    }

}
