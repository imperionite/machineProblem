/*
* Exercise 1: Create a list with the following elements - apple, banana, and cherry. Write code that accomplishes the following:
1. Print the list using println.
2. Add orange to the beginning of the list.
3. Print the list again.
4. Remove an element from the list.
5. Print the list again.
6. Get an element at a specific index.
7. Print the size of the list.
 */
package dsa;

import java.util.List;
import java.util.LinkedList;

public class LinkedListExercise1 {

    public static void main(String[] args) {
        // Create a list with the following elements - apple, banana, and cherry
        List<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        
        System.out.println("The fruit list consist of " + fruits);
        
        // Add orange to the beginning of the list
        fruits.add(0, "orange");
        System.out.println("Orange was added in the list " + fruits);
        
        // Remove an apple element from the list
        fruits.remove("apple");
        System.out.println("Apple was removed from the list " + fruits);
        
        // Get an element at a index 1
        fruits.get(1);
        System.out.println("The third fruit in the list is " + fruits.get(2));

    }

}
