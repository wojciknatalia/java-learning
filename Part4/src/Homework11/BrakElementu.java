package Homework11;

public class BrakElementu extends Exception {
    BrakElementu(){
        super();
    }
    BrakElementu(String msg){
        super(msg);
    }
    public void getError(){
        System.out.println(getClass().getSimpleName()+": "+super.getMessage());
    }
}
