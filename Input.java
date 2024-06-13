package duvallg.linkedlistproject;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Receives and manages user input to create a linked list.
 * 
 * @author Gwendolyn Duvall
 * @version 1.0
 * @since 6/1/2024 CSC6301 Week 4 
 */
public class Input {
    
    /**
     * Constructs a new Input object.
     */
    public Input(){
        // Default constructor, no additional setup needed.
    }
    
    /**
     * Prompts user for input, integers added to list. 
     * User enters 'done' to complete list.
     * 
     * @exception NumberFormatException notifies user of invalid input
     * @return the linked list created from data from user
     */

    public static LinkedList<Integer> getInput() {
    LinkedList<Integer> lList = new LinkedList<>();
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("""
                           Enter an integer to add to the list. Press 'ENTER' 
                           after each number.
                           \tEnter 'done' to complete.""");
        String input = scanner.nextLine();   
        while (!input.equalsIgnoreCase("done")) {
            // Parse the input string as an integer
            int num;
            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer "
                    + "or 'done' to complete.");
                input = scanner.nextLine();
                continue;
            }
            lList.add(num);
            input = scanner.nextLine();
            }
        }
        return lList;
    }
}