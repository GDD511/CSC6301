package duvallg.linkedlistproject;

import java.util.LinkedList;

/**
 * Prints the linked list.
 * 
 * @author Gwendolyn Duvall
 * @version 1.0
 * @since 6/1/2024 CSC6301 Week 4
 */
public class Printer {
     /**
      * Constructs a new Printer object.
      */
    public Printer(){
        // Default constructor, no additional setup needed.
    }
    
    /**
     * Prints the provided linked list of integers. The user is notified if the
     * list is empty.
     * 
     * @param list the list of integers to be printed
     */
    public static void print(LinkedList<Integer> list){
       if (!list.isEmpty()) {
           System.out.println("The list: " + list);
       } else {
           System.out.println("The list is empty.");
       }
    }
}
