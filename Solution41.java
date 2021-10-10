package org.example.ex41.base;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Nham
 */
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution41 {
    public static void main(String[] args) throws FileNotFoundException {

        // make ArrayList for names
        ArrayList<String> names = new ArrayList<>();
        // try/catch for reading lines
        // Scan Path
        try (Scanner in = new Scanner(Paths.get("C:\\Users\\richard\\IdeaProjects\\cop3330-exercises\\Nham-cop3330-assignment3\\src\\main\\java\\org\\example\\ex41\\base\\exercise41_input.txt"))) {

            // read lines
            while (in.hasNextLine()) {
                names.add(in.nextLine());

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // try/catch for creating output.txt file
        try {
            FileWriter output = new FileWriter("exercise41_output.txt");
            output.write("Total of " + names.size() + " names\n");
            output.write("-----------------\n");
            for(int i = 0; i < names.size(); i++) {
                output.write(names.get(i) + "\n");
            }
            output.close();
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }


}
