package myglobajavapp;

/**
 *
 * @author Tbo
 */
public class SwapArrayElements {

    public void printArrElements(){
        double[] arrOne = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] arrTwo = {12.3, 13.6, 15.3, 12.4, 18.1};
        double[] swapArrOne = new double[5];

        System.out.println("Array One: " + java.util.Arrays.toString(arrOne));
        System.out.println("Array Two: " + java.util.Arrays.toString(arrTwo));

        System.out.print("\nSwapping values in reverse order...\n\nArray One: ");

        for(int i  = arrTwo.length - 1; i >= 0; --i){
            swapArrOne[i] = arrTwo[i];
            arrTwo[i] = arrOne[i];
            arrOne[i] = swapArrOne[i];
            System.out.print(arrOne[i] + " ");
        }
        System.out.print("\nArray Two: ");

        for(int i  = arrOne.length - 1; i >= 0; --i){
           System.out.print(arrTwo[i] + "  ");
        }
        System.out.println();
        }
}
