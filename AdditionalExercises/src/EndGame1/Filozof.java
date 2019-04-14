package EndGame1;

import java.util.Random;

public class Filozof implements Runnable{

    volatile Object leftFork;
    volatile Object rightFork;

    public Filozof(Object l , Object r){
        this.leftFork=l;
        this.rightFork=r;
    }

    @Override
    public void run(){
        try{
            while(true){
                //myśli
                doSomething("I'm thinking");
                synchronized (leftFork){
                    doSomething(": Picked up left fork");
                    synchronized (rightFork){
                        //je
                        doSomething(": Picked up right fork, eating");

                        doSomething(": Put down right fork");
                    }

                    //Back to thinking
                    doSomething(": Put down left fork. Thinking again.");
                }
            }
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    private void doSomething(String action) throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" "+action);
        Thread.sleep((int)(Math.random()*3000));
    }
}
