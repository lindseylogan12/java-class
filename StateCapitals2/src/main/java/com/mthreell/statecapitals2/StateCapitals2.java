/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mthreell.statecapitals2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author lindseylogan
 */
public class StateCapitals2 {

    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
        
        Scanner sc = new Scanner(new BufferedReader(new FileReader("newfile.txt")));
        
        int count = 0;
        
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] details = line.split("::");
            map.put(details[0], details[1]);
            count++;
        }
        
        System.out.println(count + " STATES & CAPITALS ARE LOADED! :D\n");
        
        Set<String> keys = map.keySet();
        
        System.out.println("STATES:");
        System.out.println("=======");
        
        //print out all of the states
        for (String states : keys) {
            System.out.print(states + ", ");   
        }
        
        //knowledge game
        List<String> valueList = new ArrayList<>(map.keySet());
        Scanner newScanner = new Scanner(System.in);
        Random random = new Random();
        int randomIndex = random.nextInt(valueList.size());
        String randomValue = valueList.get(randomIndex);
        
        System.out.println("\nWhat is the capital of " + randomValue + "?");
        String answer = newScanner.nextLine();
        
        
        if (answer.equals(map.get(randomValue))) {
        System.out.println(answer + " is correct!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
