package myglobajavapp;

import java.util.Scanner;

/**
 *
 * @author Tbo
 */
public class BinaryNumBit {
    private int num, bin, bit;

    public BinaryNumBit(int num) {
        this.num = num;
        this.bin = 0;
        this.bit = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        Scanner scn  = new Scanner(System.in);
        this.num = scn.nextInt();//Integer.parseInt(scn.next());
    }
    
    public void binaryNumBit(){
        System.out.println("Enter a number of bits: ");
        this.setNum(num);
        bit = (int)Math.pow(2, getNum());
        String s = Integer.toBinaryString(getNum());
        System.out.println("There are " + bit + " different binary numbers in " 
                + getNum()  + " bits"+ "\nBinary Number of " + getNum() + " is: " + s
                + "\nBinary Number of " + bit + " is: " + Integer.toBinaryString(bit));
        
    }
    
    
    
    
    
}
