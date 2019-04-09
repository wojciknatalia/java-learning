package ExtraExercise1;

import java.util.LinkedList;
import java.util.Random;

public class PC {

    LinkedList<Integer> pudelko=new LinkedList<>();
    int capacity=10; //max elements
    Random rand=new Random();

    //called by producer thread - włóż()
    public void produce() throws InterruptedException{
        while (true){
            synchronized (this) {
                //wait while list if full
                while (pudelko.size() == capacity)
                    wait();

                int val = rand.nextInt(9);
                pudelko.add(val);
                System.out.println("Produced: " + val);

                notify(); //notify consumer thread that it can start consuming
                Thread.sleep(rand.nextInt(100));
            }
        }
    }

    //called by consumer thread - weź()
    public void consume() throws InterruptedException{
        while (true){
            synchronized (this){
                //wait while list is empty
                while (pudelko.size()==0)
                    wait();

                int val=pudelko.removeFirst();
                System.out.println("Consumed: "+val);

                notify(); //notify producent
            }
        }
    }
}
