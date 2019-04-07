package ExtraExercise4;

public class Road {
    void Zapisz(){
        System.out.println("Zapisz");
    }

    public static void startZapisz(Road road){
        road.Zapisz();
    }

    public static void main(String[] args){
        startZapisz(new Car());
        startZapisz(new TruckDriver());
    }
}
