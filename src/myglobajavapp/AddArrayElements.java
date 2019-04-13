package myglobajavapp;

import java.util.Random;

/**
 *
 * @author Tbo
 */
public class AddArrayElements {
    
    public void addArrElements(){
        int[] arrOne = {1, 2, 3, 4, 5};
        int[] arrTwo = new int[5];
        
             
        for(int i = 0; i < arrTwo.length; ++i){
            Random rnd = new Random();
            arrTwo[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("Array One: " + java.util.Arrays.toString(arrOne));
        System.out.println("Array Two: " + java.util.Arrays.toString(arrTwo));
    }
}
