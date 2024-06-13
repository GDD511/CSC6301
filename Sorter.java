package duvallg.linkedlistproject;

import java.util.LinkedList;
import java.util.Collections;

/**
 *  Sorts the linked list in ascending order.
 * 
 * @author Gwendolyn Duvall
 * @version 1.0
 * @since 6/1/2024 CSC6301 Week 4
 */
public class Sorter {
    
    /**
     * Constructs a new Sorter object.
     */
    public Sorter(){
        // Default constructor, no additional setup needed.
    }
    
     /**
      * Sorts the linked list in ascending order.
      * 
      * @param list the linked list of integers to be sorted
      * @return the sorted linked list
      */
    public static LinkedList<Integer> sort(LinkedList<Integer> list) {
        if (!list.isEmpty()) {
            Collections.sort(list);
        }
    return list;    
    }
    
}