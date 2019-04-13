package myglobajavapp;

/**
 *
 * @author Tbo
 */
public class DrawTable {
    
    String[] str = {"Teboho","Matjele","Alfred","Katleho","Thato"};
    
    public void myTable(){
        for(int i = 0; i <= str.length*5 ; ++i){
        System.out.print("_");
        }
        System.out.println();
        for(int i = 0; i < str.length; ++i){
        System.out.println("| " + str[i] + "|");
        }
        for(int i = 0; i < str.length; ++i){
        System.out.print("_");
        //System.out.println("_");
        }
    }
    
    
    
}
