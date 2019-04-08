package Homework11;

public class TablicaNieUtworzona extends Exception{
    TablicaNieUtworzona(){
        super();
    }
    TablicaNieUtworzona(String msg){
        super(msg);
    }
    public void getError(){
        System.out.println(getClass().getSimpleName()+": "+super.getMessage());
    }
}
