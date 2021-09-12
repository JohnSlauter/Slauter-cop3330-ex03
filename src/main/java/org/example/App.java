package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner s = new Scanner(System.in);

        String quote, author;

        quote = author = new String();

        System.out.print("What is the quote? ");

        quote = s.nextLine();

        System.out.print("Who said it? ");

        author = s.nextLine();

        System.out.print(author + " says, \"" + quote + "\"");

        s.close();

    }
}
