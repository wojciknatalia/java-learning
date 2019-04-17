package Hospital;

import java.util.Random;

public class Lekarz implements Runnable {

    volatile Sala sala;
    volatile int flaga=0;
    Lock lock;
    Random random=new Random();

    Lekarz(Sala s, Lock lock){
        this.sala=s;
        this.lock=lock;
    }

    @Override
    public void run(){
        try {
            while (true){
                synchronized (sala){
                    flaga=1;
                    lock.flag=1;
                    Thread.sleep(random.nextInt(500));
                }
                lock.flag=0;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
