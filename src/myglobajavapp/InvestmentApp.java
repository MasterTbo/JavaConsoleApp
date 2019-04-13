package myglobajavapp;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Tbo
 */
public class InvestmentApp {
    
    private double invAmount, rate, year;

    public InvestmentApp(double invAmount, double rate, double year) {
        this.invAmount = invAmount;
        this.rate = rate;
        this.year = year;
    }

    public double getInvAmount() {
        return invAmount;
    }

    public void setInvAmount(double invAmount) {
        this.invAmount = invAmount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate / 100;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }
    
    public void myInvestment(){
        Scanner scan  = new Scanner(System.in);
        
        System.out.print("Enter the principal sum: ");
        setInvAmount(scan.nextDouble());
        System.out.print("Enter the interest rate(eg. 7.5): ");
        setRate(scan.nextDouble());
        System.out.print("Enter the investment period: ");
        setYear(scan.nextDouble());       
    }
}
