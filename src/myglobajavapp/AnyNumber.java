package myglobajavapp;

import java.util.Scanner;
/**
 *
 * @author Tbo
 */
public class AnyNumber {
    private double num;

    public AnyNumber(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        Scanner scn  = new Scanner(System.in);
        this.num = scn.nextDouble();
    }
    
    public void displayResults(){
              
        System.out.print("Enter any number: ");
        this.setNum(num);
        
        //System.out.print("Number: " + num + "\n");
        
        if(num < 0){
            System.out.print("Too Small!\n");
        }else if(num > 0 && num <= 100){
            System.out.print("Smallish\n");
        }else if(num > 100 && num <= 1000){
            System.out.print("Just right\n");
        }else if(num > 1000 && num <= 10000){
            System.out.print("Biggish\n");
        }else{
            System.out.print("Too big\n");
        }
    }
}
