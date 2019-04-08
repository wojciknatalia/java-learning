package Homework3;

import java.io.File;

public class CreateDict {
    static final String FOLDER="C:\\Users\\asd\\Desktop\\tmp";
    public static void main(String[] args){
        File newFolder=new File(FOLDER);
        newFolder.mkdir();
    }
}
