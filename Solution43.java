package org.example.ex43.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Nham
 */
public class Solution43     {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // get user input
        getInput();
        // create website
    }


    public static void getInput() {
        System.out.print("Site name: ");
        String siteName = in.nextLine();
        System.out.print("Author: ");
        String author = in.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        String jsFolderInput = in.next();
        System.out.print("Do you want a folder for CSS? ");
        String cssFolderInput = in.next();

        // create JS Folder if answer is y
        createJSFolder(jsFolderInput);
        // create CSS Folder if answer is y


    }

    private static void createJSFolder(String jsFolderInput) {
        if(jsFolderInput.equals("y")) {
            WebsiteBuilder websiteBuilder = new WebsiteBuilder();
            websiteBuilder.createJSFolder(jsFolderInput);
        }

    }

}

