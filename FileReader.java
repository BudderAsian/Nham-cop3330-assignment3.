package org.example.ex42.base;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Nham
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class FileReader {
    public String loadList(List<Person> people, BufferedReader bufferReader, String reader) throws IOException {
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
