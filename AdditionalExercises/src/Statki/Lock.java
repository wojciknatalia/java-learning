package Statki;

public class Lock {
    public volatile int flag;

    public void setVal(int val){
        this.flag=val;
    }
}
