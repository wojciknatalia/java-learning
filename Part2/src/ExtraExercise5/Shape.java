package ExtraExercise5;

public class Shape {
    private String color="red";
    private boolean filled=true;

    public Shape(){};
    public Shape(String col, boolean fill){
        this.color=col;
        this.filled=fill;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String col){
        this.color=col;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean fill){
        this.filled=fill;
    }
    @Override
    public String toString(){
        return "Color is "+this.color+". Filled? "+this.filled;
    }
}
