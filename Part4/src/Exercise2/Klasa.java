package Exercise2;

public class Klasa {

    int[] tab;

    Klasa(int n){
        if(n>5)
            throw new IllegalArgumentException("Amount of klasa tab must be < 5");

        tab=new int[n];
        for(int i=0; i<n;i++)
            tab[i]=i+1;
    }

    void printTab(){
        for(int i:tab)
            System.out.println("Next element is: "+i);
    }

    int[] OdwrocTablice(){
        int tmp;

        for(int i=0; i<tab.length/2; i++){
            tmp=tab[i];
            tab[i]=tab[(tab.length)-1-i];
            tab[(tab.length)-1-i]=tmp;
        }
        return tab;
    }

    int[] Rozmiar(){
        int[] rozmiar=new int[2];
        rozmiar[0]=tab.length;
        rozmiar[1]=tab.length*4;

        return rozmiar;
    }

    int IloscParzystych(){
        int res=0;
        for(int i:tab)
        {
            if(i%2==0)
                res++;
        }
        return res;
    }

    public static void main(String[] args){
        Klasa klasa=new Klasa(4);
        klasa.printTab();
        System.out.println("-- odwracam --");
        klasa.OdwrocTablice();
        klasa.printTab();
        System.out.println("-- drukuję rozmiar --");
        System.out.println(klasa.Rozmiar()[0]);
        System.out.println("Ilosc parzystych: " + klasa.IloscParzystych());
    }
}
