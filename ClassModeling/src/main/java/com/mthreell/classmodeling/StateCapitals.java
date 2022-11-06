/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.classmodeling;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author lindseylogan
 */
public class StateCapitals {
    public static void main(String[] args) {
        
        Map<String, String> statesAndCapitals = new HashMap<>();
        
        statesAndCapitals.put("Florida", "Tallahassee");
        
        statesAndCapitals.put("Georgia", "Atlanta");
        
        statesAndCapitals.put("South Carolina", "Columbia");
        
        statesAndCapitals.put("North Carolina", "Raleigh");
        
        statesAndCapitals.put("Virginia", "Richmond");
        
        statesAndCapitals.put("Delware", "Dover");
        
        Set<String> keys = statesAndCapitals.keySet();
        
        //print just states
        System.out.println("STATES:");
        System.out.println("=======");
        
        for (String states : keys) {
            System.out.println(states);
        }
        
        //print just capitals
        System.out.println("\nCAPITALS:");
        System.out.println("=========");
        
        for (String states : keys) {
            System.out.println(statesAndCapitals.get(states));
        }
        
        //print state capital pairs
        System.out.println("\nSTATE/CAPITAL PAIRS:");
        System.out.println("====================");
        //state is the key, capital is the value
        for (String states : keys) {
            System.out.println(states + " -- " + statesAndCapitals.get(states));
        }
    }
}
