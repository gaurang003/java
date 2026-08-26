package org.example.Collection;

import org.example.Basic.Strings;

import java.util.ArrayList;
import java.util.Collections;

public class List {

    public static void showList(){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        System.out.println(list.indexOf("a"));
        System.out.println(list.subList(0,2));
    }
}




