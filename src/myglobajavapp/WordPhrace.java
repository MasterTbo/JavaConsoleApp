package myglobajavapp;

import java.util.Scanner;

/**
 *
 * @author Tbo
 */
public class WordPhrace {
    private String sWord;
    //private char[] arrChar;

    public WordPhrace(String sWord) {
        this.sWord = sWord;
        //this.arrChar = new char[this.sWord.length()];
    }

    public String getsWord() {
        return sWord;
    }

    public void setsWord(String sWord) {
        Scanner scn = new Scanner(System.in);
        this.sWord = scn.next();
    }
    
//    public char[] getArrChar() {
//        return arrChar;
//    }

//    public void setArrChar(String[] arrChar) {
//        this.arrChar = arrChar;
//    }
//    
    
    public void addArrChar(){      
        
        System.out.print("Enter a Word/Phrace: ");
        this.setsWord(sWord);
        char[] arrChar = new char[getsWord().length()];
        //System.out.println("Array: " + arrChar.length);
        //System.out.println("Name: " + getsWord() + " " + getsWord().length());
        System.out.println("Character\tASCII Number");
        for(int i = 0; i < arrChar.length; ++i){           
           arrChar[i] = this.sWord.charAt(i);
           int ascii = (int)arrChar[i];            
           System.out.println("   " + arrChar[i] + "\t\t    " + ascii);
        }
    }
    
    
}
