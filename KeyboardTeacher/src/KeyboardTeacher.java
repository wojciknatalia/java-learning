import java.io.*;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
public class KeyboardTeacher {

    public static void main(String[] args) throws IOException{

        long startTime = System.nanoTime(); //start time calculating

        String filePath=args[0];
        BufferedReader fileReader = Files.newBufferedReader(Paths.get(filePath), StandardCharsets.UTF_8); //read UTF-8 encoded file
        BufferedReader writer = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)); //set UTF-8 for user input
        String fileLine = fileReader.readLine().replace("\uFEFF", ""); //remove BOM
        boolean isSuccess = true; //determines "Gratulacje"

        mainLoop:
        while(fileLine != null){
           System.out.println(fileLine);
           String writeLine = writer.readLine();

           for (int i = 0; i < fileLine.length(); i++){
               if(i >= writeLine.length() || fileLine.charAt(i) != writeLine.charAt(i)) //check if user input was too short or not match
               {
                   System.out.println("Popełniono błąd w znaku o indeksie: " + (i + 1));
                   isSuccess = false;
                   break mainLoop;
               }
               if(i == fileLine.length()-1 && fileLine.length() < writeLine.length()) { //check if user input was too long
                   System.out.println("Popełniono błąd w znaku o indeksie: " + (i + 2));
                   isSuccess = false;
                   break mainLoop;
               }
           }
               fileLine=fileReader.readLine();
        }

        long endTime=System.nanoTime();

        if(isSuccess == true)
            System.out.println("Gratulacje! Czas działania: " + TimeUnit.SECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS) + " sekund");

    }

}
