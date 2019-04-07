package ExtraExercise5;

public class Rectangle extends Shape {
    private double width=1;
    private double height=1;
    public Rectangle(){};
    public Rectangle(double x, double y){
        this.width=x;
        this.height=y;
    }
    public Rectangle(double x, double y, String col, boolean fill){
        super(col, fill);
        this.width=x;
        this.height=y;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double x) {
        this.width = x;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double y) {
        this.height = y;
    }
    public double getArea(){
        return this.height*this.height;
    }
    public double getPerimeter(){
        return 2*this.height+2*this.width;
    }
    @Override
    public String toString(){
        return "Prostokat - boki: "+this.width+" i "+this.height;
    }
}
