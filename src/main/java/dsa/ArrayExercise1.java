// Write a Java program that sums the array's values with the following elements: 25, 4, 16, 9, 10.
package dsa;

public class ArrayExercise1 {

    public static void main(String[] args) {
        int[] arr = new int[]{25, 4, 16, 9, 10};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        System.out.println("The sum array values is: " + sum); // 64

    }
}
