package myglobajavapp;

import java.util.Scanner;
//import java.lang.Math;
import java.text.DecimalFormat;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.awt.Font;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

/**
 * <h1>MultiJavaApps</h1>
 * The <b><i>GlobalJavApp</i></b> program implements a console application that runs
 * <b>Multiple Java Apps</b> with different user input and display the results
 * on a standard output.
 *
 * @author matjele7@gmail.com
 * @version 1.0
 * @since 2018-05-03
 */
public class MyGlobaJavApp {
    
    private static void compareAndSort(int[] a, int[] b) {

        if (java.util.Arrays.equals(a, b)) {
            java.util.Arrays.sort(a);
            System.out.println("Arrays are equal: \n"
                    + java.util.Arrays.toString(a) + "\n");
        } else {
            java.util.Arrays.sort(a);
            java.util.Arrays.sort(b);
            System.out.println("Arrays are unequal: \n"
                    + java.util.Arrays.toString(a)
                    + "\n" + java.util.Arrays.toString(b));
        }

    }
    
    private static void menu(){
        System.out.print("1. Average of values\t6.  Swap Array Elements"
                + "\n2. Investment\t\t7.  Compare Two Arrays" 
                + "\n3. Any Number\t\t8.  Draw Table\n4. Pyramid\t\t9.  ATM"
                + "\n5. Add Array Elements\t10. Word or Phrace\n");       
    }
    
    private static void menuSelection(){
        double userVal = 0.0, rate = 0.0, year = 0.0; 
        int num;
        Scanner scan = new Scanner(System.in);
        menu();
        System.out.print("\nEnter a number to select App from the menu bellow: ");
        num = scan.nextInt();
       

        switch(num){
            case 1:
                System.out.print("\nThe Average of values\n=====================\n");
                //Creating an object of the Class FiveValueAverage called inpVal(inputValue)
                FiveValueAverage inpVal = new FiveValueAverage(userVal);
                inpVal.averageOfValues(); break;                
            case 2: 
                System.out.printf("\n\nMy investment\n=============\n"); 
                InvestmentApp inv = new InvestmentApp(userVal, rate, year);
                inv.myInvestment();
                //Powerfull floating points format from a complex calculations eg. 88.08225532082 
                DecimalFormat frm = new DecimalFormat("#0.00");
                System.out.println("\nThe investment yields: " +
                        frm.format(inv.getInvAmount() * Math.pow(1+inv.getRate(), inv.getYear())) + "\n");
                break;
            case 3: System.out.print("\nAny Number\n==========\n");
                AnyNumber any = new AnyNumber(num);
                any.displayResults();
            case 4: System.out.println("\nPyramid\n=========");
                Pyramid prmd = new Pyramid(num);
                prmd.drawPyramid(); break;
            case 5: System.out.println("\nAdd Array Elements\n==================");
                AddArrayElements adArr = new AddArrayElements();
                adArr.addArrElements();break;
            case 6: System.out.println("\nSwap Array Elements\n===================\n");
                 SwapArrayElements swap = new SwapArrayElements();
                 swap.printArrElements(); break;
            case 7: System.out.println("\nCompare Two Arrays\n==================");
                compareAndSort(new int[] {6,5,4,3,2,1}, new int[] {6,5,4,3,2,0});
                System.out.println(); break;
            case 8: System.out.println("\nDraw Table\n===========");
                 DrawTable table = new DrawTable();
                table.myTable(); break;
            case 9: System.out.println("\nAuto Teller Machine\n====================");
                double amount = 0.0, balance = 0.0;
                AutoTellerMachine atm = new AutoTellerMachine(amount, balance);
                //int num = 0;
                do{
                    atm.menu();
                }while(num != 4); break;                
            case 10: System.out.println("\nWord or Phrace\n==============");
                String sWord = "";
                WordPhrace wp = new WordPhrace(sWord);
                wp.addArrChar(); break;
        
        }
        
    }
    
    
    /**
     * Run the Documentation
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        menuSelection();
        
        
        
      //====================================================  
//        Scanner scn = new Scanner(System.in);
//        
//        System.out.print("Enter String: ");
//        String sMg = scn.nextLine();
//        //char[] s = new char[sMg.length()];
//        String s = "";
//        int count = 0;
//        
//        for(int i = sMg.length() - 1; i >= 0; --i){
//            s += sMg.replace(sMg.charAt(i), sMg.charAt(count));
//            ++count;
//        }
//        System.out.println("Reversed String: " + s);
//        
        //=============================================
        
//        int sum = (int)(Math.random() * 100 + 1), cents = 0;
//        System.out.println("Enter the sum: " + sum);
//        
//        //bestChange(int cents)
//        if(sum >= 50){
//            cents = sum / 50;
//            System.out.println("50c pieces: " + cents);
//            cents = sum % 50;
//            sum = cents / 10;
//            System.out.println("10c pieces: " + sum);
//            sum  = cents % 10;
//            cents = sum / 5;
//            System.out.println("5c pieces: " + cents);
//            cents = sum % 5;
//            sum = cents / 1;
//            System.out.println( "1c pieces: " + sum);
//        }else if(sum >= 10){
//            cents = sum / 10;
//            System.out.println("10c pieces: " + cents);
//            cents  = sum % 10;
//            sum = cents / 5;
//            System.out.println("5c pieces: " + sum);
//            cents = sum % 5;
//            sum = cents / 1;
//            System.out.println( "1c pieces: " + (sum+cents));
//        }else if(sum >= 5){
//            cents = sum / 5;
//            System.out.println("5c pieces: " + cents);
//            cents = sum % 5;
//            sum = cents / 1;
//            System.out.println( "1c pieces: " + sum);
//        }else{
//            System.out.println("1c pieces: " + (sum % 5)); 
//        }
//        =======================================
        
//        //Put a logo inside a box
//        System.out.print("Enter your Company name: ");
//        Scanner scan = new Scanner(System.in);        
//        String logo = scan.next();              
//        
//        //String logo = "CiTiX Futured by BCX";
//        System.out.print("\t+");
//        for(int i = 0; i <= logo.length() + 3; ++i){
//            System.out.print("-");
//        }
//        System.out.println("+");
//        System.out.println("\t|  " + logo + "  |");
//        System.out.print("\t+");
//            
//        for(int i = 0; i <= logo.length() + 3; ++i){
//            System.out.print("-");
//        }
//        System.out.println("+");   
//        
//        //Solicit the employee names
//        ArrayList<String> students = new ArrayList<>();        
//        
//        
//        System.out.println("\nEnter employee names: ");
//        
//        for(int i = 0; i < 10; ++i){            
//            students.add(scan.next());
//        }  
//        
//        //Display employee list names
//        System.out.println("========================\n " + logo 
//                +" Employee List\n========================\n");
//        for(String s : students){
//            System.out.println("\t\u00B0 " + s);
//        }
//        System.out.println("====================\nSoftware Development"
//                + "\n====================");
        
        //===========================================================
        
        
        
//        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
//        String str = ""; //= new String[60];
//        int num = 0;
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter a sentence of 60 char or more:");
//        String s = scn.next();
//        for(int i = 0; i < s.length(); ++i){
//            
//            if(s.charAt(i) == ' '){
//                --i;                
//                str += s;
//            }
//           // num = 0;
//            System.out.println(str);
//            for(int j = 0; j <= str.length(); ++j){
//                if(str.charAt(i) == 'a'){
//                    ++num;
//                }
//            }            
//        }
//        System.out.println("There are " + num);
//        
        //=============================================
        
        
        
        //Currency 3.3
//        double cent = 1.0;
//        for(int i = 0; i <= 30; ++i){
//            cent += (cent * 0.5);            
//        }
//        //Currency cur = Currency.getInstance("ZAR");
//        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "ZA"));
//        //DecimalFormat dcf = new DecimalFormat();
//        System.out.println("Salary: " + nf.format(cent));
//        
        //Hotel 3.2
//        int totRooms[], totOcc[];
//        double occRate, sumRoom = 0.0, sumOcc = 0.0;
//        int floor = (int)(Math.random() * 15 + 2);
//        totRooms = new int[floor]; totOcc = new int[floor];
//        for(int i = 1; i <= floor; ++i){
//            int room = (int)(Math.random() * 10 + 1);
//            int occ = (int)(Math.random()  * 10 + 1);            
//            if(room >= occ){
//                totRooms[i-1] += room;
//                totOcc[i-1] += occ;
//                sumRoom += totRooms[i-1];
//                sumOcc += totOcc[i-1];
//                System.out.println("How many rooms on floor " + (i+1) + "? " + room
//                        + "\nHow many occupied rooms on floor " + (i+1) + "? " + occ);
//            }else{--i;}    
//        }
//        occRate = (sumOcc/sumRoom) * 100;
//        //System.out.println(sumOcc);
//        System.out.println("There are " + sumRoom + " rooms.\n" 
//                + sumOcc + " are occupied; " + (sumRoom - sumOcc) +" are vacant.");
//        System.out.printf( "The occupancy rate is %.2f.\n\n", occRate);
//                
        //================================================================
        
        
        //SpeedDisTime 3.1
//        double s, d, t;
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Choose a medium from the list below:");
//        System.out.print("1 Air\n2 Sea Water\n3 Mercury\n4 Copper\n5 Lead" 
//                + "\n\nEnter the number of your choice: ");
//        int num = scn.nextInt();
//        System.out.print("Enter the distance in metres for sound to travel: ");
//        d = scn.nextDouble();
//        
//        switch(num){
//            case 1: s = 343;
//                t  = d/s;
//                System.out.printf("Sound takes %.4f seconds to travel %.4fm in air at 20\u2103\n", t,d );
//                break;
//            case 2: s = 1533;
//                t  = d/s;
//                System.out.printf("Sound takes %.4f seconds to travel %.4fm in Sea Water\n", t,d );
//                break;
//            case 3: s = 1450;
//                t  = d/s;
//                System.out.printf("Sound takes %.4f seconds to travel %.4fm in Mercury\n", t,d );
//                break;
//            case 4: s = 3560;
//                t  = d/s;
//                System.out.printf("Sound takes %.4f seconds to travel %.4fm in Copper\n", t,d );
//                break;
//            case 5: s = 1322;
//                t  = d/s;
//                System.out.printf("Sound takes %.4f seconds to travel %.4fm in Lead\n", t,d );
//                break;
//            default : System.out.println("Invalid Input Number"); break;
//                //System.exit(0);
//        }
//        
        //=====================================================================
        
        
        //Craps
//        int dieOne = (int)(Math.random() * 6 + 1);
//        int dieTwo = (int)(Math.random() * 6 + 1);
//        //System.out.println("One " + dieOne  + "\nTwo " + dieTwo);
//        int sum = dieOne + dieTwo;
//        if(sum == 7 || sum == 11){
//            System.out.println("Throw is: " + sum + " Player loses");
//        }else if(sum == 2 || sum == 3){
//            System.out.println("Throw is: " + sum + " Player wins!");
//        }else if(sum == 12){
//            System.out.println("Throw is: " + sum + " Start again");
//        }else{
//            System.out.println("Throw is: " + sum + " Player throws again.");
//        }
//        
        //===================================================================
        
        
        //VendingMachine
//        int num, sum;
//        double amount, val;
//        Scanner scn = new Scanner(System.in);
//        
//        System.out.println("1 Jubjubs R2.25\n2 Wine gums R3.75\n3 Lollipos R4.00"
//                + "\n4 Orsnge juice R5.50\n5 Chocolate R7.50");
//        System.out.print("Enter numner of an item to purchase: ");
//        num = scn.nextInt();
//        
//        switch(num){
//            case 1:System.out.print("Enter amount payment: ");
//                amount = scn.nextDouble();
//                if(amount >= 2.25){
//                    System.out.println("Thank you!\nYour change is: R" + (amount - 2.25));
//                }else{
//                    System.out.print("Please enter another " + (2.25 - amount)
//                        + ",\nor enter 0 to cancel: ");
//                    val = scn.nextDouble();
//                    amount += val;
//                    if(val == 0){
//                        System.out.println("Returning customer's money R" + amount);
//                        System.exit(0);
//                    }else{
//                        System.out.println("Thank you!\nYour change is: R" + (amount - 2.25));
//                    }
//                } break;
//            case 2: System.out.print("Enter amount payment: ");
//                amount = scn.nextDouble();
//                if(amount >= 3.75){
//                    System.out.println("Thank you!\nYour change is: R" + (amount - 3.75));
//                }else{
//                    System.out.print("Please enter another " + (3.75 - amount)
//                        + ",\nor enter 0 to cancel: ");
//                    val = scn.nextDouble();
//                    amount += val;
//                    if(val == 0){
//                        System.out.println("Returning customer's money R" + amount);
//                        System.exit(0);
//                    }else{
//                        System.out.println("Thank you!\nYour change is: R" + (amount - 3.75));
//                    }
//                } break;
//            case 3: System.out.print("Enter amount payment: ");
//                amount = scn.nextDouble();
//                if(amount >= 4.00){
//                    System.out.println("Thank you!\nYour change is: R" + (amount - 4.00));
//                }else{
//                    System.out.print("Please enter another " + (4.00 - amount)
//                        + ",\nor enter 0 to cancel: ");
//                    val = scn.nextDouble();
//                    amount += val;
//                    if(val == 0){
//                        System.out.println("Returning customer's money R" + amount);
//                        System.exit(0);
//                    }else{
//                        System.out.println("Thank you!\nYour change is: R" + (amount - 4));
//                    }
//                } break;
//            case 4:
//                System.out.print("Enter amount payment: ");
//                amount = scn.nextDouble();
//                if(amount >= 5.50){
//                    System.out.println("Thank you!\nYour change is: R" + (amount - 5.50));
//                }else{
//                    System.out.print("Please enter another " + (5.50 - amount)
//                        + ",\nor enter 0 to cancel: ");
//                    val = scn.nextDouble();
//                    amount += val;
//                    if(val == 0){
//                        System.out.println("Returning customer's money R" + amount);
//                        System.exit(0);
//                    }else{
//                        System.out.println("Thank you!\nYour change is: R" + (amount - 5.50));
//                    }
//                } break;
//             case 5: System.out.print("Enter amount payment: ");
//                amount = scn.nextDouble();
//                if(amount >= 7.50){
//                    System.out.println("Thank you!\nYour change is: R" + (amount - 7.50));
//                }else{
//                    System.out.print("Please enter another " + (7.50 - amount)
//                        + ",\nor enter 0 to cancel: ");
//                    val = scn.nextDouble();
//                    amount += val;
//                    if(val == 0){
//                        System.out.println("Returning customer's money R" + amount);
//                        System.exit(0);
//                    }else{
//                        System.out.println("Thank you!\nYour change is: R" + (amount - 7.50));
//                    }
//                } break;
//             default : System.out.println("Invalid menu number");
//        }
//        
        //==================================================================
        
        
        //HighestToLowest Bubble sort
//        int num[] = new int[3], temp;
//        Scanner scn = new Scanner(System.in);
//        for(int i = 0; i < 3; ++i){
//            System.out.print("Integer " + (i+1) + ": ");
//            num[i] = scn.nextInt();           
//        }
//        System.out.println("Array Vales: " + java.util.Arrays.toString(num));
//        for(int i = num.length - 1; i >= 0; --i){
//            //System.out.print("i: " +i);
//            for(int j = 0; j < num.length - 1; ++j){
//                //System.out.print("J: " +j);
//                if(num[i] < num[j+1]){
//                    temp = num[i];
//                    num[i] = num[j+1];
//                    num[j+1] = temp;
//                }
//            }
//        }
//        System.out.println("Sorted Array Vales: " + java.util.Arrays.toString(num));
//        
        //Game
//        int num, i = 0, comScore[], pScore[], pSum = 0, cSum = 0;
//        Scanner scn = new Scanner(System.in);
//        
//        System.out.println("To play Rock-Paper-Scissors,"
//                +"\nenter one of the following values:");
//        System.out.println("0 for Rock\n1 for Paper\n2 for Scissors\n9 to Quit");
//        System.out.println("Scores: Player " + pSum + " Computer " + cSum);
//        
//        do{
//            int score = 0;
//            comScore = new int[i+1]; pScore = new int[i+1];
//            int val = (int)(Math.random() * 3);
//            System.out.print("Enter your choice: ");
//            num = scn.nextInt();
//            switch (num) {
//                case 0:
//                    if (val == 1) {
//                        System.out.println("Paper covers rock - " + "Computer wins ");
//                        comScore[i] = ++score;
//                        cSum += comScore[i];
//                        System.out.println("Scores: Player " + pSum + " Computer " + cSum);                        
//                    } else if (val == 2) {
//                        System.out.println("Rock breaks scissors - " + "Player wins ");
//                        pScore[i] = ++score;
//                        pSum += pScore[i];
//                        System.out.println("Scores: Player " + pSum + " Computer " + cSum);
//                    } else {
//                        System.out.println("Game is tie! ");
//                        System.out.println("Scores: Player " + pSum + " Computer " + cSum);
//                    }
//                    break;
//                case 1:
//                    if (val == 0) {
//                        System.out.println("Paper covers rock - " + "Player wins ");
//                        pScore[i] = ++score;
//                        pSum += pScore[i];
//                        System.out.println("Scores: Player " + pSum + " Computer " + cSum);
//                    } else if (val == 2) {
//                        System.out.println("Scissors cut paper - " + "Computer wins ");
//                        comScore[i] = ++score;
//                        cSum += comScore[i];
//                        System.out.println("Scores: Player " + pSum + " Computer " + cSum);                        
//                    } else {
//                        System.out.println("Game is tie! ");
//                        System.out.println("Scores: Player " + pSum + " Computer " + cSum);
//                    }
//                    break;
//                case 2:
//                    if (val == 0) {
//                        System.out.println("Rock breaks scissors - " + "Computer wins ");
//                        comScore[i] = ++score;
//                        cSum += comScore[i];
//                        System.out.println("Scores: Player " + pSum + " Computer " + cSum);                        
//                    } else if (val == 1) {
//                        System.out.println("Scissors cut paper - " + "Player wins ");
//                        pScore[i] = ++score;
//                        pSum += pScore[i];
//                        System.out.println("Scores: Player " + pSum + " Computer " + cSum);
//                    } else {
//                        System.out.println("Game is tie! ");
//                        System.out.println("Scores: Player " + pSum + " Computer " + cSum);
//                    }
//                    break;
//                case 9: System.out.println("Game over!"); 
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid Selection");
//                    break;
//            }
//        }while(num != 9);
//        
        //================================================================
        
        
        //OddEven
//        int num;
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter integer number: ");
//        num = scn.nextInt();
//        if(num % 2 == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//        
        //================================================================
        
        //ShipOrder
//        double orderAmount;
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the order cost: ");
//        orderAmount = scn.nextDouble();
//        
//        if(orderAmount >= 200.00){
//            System.out.printf("Order Total: %.2f\n",orderAmount);
//        }else{
//            System.out.printf("Order Total: %.2f\n", (orderAmount + 22.50));
//        }
//        
        
        //=====================================================================
        
        //nameBox
//        String name;
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        name = scn.next();
//        System.out.print("+");
//        for(int i = 0; i <= name.length() + 3; ++i){
//            System.out.print("-");
//        }
//        System.out.println("+");
//        System.out.println("|  " + name + "  |");
//        System.out.print("+");
//        for(int i = 0; i <= name.length() + 3; ++i){
//            System.out.print("-");
//        }
//        System.out.println("+");
//                
        
//        int i = (int)(Math.random() * 128 + 1);
//        String s = Integer.toHexString(i);
//        System.out.println("Decimal:\t " + i + "\nBinary:\t\t 0d" + Integer.toBinaryString(i)
//                + "\nHexadecimal:\t 0x" + i + s + "\nOctal:\t\t " + Integer.toOctalString(i));
//        
        
        
        //===================================
//        int num = 0;
//        BinaryNumBit bn = new BinaryNumBit(num);
//        bn.binaryNumBit();
//        
                
        // ================================================
        
//        String s = "Teboho";
//        Font boldFont = new Font("Times New Roman", Font.BOLD, 12);
//        
//        for(int i = 0; i < s.length(); ++i){
//            AttributedString str = new AttributedString(s);
//            str.addAttribute(TextAttribute.FONT, boldFont);
//            str.addAttribute(TextAttribute.UNDERLINE, s.substring(i), 0, s.length());
//        }
//        System.out.print(s + "\n");
//      
        //====================================================//
    }    
}

