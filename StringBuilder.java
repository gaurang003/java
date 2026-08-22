package org.example.ApnaCollege.StringBuilder;

import java.lang.*;
import java.util.*;

public class StringBuilder {
    //To make String more optimized String -> for modifying Strings
    //Less Time consuming for modifying operations.
    //In java Strings are immutable.

    public static void main(String args[]){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert at position
        sb.insert(2,'S');
        System.out.println(sb);

        //delete
        sb.delete(2,3);
        System.out.println(sb);

        //append at the end
        java.lang.StringBuilder h = new java.lang.StringBuilder("h");
        h.append("e");
        h.append("l");
        h.append("l");
        h.append("o");
        System.out.println(h);

        //Length
        System.out.println(h.length());


        //Reverse String Question

        java.lang.StringBuilder rev = new java.lang.StringBuilder("Hello");

        for (int i = 0; i < rev.length()/2; i++){
            int front = i;
            int back = rev.length() - 1 - i; //5-1-0=4

            char frontChar = rev.charAt(front);
            char backChar = rev.charAt(back);

            rev.setCharAt(front , backChar);
            rev.setCharAt(back , frontChar);
        }
        System.out.println(rev);
    }
}
