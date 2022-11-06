/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mthreell.statecapitals3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author lindseylogan
 */
public class StateCapitalsApp {

    public static void main(String[] args) throws Exception {
        
        Map<String, Capital> map = new HashMap<>();
        
        Scanner sc = new Scanner(new BufferedReader(new FileReader("MoreStateCapitals.txt")));
        
        int count = 0;
        
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] details = currentLine.split("::");
            
            
            //assign variables to each element in array
            String state = details[0].trim();
            String capital = details[1].trim();
            String population = details[2].trim();
            String mileage = details[3].trim();
            count++;
        
        //create new capital object
        Capital cap = new Capital(capital, population, mileage);
        
        map.put(state, cap);
        
        }
        
        Set<String> keys = map.keySet();
        
        
        System.out.println(count + " STATES & CAPITALS ARE LOADED! :D\n");
        
        for (String states : keys) {
            Capital cpt = map.get(states);
            System.out.println(states + " - " + cpt.getName() + " | Population: " + cpt.getPopulation() + " | Area: " + cpt.getSquareMileage() + " sq miles");
        }
        
        //user input
        Scanner scanner = new Scanner (System.in);
        System.out.print("\nPlease enter desired population lower limit: ");
        int limit = scanner.nextInt();
        
        System.out.println("\nListing capitals with populations greater than " + limit + "\n");
        
        int amount = 0;
        
        //getting pop for each state greater than lower limit
        for (String states : keys) {
            Capital cpt = map.get(states);
            int pop = Integer.parseInt(cpt.getPopulation());
            if (pop > limit) {
                System.out.println(states + " - " + cpt.getName() + " | Population: " + cpt.getPopulation());
                amount++;
            }
        }
        System.out.println("\nThere are " + amount + " states with a population greater than " + limit);
    }
}
