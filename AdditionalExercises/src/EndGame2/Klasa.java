package EndGame2;

import java.io.*;
import java.lang.reflect.*;
import java.lang.*;
import java.util.*;

public class Klasa {

    ArrayList<Field> pola=new ArrayList<>();
    HashMap<Field, Integer> map=new HashMap<>();

    public void PrintFields(Object obj){

        int x=1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                String name = field.getName();
                String value = field.getType().toString();
                System.out.println(x + ": " + name + " - " + value);
                pola.add(field);
                map.put(field, 1);
                x++;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //wczytaj od użytkowanika, które pola chce zapisać
        ArrayList<Integer> indexDoSerializacji=new ArrayList<>();
        System.out.println("Podaj, które pola chcesz zapisać oddzielone spacją");

        try {
            String line=br.readLine();
            String[] strs = line.trim().split("\\s+");
            for(int i=0; i<strs.length; i++){
                indexDoSerializacji.add(Integer.parseInt(strs[i]));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        x=1;
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                for(int k:indexDoSerializacji){
                    if(x==k){
                        field.setAccessible(true);
                        map.replace(field,null);
                    }
                }
                pola.add(field);
                x++;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //serializuj dane pola
        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("serializeFile.bin"))){
            outputStream.writeObject(obj);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public Object Deserialize() throws IOException, ClassNotFoundException{
        Object object=new Object();
        try(ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("serializeFile.bin"))){
            Object obj=(Object)inputStream.readObject();
            System.out.println("Odczytano");
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if((map.get(field)==null))
                {
                    String val=field.get(obj).toString();
                    String name = field.getName();
                    String type = field.getType().toString();
                    System.out.println(type+" - "+name + " - " + val);
                    //object.getClass().getDeclaredField(field.getName()).set(object, field.get(obj));

                }
            }
            object=obj;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return object;
    }

    public static void main(String[] args){

        ExampleClas proba=new ExampleClas(12,"Jarek",true);
        Object obj=new Object();
        Klasa klasa=new Klasa();
        klasa.PrintFields(proba);
        try{
            obj=klasa.Deserialize();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
