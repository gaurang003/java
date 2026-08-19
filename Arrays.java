package org.example.ApnaCollege.Array;

import java.util.Scanner;

public class Arrays {

    //List of Items of the  same type. Zero Indexed for arrays.
    //syntax:
    //type[] arrayName = new type[size];

//    public static void main(String args[]){
//        int[] marks = new int[3];
//        marks[0] = 98;
//        marks[1] = 93;
//        marks[2] = 91;
//        for (int i = 0; i<3; i++){
//            System.out.println(marks[i]);
//        }
//    }

    //Input Array and size

//    public static void main(String args[]){
//
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//        for (int i = 0; i < size; i++){
//            numbers[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i<size; i++){
//            System.out.println(numbers[i]);
//        }
//    }

    //Search Element in an Array.

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];


        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i = 0; i<numbers.length; i++){
           if (numbers[i] == x){
               System.out.println("x found at " + i);
           }
        }
    }


}
