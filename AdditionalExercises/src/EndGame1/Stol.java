package EndGame1;

public class Stol {

    public static void main(String[] args) throws Exception{

        final Filozof[] filozofowie=new Filozof[5];
        Object[] widelce=new Object[5];

        for(int i=0;i<widelce.length;i++){
            widelce[i]=new Object();
        }

        for(int i=0; i<filozofowie.length; i++){
            Object leftFork=widelce[i];
            Object rightFork=widelce[(i+1)%widelce.length];

            if(i==filozofowie.length-1){
                //The last philosopher picks up the right fork first
                filozofowie[i]=new Filozof(rightFork,leftFork);
            }
            else
                filozofowie[i]=new Filozof(leftFork, rightFork);

            Thread thread=new Thread(filozofowie[i], "Filozof " + (i+1));
            thread.start();
        }

    }
}
