package Filozofowie;

public class Stol {

    public static void main(String[] args){

        final Filozof[] filozofowie=new Filozof[5];
        Object[] widelce=new Object[5];

        for(int i=0; i<widelce.length; i++){
            widelce[i]=new Object();
        }

        for(int i=0; i<filozofowie.length; i++){
            Object lewyWidelec=widelce[i];
            Object prawyWidelec=widelce[(i+1)%widelce.length];

            if(i==filozofowie.length-1){
                //ostatni filozof pierwszy podnosi prawy widelec
                filozofowie[i]=new Filozof(prawyWidelec,lewyWidelec);
            }
            else
                filozofowie[i]=new Filozof(lewyWidelec,prawyWidelec);

            Thread thread=new Thread(filozofowie[i],"Filozof "+(i+1));
            thread.start();
        }
    }
}
