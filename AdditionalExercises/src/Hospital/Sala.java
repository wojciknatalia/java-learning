package Hospital;

import java.util.ArrayList;
import java.util.Random;

public class Sala {

    public static void main(String[] args) throws Exception {

        Sala sala = new Sala();
        Lock lock=new Lock();
        //final Lekarz lekarz = new Lekarz(sala, lock);
        ArrayList<Osoba> osoby = new ArrayList<>();
        Random random = new Random();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run(){

                if (random.nextInt(2) == 1) {
                    Osoba osoba = new Osoba(sala, osoby, lock);
                    if(osoby.size()<5){
                    Thread t1 = new Thread(osoba);
                    t1.start(); }
                }

                if((random.nextInt(5))==0){
                    Lekarz lekarz=new Lekarz(sala, lock);
                    Thread t2=new Thread(lekarz);
                    t2.start();
                }
                try{
                    Thread.sleep(100);}
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        while (true) {
            Thread.sleep(500);
            System.out.println("Szpital zawiera "+lock.flag+" lekarzy i "+osoby.size()+" odwiedzających");
        }
    }
}
