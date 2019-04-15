package Szpital;

import java.util.Random;

public class Osoba implements Runnable {

    Pokoj pokoj;
    Random rand = new Random();

    Osoba(Pokoj room) {
        this.pokoj = room;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (pokoj) {
                    if (rand.nextInt(2) == 1) {
                        Osoba osoba=new Osoba(pokoj);
                        try{
                            Thread.sleep(rand.nextInt(500));
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        pokoj.wejscieOdwiedzajacego(osoba, pokoj);
                        try{
                            Thread.sleep(rand.nextInt(500));
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        pokoj.wyjscieOdwiedzajacego(osoba, pokoj);
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
