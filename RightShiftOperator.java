package org.example.ApnaCollege.BitManipulation;

import javax.script.ScriptContext;
import java.util.Scanner;

public class RightShiftOperator {

    //Right Shift Operator : >>
    //Ex : N >> 1
    //     2 >> 1
    //     010 >> 1
    //     001
    //Operations : 1. Get , 2. Set , 3. Clear, 4. Update
    //Get -> &
    //Set -> |
    //Clear -> & with !
    //Update - > case 1 : Set , case 0 : Clear
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        //GET
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0){
            System.out.println("Bit is Zero");
        }else {
            System.out.println("Bit is One");
        }

        //SET
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        //CLEAR
        int notBitMask = ~(bitMask);
        int newNumber1 = notBitMask & n;
        System.out.println(newNumber1);

        //UPDATE
        //update bit to 1 else update bit o 0;
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int bitMaskUpdate = 1<<pos;
        if(oper == 1){
            //set
            int newNumberUpdate = bitMaskUpdate | n;
            System.out.println(newNumberUpdate);
        }else {
            //clear
            int newBitMask = ~(bitMaskUpdate);
            int newNumberUpdate = newBitMask & n;
            System.out.println(newNumberUpdate);
        }





    }



}
