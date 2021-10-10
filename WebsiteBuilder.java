package org.example.ex43.base;

import java.io.File;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Nham
 */
public class WebsiteBuilder {
    public int createJSFolder(String jsInput) {
        if(jsInput.equals("y")) {
            (new File("JS")).mkdir();
            return 1;
        }
        return 0;
    }
}
