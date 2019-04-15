package Filozofowie;

public class Filozof implements Runnable {
    volatile Object lewyWidelec;
    volatile Object prawyWidelec;

    Filozof(Object l, Object r){
        this.lewyWidelec=l;
        this.prawyWidelec=r;
    }

    @Override
    public void run(){
        try{
            while (true){
                wykonujCzynnosc("Czekam na widelce");
                synchronized (lewyWidelec){
                    wykonujCzynnosc("Złapałem lewy widelec");
                    synchronized (prawyWidelec){
                        wykonujCzynnosc("Dwa widelce! Jem!");
                        wykonujCzynnosc("Odkładam prawy widelec");
                    }
                    wykonujCzynnosc("Odkładam lewy widelec, myślę");
                }
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void wykonujCzynnosc(String czynnosc) throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" "+czynnosc);
        Thread.sleep(3000);
    }
}
