/**
 *  Java program to create, update, and delete TreeSet.
 */

package com.mycollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Set<Float> mySet = new TreeSet<>();

        // Show.
        System.out.println(mySet); // Output: []

        // Add.
        mySet.add(6.7F);
        mySet.add(8.0F);
        mySet.add(1.1F);
        mySet.add(2.1F);
        mySet.add(1.0F);
        mySet.add(7.3F);

        // Show.
        System.out.println(mySet); // Output: [1.0, 1.1, 2.1, 6.7, 7.3, 8.0]

        // Delete.
        mySet.remove(8.0F);
        // Show.
        System.out.println(mySet); // Output: [1.0, 1.1, 2.1, 6.7, 7.3]

        // Clear.
        mySet.clear();

    }
}