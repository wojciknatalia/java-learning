package Exercise1;

public class Klasa {
    public static void main(String[] args){
        PersistentTime pT=new PersistentTime();
        pT.PersTimeParse();

        SerializeTime sT=new SerializeTime();
        try{
            sT.Serialize(pT);
        }
        catch (Exception e){
            System.out.println(e.getCause());
        }

        DeserializeTime dT=new DeserializeTime();
        try{
            dT.Deserialize();
        }
        catch (Exception e){
            System.out.println(e.getCause());
        }
    }
}
