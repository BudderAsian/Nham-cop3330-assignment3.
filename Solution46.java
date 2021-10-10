package org.example.ex46.base;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Nham
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution46 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\\\IdeaProjects\\cop3330-exercises\\Nham-cop3330-assignment3\\src\\main\\java\\org\\example\\ex46\\base\\exercise46_input.txt";
        // initialize readers for file
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        // variable for holding word count
        int wordCount = 0;
        int badgerCount = 0;
        int mushroomCount = 0;
        int snakeCount = 0;
        // read file line by line
        while ((line = br.readLine()) != null) {
            // get array of words in current line
            /*String[] words = line.split(" ");
            wordCount += words.length;*/
            String word = br.toString();
            if(line.equals("badger")) {
                badgerCount++;
            }
        }
        // close file reader
        br.close();
        //System.out.println("Number of words in the file is: " + wordCount);
        System.out.println("Badger Count: " + badgerCount);
    }
}
