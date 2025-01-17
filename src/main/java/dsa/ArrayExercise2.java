// Write a Java program to test if an array contains a specific value. Create an array with five elements.
package dsa;

import java.util.Scanner;

public class ArrayExercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();

        int[] arr = new int[]{67, 21, 1567, 950, 4567};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (userInput == arr[i]) {
                found = true;
                break;
            }

        }
        
        if (found) {
            System.out.println("Found " + userInput + " in the array.");
        } else {
            System.out.println(userInput + " not found in the array.");
        }

        input.close();

    }

}
