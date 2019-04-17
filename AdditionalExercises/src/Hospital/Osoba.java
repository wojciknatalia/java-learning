package Hospital;

import Szpital.Pokoj;

import java.util.ArrayList;
import java.util.Random;

public class Osoba implements Runnable {

    volatile Sala sala;
    ArrayList<Osoba> osoby;
    Random random = new Random();
    Lock lock;

    Osoba(Sala s, ArrayList osoby, Lock lock) {
        this.sala = s;
        this.osoby = osoby;
        this.lock=lock;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (lock) {
                    if (lock.flag==0)
                    {
                        Thread.sleep(random.nextInt(500));
                        if (osoby.size() < 5) {
                            osoby.add(this);
                            Thread.sleep(random.nextInt(500));
                            osoby.remove(this);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
