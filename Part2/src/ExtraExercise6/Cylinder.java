package ExtraExercise6;

public class Cylinder {
    private Circle base;
    private double height;
    Cylinder(Circle b, double h){
        this.base=b;
        this.height=h;
    }
    public void getCircleRad(){
        System.out.println("Cylinder: Circle rad is: "+base.getRadius());
    }

    public static void main(String[] args){
        Circle kolo=new Circle(2, "red");
        Cylinder cyl=new Cylinder(kolo, 2);
        cyl.getCircleRad();
    }
}
