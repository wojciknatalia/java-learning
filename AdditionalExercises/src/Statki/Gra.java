package Statki;

public class Gra {
    public static void main(String[] args) throws InterruptedException{
        Tablica aTab=new Tablica();
        Tablica bTab=new Tablica();
        Sedzia sedzia=new Sedzia();
        final Gracz graczA=new Gracz(sedzia);
        final Gracz graczB=new Gracz(sedzia);
        graczA.setTablicaA();
        graczB.setTablicaB();
        sedzia.lock.setVal(1);

        Thread tA=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    graczA.graA();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread tB=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    graczB.graB();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        tA.start();
        tB.start();

    }
}
