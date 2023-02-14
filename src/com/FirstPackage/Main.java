package com.FirstPackage;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        byte myAge = 30;
        byte herAge = myAge;
        long viewCounts = 3_123_456_789L;
        char letter = 'A';
        String word = "Hello World!"; //Strings are reference type in java, its just shorthand
        boolean isEligible = false;
        System.out.println(isEligible);

        //Primitive - x & y are stored in independent memory. The memory will hold value
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        //Reference - The memory will hold address of that point object in memory.
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        String newWord = "Hello" + " " + "Rajitha";
        System.out.println(newWord.replace(" ","_"));
        System.out.println(newWord); //In Java Strings are immutable.


    }
}
;
