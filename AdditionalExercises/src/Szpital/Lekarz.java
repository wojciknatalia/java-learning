package Szpital;

import java.util.Random;

public class Lekarz implements Runnable{

    volatile Pokoj pokoj;
    Random rand=new Random();

    Lekarz(Pokoj room){
        this.pokoj=room;
    }

    @Override
    public void run(){
        try{
            while(true){
                synchronized (pokoj){
                    if((rand.nextInt(5))==0){ //20 procent szans
                        try{
                            Thread.sleep(rand.nextInt(500));
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        pokoj.wizytaLekarza(this, pokoj);
                        try{
                            Thread.sleep(rand.nextInt(500));
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        pokoj.wyjscieLekarza(this, pokoj);
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
