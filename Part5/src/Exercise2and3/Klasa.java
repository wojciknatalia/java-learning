package Exercise2and3;

import java.io.*;

public class Klasa {

    public void SerializeHuman(Human h) throws IOException, ClassNotFoundException{
        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("human.bin"))){
            outputStream.writeObject(h);
        }
    }

    public void DeserializeHuman() throws IOException, ClassNotFoundException{
        try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("human.bin"))) {
            Human readH = (Human) input.readObject();
            System.out.println("Odczytano: " + readH.imie + " " + readH.wiek);
        }
    }

    public static void main(String[] args){

        Klasa klasa=new Klasa();
        Human czlowiek=new Human(11,"Alojzy");

        try{
            klasa.SerializeHuman(czlowiek);
        }
        catch (Exception e){
            System.out.println("Serialize error");
        }

        try {
            klasa.DeserializeHuman();
        }
        catch (Exception e){
            System.out.println("Deserialize error");
        }
    }
}
