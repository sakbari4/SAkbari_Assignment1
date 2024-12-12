package assignment1;

/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygum
 * Description: Assignment 1
 * Due: MM/DD/YYYY
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Sama Akbari
*/

import java.io.*;
import java.util.*;

public class ESPGame {
    public static void main(String[] args) {
        final String COLOR_1 = "black";
        final String COLOR_2 = "white";
        final String COLOR_3 = "gray";
        final String COLOR_4 = "sliver";
        final String COLOR_5 = "maroon";
        final String COLOR_6 = "red";
        final String COLOR_7 = "purple";
        final String COLOR_8 = "fuchsia";
        final String COLOR_9 = "green";
        final String COLOR_10 = "lime";
        final String COLOR_11 = "olive";
        final String COLOR_12 = "pink";
        final String COLOR_13 = "navy";
        final String COLOR_14 = "blue";
        final String COLOR_15 = "teal";
        final String COLOR_16 = "yellow";

        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.println("Enter the filename: ");
        
        try {
            File file = new File("C:\\Fall2024\\CMSC\\Assignment 1\\colors.txt");
            Scanner fileScanner = new Scanner(file);
            System.out.println("There are sixteen colors from a file:");
            while (fileScanner.hasNextLine()) {
                System.out.println(" " + fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            return;
        }

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int correct = 0;

        for (int round = 1; round <= 3; round++) {
            System.out.println("\nRound " + round);
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it one of the list of colors above?");
            System.out.print("Enter your guess: ");
            
            String userGuess = input.nextLine().trim().toLowerCase();

            int randomColor = random.nextInt(16) + 1;
            String selectedColor = "";

            if (randomColor == 1) {
                selectedColor = COLOR_1;
            } else if (randomColor == 2) {
                selectedColor = COLOR_2;
            } else if (randomColor == 3) {
                selectedColor = COLOR_3;
            } else if (randomColor == 4) {
                selectedColor = COLOR_4;
            } else if (randomColor == 5) {
                selectedColor = COLOR_5;
            } else if (randomColor == 6) {
                selectedColor = COLOR_6;
            } else if (randomColor == 7) {
                selectedColor = COLOR_7;
            } else if (randomColor == 8) {
                selectedColor = COLOR_8;
            } else if (randomColor == 9) {
                selectedColor = COLOR_9;
            } else if (randomColor == 10) {
                selectedColor = COLOR_10;
            } else if (randomColor == 11) {
                selectedColor = COLOR_11;
            } else if (randomColor == 12) {
                selectedColor = COLOR_12;
            } else if (randomColor == 13) {
                selectedColor = COLOR_13;
            } else if (randomColor == 14) {
                selectedColor = COLOR_14;
            } else if (randomColor == 15) {
                selectedColor = COLOR_15;
            } else if (randomColor == 16) {
                selectedColor = COLOR_16;
            }

            System.out.println("\nI was thinking of " + selectedColor + ".");
            if (userGuess.equalsIgnoreCase(selectedColor)) {
                correct++;
            }
        }

        System.out.println("\nGame Over");
        System.out.println("You guessed " + correct + " out of 3 colors correctly.");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Describe yourself: ");
        String description = input.nextLine();

        System.out.print("Due Date (MM/DD): ");
        String dueDate = input.nextLine();

        System.out.println("\nUser Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + dueDate);

        input.close();
    }
}

