/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.objectinstantiation;

/**
 *
 * @author lindseylogan
 */
public class AppPerson {
    
    public static void main(String[] args) {
        int count = 19;
        Person person = new Person();           //have to instantiate person object 
        person.setAge(35);
        person.setName("Perry");    // null is special value in java that indicates that there is a ref to user defined type that isnt associated with any object on the heap
        
        //person = null; // i know longer want person ref to be associated with that object, so im gonna set it to null; doesnt point to anything
        
        System.out.println("Count = " + count);
        System.out.println("Age = " + person.getAge());     //age displays 0 because thats default int
        System.out.println("Name = " + person.getName());   // displays null; default user defined type
        
        
        
        //primitives and objects as method parameters
        
        int count2 = 18;            // value here gets copied into changeMyValue(int value); 2 boxes of data - 1 for 21 and one for 18
        changeMyValue(count);
        System.out.println("Count2 = " + count2);
        
        Person myPerson = new Person();         // new person created on the heap
        myPerson.setAge(24);
        myPerson.setName("Joe");
        System.out.println("Age = " + myPerson.getAge());
        System.out.println("Name = " + myPerson.getName());
        
        changeMyName(myPerson);         //value in this gets copied into changeMyName(Person person); like a tv with two remots - there is only one person, but two things are pointing to it
        
        System.out.println("Age = " + myPerson.getAge());
        System.out.println("Name = " + myPerson.getName());     //now name prints steve since we added it to method
    }
    
    public static void changeMyValue(int value) {
        value = 21; 
        
    }
    
    public static void changeMyName(Person person) {
        person.setName("Steve");
    }
}
