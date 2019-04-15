package Szpital;

import java.util.ArrayList;
import java.util.Random;

public class Pokoj {
    volatile int lekarzFlaga;
    int iluLekarzy=0;
    Lekarz lekarz;
    ArrayList<Osoba> osoby;

    public void wizytaLekarza(Lekarz doktor, Pokoj sala){
        sala.iluLekarzy++;
        if (sala.osoby.size() == 0 && lekarzFlaga == 0) {
            this.lekarz=doktor;
            lekarzFlaga=1;
        }
    }

    public void wejscieOdwiedzajacego(Osoba odwiedzajacy, Pokoj sala){
        if(lekarzFlaga==0 && sala.osoby.size()<4){
            sala.osoby.add(odwiedzajacy);
        }
    }

    public void wyjscieOdwiedzajacego(Osoba odwiedzajacy, Pokoj sala){
        sala.osoby.remove(odwiedzajacy);
    }

    public void wyjscieLekarza(Lekarz doktor, Pokoj sala){
        this.lekarz=null;
        lekarzFlaga=0;
    }

    public static void main(String[] args) throws InterruptedException{
        Pokoj sala=new Pokoj();
        sala.lekarzFlaga=0;
        sala.osoby=new ArrayList<>();
        Random rand=new Random();

        Lekarz lekarz=new Lekarz(sala);
        Osoba osoba=new Osoba(sala);

        Thread t1=new Thread(lekarz);
        Thread t2=new Thread(osoba);

        t1.start();
        t2.start();

        while(true){
            Thread.sleep(500);
            System.out.println("Szpital zawiera "+sala.lekarzFlaga+" lekarzy i "+sala.osoby.size()+" odwiedzających");
        }
    }
}
