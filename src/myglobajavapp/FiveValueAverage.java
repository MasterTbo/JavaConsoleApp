package myglobajavapp;

import java.util.Scanner;
/**
 * 
 * @author Tbo
 */
public class FiveValueAverage {
    private double userVal;
    private double sum;

    public FiveValueAverage(double userVal) {
        this.userVal = userVal;
    }

    public double getUserVal() {
        return userVal;
    }

    public void setUserVal(double userVal) {
        this.userVal = userVal;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum += userVal;
    }
    
    public void averageOfValues(){
        Scanner scn = new Scanner(System.in);
        double arrVal[] = new double[5]; int count = 1;
        //A loop stepper for the user input values
        for(int i = 0; i < arrVal.length; ++i){
            System.out.print("Enter number " + count + " : ");
            userVal = scn.nextDouble();
            setUserVal(userVal);
            //System.out.print("Get value: " + getUserVal() + "\n");
            setSum(userVal);
            //System.out.print("Get sum: " + getSum() + "\n");
            ++count;
        }
        
        //Display the everage value of the user input values
        System.out.print("The average of the five Numbers is: " + 
                    (getSum()/arrVal.length) + "\n\n");
    }
}
