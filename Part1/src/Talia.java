public class Talia {
    private String[] kolor={"pik", "trefl", "karo", "kier"};
    private String[] figura={"2","3","4","5","6","7","8","9","10","W","D","K","A"};
    private Karta[] karty=new Karta[52];

    Talia(){
        for(int i=0;i<52;i++){
            karty[i]=new Karta(kolor[i%4], figura[i%12]);
        }
    }

    public void WypiszKarty(){
        for(int i=0;i<52;i++){
            System.out.println(karty[i].kolor+" - "+karty[i].figura);
        }
    }
}
