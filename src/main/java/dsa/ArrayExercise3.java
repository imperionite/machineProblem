// Write a Java program that creates an array of 5 integers and prompts the user to enter 5 integer values to fill the array. 
// The program should then find the sum of all the elements in the array and print the result.
package dsa;

import java.util.Scanner;

public class ArrayExercise3 {

    public static void main(String[] args) {
        // Initialize the Scanner Object
        Scanner scanner = new Scanner(System.in);

        //  Prompt User for Input
        System.out.print("Enter number separated by spaces: ");

        // Read the Entire Line of Input
        String input = scanner.nextLine();

        //  Split the Input String into an Array of Strings
        String[] numberString = input.split("\\s+");

        // Convert String Array to Integer Array
        int[] numbers = new int[numberString.length];
        for (int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
        }

        int sum = 0;
        System.out.print("The sum of: ");
        for (int number : numbers) {
            sum += number;
            System.out.print(number + " ");
        }
        System.out.print(" is " + sum);

        scanner.close();

    }
}
