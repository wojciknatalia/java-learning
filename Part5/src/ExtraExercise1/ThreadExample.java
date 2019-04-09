package ExtraExercise1;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException{

        //object of class that has produce() and consume() methods
        final PC pc=new PC();

        //create producer thread
        Thread tP=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    pc.produce();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread tC=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    pc.consume();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        //start both threads
        tP.start();
        tC.start();

        tP.join();
        tC.join();
        /*If t is a Thread object whose thread is currently executing,
        then t.join() will make sure that t is terminated before the next instruction is executed by the program.*/
    }
}
