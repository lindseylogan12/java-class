/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.classmodeling.UserIO;

import java.util.Scanner;

/**
 *
 * @author lindseylogan
 */
public class UserIOImpl implements UserIO {
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
    @Override
    public String readString(String prompt) {
       print(prompt);
       return sc.nextLine();
    }
    
    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }
    
    @Override
    public int readInt(String prompt, int min, int max) {
        int number;
        do {
            System.out.println(prompt);
            number = sc.nextInt();
            sc.nextLine();
            if (number < min || number > max) {
                System.out.println("Number must be between " + min + " and " + max + ". Please enter a new number");
            }
        } while (number < min || number > max);
        return number;
    }
    
    @Override
    public double readDouble(String prompt) {
        print(prompt);
        return sc.nextDouble();
    }
    
    @Override
    public double readDouble(String prompt, double min, double max) {
        double number;
        do {
            System.out.println(prompt);
            number = sc.nextDouble();
            sc.nextLine();
            if (number < min || number > max) {
                System.out.println("Number must be between " + min + " and " + max + ". Please enter a new number");
            }
        } while (number < min || number > max);
        return number;
    }
    
    @Override
    public float readFloat(String prompt) {
        print(prompt);
        return sc.nextFloat();
    }
    
    @Override
    public float readFloat(String prompt, float min, float max) {
        float number;
        do {
            System.out.println(prompt);
            number = sc.nextFloat();
            sc.nextLine();
            if (number < min || number > max) {
                System.out.println("Number must be between " + min + " and " + max + ". Please enter a new number");
            }
        } while (number < min || number > max);
        return number;
    }
    
    @Override
    public long readLong(String prompt) {
        print(prompt);
        return sc.nextLong();
    }
    
    @Override
    public long readLong(String prompt, long min, long max) {
        long number;
        do {
            System.out.println(prompt);
            number = sc.nextLong();
            sc.nextLine();
            if (number < min || number > max) {
                System.out.println("Number must be between " + min + " and " + max + ". Please enter a new number");
            }
        } while (number < min || number > max);
        return number;
    }
}
