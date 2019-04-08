package Exercise3;

public class Klasa {
    void zjedzPamiec(){
        int[] tab=new int[50000];
        for(int i=0;i<50000;i++)
            tab[i]=i;
    }

    public static void main(String[] args){
        Klasa klasa=new Klasa();
        //-- wolna pamięć
        System.out.println("Free memory: "+Runtime.getRuntime().freeMemory());
        klasa.zjedzPamiec();
        //-- po zjedzeniu
        System.out.println("Omnomnom: "+Runtime.getRuntime().freeMemory());

        System.gc(); //garbage collector
        System.out.println("After GC: "+Runtime.getRuntime().freeMemory());
    }

    /*Output:
    Free memory: 126240304
    Omnomnom: 124240288
    After GC: 127893912
*/
}
