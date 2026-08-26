package org.example.Collection;

import java.util.ArrayList;
import java.util.Collections;

import static org.example.Collection.List.showList;

public class Collection {

    //Method of Collections
    // : add, size, remove, iterate, addAll, removeAll and clear

    //1. Interface
    //a. List Interface : ArrayList, LinkList , Vector : and under Vector -> Stack
    // Vectors are Thread Safe.

    //b. Queue Interface (FIFO) : PriorityQueue, LinkList , Deque : and under Deque -> ArrayDeque
    // Deque means Double ended Queue.

    //c. Set Interface : HashSet, LinkedHashSet, SortedSet  : and under SortedSet -> TreeSet

    //d. Map Interface : HashMap, LinkedHashMap, HashTable,  SortedMap : and under SortedMap -> TreeMap

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

