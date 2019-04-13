package myglobajavapp;

import java.util.Scanner;

/**
 *  Models the ATM banking system
 * @author Tbo, matjele7@gmail.com
 */
public class AutoTellerMachine {
    private double amount, avBalance;

    public AutoTellerMachine(double amount, double balance) {
        this.amount = amount;
        this.avBalance = 4532.67;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        Scanner scn = new Scanner(System.in);
        this.amount = scn.nextDouble();
    }

    public double getBalance() {
        return this.avBalance;
    }

//    public void setBalance(double balance) {
//        this.avBalance = balance;
//    }
    
    public void menu() {

        System.out.print("1. Withdrawal\n2. Deposit\n3. Check balance\n4. Exit");
        Scanner scn = new Scanner(System.in);
        System.out.print("\nPlease enter your transaction number: ");
        int num = scn.nextInt();
       // double avBalance = 4532.67;
        switch (num) {
            case 1:
                withdrawal();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for your custom.");
                System.exit(0);
                break;
            default:
                System.out.println("Unknown transaction number.");
        }

    }

    public double withdrawal() {
        //double amount, avBalance = 4532.67;
        System.out.print("Enter amount to withdraw: ");
        this.setAmount(amount);
        //Scanner scn = new Scanner(System.in);
        //amount = scn.nextDouble();
        if (this.avBalance < amount) {
            System.out.println("Insufficient funds!");
        } else {
            this.avBalance -= amount;
            System.out.println("Balance: " + avBalance);
        }
        return avBalance;
    }

    public double deposit() {
       // double amount, avBalance = 4532.67;
        System.out.print("Enter amount to diposit: ");
        this.setAmount(amount);
//        Scanner scn = new Scanner(System.in);
//        amount = scn.nextDouble();
        if (amount < 0) {
            System.out.println("Insert cash to deposit!");
        } else {
            this.avBalance += amount;
        }
        return avBalance;
    }

    public void checkBalance() {
        System.out.println("You balance is: " + this.getBalance());
    }

}
