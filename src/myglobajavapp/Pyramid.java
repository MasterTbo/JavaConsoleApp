package myglobajavapp;

import java.util.Scanner;

/**
 *
 * @author Tbo
 */
public class Pyramid {
    
    private int height;
    
    /**
     * Construct
     * @param height
     */
    public Pyramid(int height) {
        this.height = height;
    }
    
    /**
     * Getter for the height of a pyramid
     * @return 
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * 
     * @param height 
     */
    public void setHeight(int height) {
        Scanner scn = new Scanner(System.in);
        this.height = scn.nextInt();
    }
    
    
    public void drawPyramid(){
        System.out.print("Enter the Height of a Pyramid: ");
        setHeight(this.height);
        int k = 2 * this.height - 1;
        for (int i = 0; i < this.height; i++) {
            for (int f = 0; f < k; f++) {
                System.out.print(" ");
            }
            k = k - 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
    
}
