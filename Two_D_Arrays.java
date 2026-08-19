package org.example.ApnaCollege.Array;

import java.util.Scanner;

public class Two_D_Arrays {

    //Declaration 2 D Arrays in Java.
    //type[][] arrayName = new type[rows][columns];

//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
//        int numbers[][] = new int[rows][cols];
//
//        //input
//        //rows
//        for (int i = 0; i<rows; i++){
//            //columns
//            for (int j = 0; j<cols; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//        //output
//        for (int i = 0; i<rows; i++){
//            for (int j = 0; j<cols; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }


    //Search and find the Element in the 2D array.
        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int numbers[][] = new int[rows][cols];
            //input
            for (int i = 0; i<rows; i++){
                for (int j = 0; j<cols; j++){
                    numbers[i][j] = sc.nextInt();
                }
            }
            int x = sc.nextInt();
            //output
            for (int i = 0; i<rows; i++){
                for (int j = 0; j<cols; j++){
                    //compare the x with other numbers
                    if (numbers[i][j] == x){
                        System.out.print("x found at ("+ i + " , "+ j +")");
                    }
                }
                System.out.println();
            }
        }

}
