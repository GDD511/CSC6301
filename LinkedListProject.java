package duvallg.linkedlistproject;

import java.util.LinkedList;

/**
 * Collects data from user input to create a Linked List, which is then 
 * sorted and printed.
 * 
 * A project to demonstrate modularization. This will aid in code reusability
 * with sorting and printing for the Week 5 project of the Stack, reducing
 * duplication of code in future projects.
 * 
 * This was compiled on Command line using javac *.java;
 * then run on Command line using java LinkedListProject.java.
 * 
 * JavaDocs created on Command line using javadoc *.java.
 * 
 * @author Gwendolyn Duvall
 * @version 1.0
 * @since 6/1/2024 CSC6301 Week 4
 */
public class LinkedListProject {
    
    /**
     * Constructs a new Linked List Project object.
     */
    public LinkedListProject(){
        // Default constructor, no additional setup needed.
    }

    /**
     * Creates a linked list of integers from user input, sorts the list
     * in ascending order, and prints the sorted list.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        LinkedList<Integer> lList = Input.getInput();
        System.out.println("Sorting your list...");
        LinkedList<Integer> sortedLList = Sorter.sort(lList);
        Printer.print(sortedLList);
    }
}
