package ExtraExercise5;

public class Square extends Rectangle {
    Square(){};
    Square(double side){
        super(side, side);
    }
    Square(double side, String col, boolean fill){
        super(side, side, col, fill);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        this.setHeight(side);
        this.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        this.setWidth(side);
    }
    @Override
    public void setHeight(double side){
        this.setHeight(side);
    }
    @Override
    public String toString(){
        return "Kwadrat, bok - "+this.getSide();
    }

    public static void main(String[] args){
        Square kwadrat=new Square(2);
        System.out.println(kwadrat.toString());
        System.out.println("Pole: "+kwadrat.getArea());
    }
}
