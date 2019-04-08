package Homework1;

import java.io.*;

public class Call {
    public static void main(String[] args){

        Process theProc=null;
        BufferedReader inStream=null;

        try{
            String separator=File.separator;
            //separator=System.getProperty("file.separator");

            runProcess("javac -cp src src"+separator+"Homework1"+separator+"Suma.java"); //compile
            runProcess("java -cp src Homework1.Suma 2 3"); //run

            runProcess("javac -cp src src\\Homework1\\Mnozenie.java"); //compile
            runProcess("java -cp src Homework1.Mnozenie 2 3"); //run
            System.out.println("**********");

            /*
            output
            javac -cp src src\Homework1\Suma.java - exitValue()0
            java -cp src Homework1.Suma 2 3 - stdout:  Suma to: 5.0
            java -cp src Homework1.Suma 2 3 - exitValue()0
            javac -cp src src\Homework1\Mnozenie.java - exitValue()0
            java -cp src Homework1.Mnozenie 2 3 - stdout:  Iloczyn to: 6.0
            java -cp src Homework1.Mnozenie 2 3 - exitValue()0
               */

        }
        catch (Exception e){
            System.err.println("Error on exec()");
        }
    }

    private static void printLines(String name, InputStream ins) throws Exception{
        String line=null;
        BufferedReader in=new BufferedReader(
                new InputStreamReader(ins));

        while ((line=in.readLine()) != null){
            System.out.println(name+" "+line);
        }
    }

    private static void runProcess(String command) throws Exception{
        Process proc=Runtime.getRuntime().exec(command);
        printLines(command+" - stdout: ",proc.getInputStream());
        printLines(command+" - stderr: ", proc.getErrorStream());
        proc.waitFor();
        System.out.println(command+" - exitValue()"+proc.exitValue());
    }

}
