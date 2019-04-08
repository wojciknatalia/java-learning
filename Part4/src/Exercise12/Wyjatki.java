package Exercise12;

import java.lang.reflect.*;
import java.util.Arrays;

public class Wyjatki {

    MyException newEx=new MyException("This is ex");

    Wyjatki() throws MyException
    {
        throw newEx;
    }

    public static void main(String[] args) {

        try
        {
            Wyjatki use=new Wyjatki();
        }
        catch(MyException myEx)
        {
            System.out.println("This is my exception: " + myEx.getMsg());
            System.out.println("Class name: " + myEx.getClass().getName());
            // użycie Modifier
            System.out.println("Class modifier: " + Modifier.toString(myEx.getClass().getModifiers()));

            System.out.println("Class package: " + myEx.getClass().getPackage());
            System.out.println("Class super: " + myEx.getClass().getSuperclass());

            Class[] i=myEx.getClass().getInterfaces();
            System.out.println("Class interfaces: " + Arrays.asList(i));

            Constructor[] c=myEx.getClass().getConstructors();
            System.out.println("Class constructor: " + Arrays.asList(c));

            Method[] m=myEx.getClass().getDeclaredMethods();
            System.out.println("Class methods: " + Arrays.asList(m));

            Field[] f=myEx.getClass().getDeclaredFields();
            System.out.println("Class fields: " + Arrays.asList(f));

        }
    }
}