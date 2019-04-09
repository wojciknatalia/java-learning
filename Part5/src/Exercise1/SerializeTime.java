package Exercise1;

import java.io.*;

public class SerializeTime {
    public void Serialize(PersistentTime pT) throws IOException, ClassNotFoundException{
        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("seria.bin"))){
            outputStream.writeObject(pT);
        }
    }
}
