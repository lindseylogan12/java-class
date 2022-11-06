/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.classmodeling;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lindseylogan
 */
public class MapExample {
    
    public static void main(String[] args) {
        
        Map<String, Integer> populations = new HashMap<>();
    
        populations.put("USA", 313000000);
    
        populations.put("Canada", 34000000);
    
        populations.put("UK", 63000000);
    
        System.out.println("Map size is = " + populations.size());
        
        
        /*
        Integer usaPop = populations.get("USA");
        System.out.println(usaPop);
        
        //override original usa value with new value
        populations.put("USA", 314000000);
        
        usaPop = populations.get("USA");
        System.out.println(usaPop);
    
        
        Set<String> keys = populations.keySet();
        
        for (String currentKey : keys) {        // no set order
            Integer currentPopulation = populations.get(currentKey);
            System.out.println("The population of " + currentKey + " is: " + currentPopulation);
        }
        
        */
        
        Collection<Integer> populationValues = populations.values();
        
        for (Integer currentPopulation : populationValues) {
            System.out.println(currentPopulation);      // notice no order; also allows for duplicates
        }
    }   
}
