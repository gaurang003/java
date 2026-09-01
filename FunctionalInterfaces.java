package org.example.Java8.FunctionalInterfaces;

public class FunctionalInterfaces {
//    A Functional Interface contains:
//    Only ONE abstract method
//    Can contain multiple default/static methods
//    Java provides @FunctionalInterface annotation.

    @FunctionalInterface
    interface Demo{
        void show();

        default void display(){
            System.out.println("Default");
        }
        static void print(){
            System.out.println("Static");
        }
    }

}
