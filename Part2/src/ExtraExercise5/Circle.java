package ExtraExercise5;

public class Circle extends Shape {
    private double radius=1;
    public Circle(){};
    public Circle(double rad){
        this.radius=rad;
    }
    public Circle(double rad, String col, boolean fill){
        super(col, fill);
        this.radius=rad;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString(){
        return "Kolo - rad: "+this.radius;
    }
}
