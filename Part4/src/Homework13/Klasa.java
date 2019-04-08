package Homework13;

public class Klasa {
    char[] c=new char[]{'a','b','c'};

    public static void main(String[] args){
        Klasa klasa=new Klasa();

        System.out.println(klasa.c.getClass().getTypeName()); //o: char[]
        System.out.println(klasa.c.getClass().isPrimitive()); //o: false
        System.out.println(klasa.c.getClass().getSuperclass()); //o: object
        System.out.println(klasa.c.getClass().getGenericSuperclass()); //o: object

        if(args.length!=0){
            Object o=args[0].getClass();
            while(!(o.equals(Object.class))){
                o=((Class) o).getSuperclass();
                System.out.println("Another level: "+o.toString());
            }
        }
    }
}
