public class LiczbaZespolona {
    float Re;
    float Im;

    public void Wypisz(){
        System.out.println(Re+"+i"+Im);
    }

    public void UstawWartosci(float a, float b){
        this.Re=a;
        this.Im=b;
    }

    public static LiczbaZespolona Dodaj(LiczbaZespolona z1, LiczbaZespolona z2){
        LiczbaZespolona res=new LiczbaZespolona();
        res.Re=z1.Re+z2.Re;
        res.Im=z1.Im+z2.Im;
        return res;
    }

    public static void main(String args[]){
        LiczbaZespolona z1=new LiczbaZespolona();
        LiczbaZespolona z2=new LiczbaZespolona();
        z1.UstawWartosci((float)1,(float)1);
        z2.UstawWartosci((float)2,(float)2);
        z1.Wypisz();
        z2.Wypisz();
        LiczbaZespolona res=Dodaj(z1,z2);
        res.Wypisz();
    }
}
