package Exercise12;

public class MyException extends Exception {

    public MyException(String ex) {
        super(ex); //odpowiada za stworzenie wyjątku
    }

    public String getMsg() {
        return super.getMessage(); //odpowiada za wiadomość z wyjątku
    }
}