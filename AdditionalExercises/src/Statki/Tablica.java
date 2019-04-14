package Statki;

import java.util.Random;

public class Tablica {
    public int[][] shipsTab;

    void genereteTab(){

        //fill all with 0
        shipsTab=new int[10][10];
        for(int i=0; i<10; i++)
            for(int j=0; j<10; j++){
                shipsTab[i][j]=0;
            }

        Random rand=new Random();
        //randomly put ships, represented by 1
        for(int i=0; i<20; i++){
            shipsTab[rand.nextInt(9)][rand.nextInt(9)]=1;
        }
    }
}
