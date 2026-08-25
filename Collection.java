package org.example.Collection;

import java.util.ArrayList;
import java.util.Collections;

import static org.example.Collection.List.showList;

public class Collection {

    public static void show(){
        ArrayList<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","c");
        collection.remove("a");
        //collection.clear();
        System.out.println(collection);
    }

    public static void main(String[] args){
        show();
        showList();
    }


}

