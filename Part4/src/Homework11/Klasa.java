package Homework11;

public class Klasa {

    public static String[] tablica;

    public String pierwszyElement(){
        System.out.println("Pierwszy element: "+tablica[0]);
        return tablica[0];
    }
    public String wybranyElement(int i) throws BrakElementu{
        pierwszyElement();
        if (i-1>=tablica.length)
            throw new BrakElementu("Brak elementu!");
        return tablica[i];
    }

    public void dowolnyElement() throws TablicaNieUtworzona{
        if(this.tablica==null)
            throw new TablicaNieUtworzona("Tablica nie utworzona!");

        pierwszyElement();
    }

    public static void main(String[] args){
        Klasa klasa=new Klasa();
        try {
            //klasa.dowolnyElement(); //da output "Tablica nie utworzona!"

            tablica=new String[]{"Aaa", "Bbb"};
            klasa.dowolnyElement();
            klasa.wybranyElement(3);

            //output: Brak elementu!

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
