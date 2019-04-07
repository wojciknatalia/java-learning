package ExtraExercise4;

public class Cylinder extends Circle{
    private double height=1;
    public Cylinder(){};
    public Cylinder(double rad){
        super(rad);
    }
    public Cylinder(double rad, double height){
        super(rad);
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return Math.PI*this.getRadius()*this.getRadius()*this.height;
    }

    public static void main(String[] args){
        Circle kolo=new Circle(5);
        System.out.println(kolo.toString());
        Cylinder cyl=new Cylinder(2,3);
        System.out.println(cyl.toString());
        System.out.println("Volume = "+cyl.getVolume());
    }
}
