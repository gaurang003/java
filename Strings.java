package org.example.ApnaCollege.String;

public class Strings {

    String name = "Gaurang";
    String fullName = "Gaurang Sharma";
    String sentence = "My name is Gaurang.";


//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        //String name = sc.next(); //sc.next() -> only returns single word.
//        String fullName = sc.nextLine(); //sc.nextLine() -> return the whole statement.
//        System.out.println("Your name is + " + fullName);
//        //System.out.println("Your name is + " + name);
//    }

    //Strings are Immutable.

    //-----Functions of Strings------
    //1.concatenation
    //2.length()
    //3.charAt()
    //4.compareTo
    //5.Substring function : contains  2 parameters : beginning index and ending index
    //6.parsing
    public static void main(String args[]){
        String firstname = "Gaurang";
        String lastName = "Sharma";
        //concatenation
        String fullName = firstname + " " + lastName;
        System.out.println(fullName);
        //length
        System.out.println(fullName.length());
        //charAt
        for (int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        //compare - > .compareTo()
        //This function checks 3 cases
        //1. s1 > s2 : +ve value
        //2. s1 == s2 : 0
        //3. s1 < s2 : -ve value
        String name1 = "Tony";
        String name2 = "Tony";

        if (name1.compareTo(name2) == 0){
            System.out.println("Strings are Equal.");
        }else {
            System.out.println("Strings are not Equal.");
        }

        String sentence = "My name is Gaurang";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }

}
