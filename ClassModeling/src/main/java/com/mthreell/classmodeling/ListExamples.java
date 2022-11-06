package com.mthreell.classmodeling;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lindseylogan
 */
public class ListExamples {
    
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();
        
        //add string object to our list
        stringList.add("My first string");
        
        stringList.add("My second string");
        
        stringList.add("My third string");
        
        System.out.println("List size = " + stringList.size());         //notice .size instead of .length (array)
        
        //enhanced for loop
        //declare the thing u want to pull out of string each time : where we pull it out of 
        for(String currentString : stringList) {
            System.out.println(currentString);
        }
        
        //iterator visit each element in a collection exactly once; important bc not all of our collections are ordered
        Iterator<String> iterator = stringList.iterator();
        
        while (iterator.hasNext()) {
            String currentString = iterator.next();
            System.out.println(currentString);
        }
    }
}
