package org.example.ex42.base;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Nham
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Nham
 */
public class Solution42 {
    public static void main(String[] args) {
        // make List for Person class
        List<Person> people = new ArrayList<>();
        // create try/catch to read and load data
        readFile(people);
        // print and format output
        generateOutput(people);
    }

    private static void generateOutput(List<Person> people) {
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        for (Person person : people)
        {
            System.out.printf("%-9s %-9s %d", person.lname, person.fname, person.salary);
            System.out.println();
        }
    }

    private static void readFile(List<Person> people) {
        try {
            // create BufferReader
            BufferedReader bufferReader = new BufferedReader(new FileReader("C:\\Users\\anish\\IdeaProjects\\cop3330-exercises\\ranjan-cop3330-assignment3\\src\\main\\java\\org\\example\\ex42\\base\\exercise42_input.txt"));
            // create reader for the Lines
            String reader = bufferReader.readLine();
            // read lines until end of file (until reader is null)
            while (reader != null){
                reader = loadList(people, bufferReader, reader);

            }
            // make sure to close br
            bufferReader.close();
            // write catch
        } catch (FileNotFoundException e) {
            System.out.println("error");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String loadList(List<Person> people, BufferedReader bufferReader, String reader) throws IOException {
        // .split with the ","
        // make separate part for each variable
        // variables (in order) will be:
            // String lname
            // String fname
            // int salary
        String[] word = reader.split(",");
        // make variables for each part of the line
        String lname = word[0];
        String fname = word[1];
        int salary = Integer.parseInt(word[2]);
        // load variables into Person
        Person person = new Person(fname, lname, salary);
        // add each Person to people array list
        people.add(person);
        reader = bufferReader.readLine();
        return reader;
    }
}
