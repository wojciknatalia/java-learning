package Exercise22;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.lang.reflect.*;
import java.util.Arrays;
import java.io.IOException;

public class ABC {
    int liczba;
    String imie;

    void drukujImie(){
        System.out.println(imie);
    }

    int mnozLiczbe(){
        return liczba*liczba;
    }

    void rzucWyjatek(){
        throw new RuntimeException("BUM BUM");
    }

    public static void main(String args[])
    {
        ABC obj=new ABC();
        try{
            obj.rzucWyjatek();}
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        Field[] f=obj.getClass().getDeclaredFields();
        System.out.println("Class fields: " + Arrays.asList(f));
    }
}