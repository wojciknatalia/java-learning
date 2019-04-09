package Exercise1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTime {
    public void Deserialize() throws IOException, ClassNotFoundException {

        //try-with-resource: przed blokiem objętym try możemy zainicjalizować zmienne, które zostaną automatycznie zamknięte
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("seria.bin"))) {
            PersistentTime readpT = (PersistentTime) inputStream.readObject();
            System.out.println("Odczytano: " + readpT.newDate);
        }
    }
}
