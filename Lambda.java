package org.example.Java8.Lambda;

public class Lambda {
//    Syntax
//            (parameters) -> expression
//    OR
//            (parameters) -> {
//        statements;
//    }
    //Example 1: Without Lambda
    interface Greeting {
        void sayHello();
    }

//    public static void main(String args[]){
//        Greeting g = new Greeting() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello");
//            }
//        };
//        g.sayHello();
//    }

    //Example 2: With Lambda

    public static void main(String args[]){

        Greeting g = () -> System.out.println("Hello");
        g.sayHello();

        Add obj = (a,b)->a+b;
        System.out.println(obj.sum(10, 20));
    }

    //Lambda with Parameters
    interface Add{
        int sum(int a, int b);
    }
}
