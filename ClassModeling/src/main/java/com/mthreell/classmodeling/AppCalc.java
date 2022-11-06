/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.classmodeling;

import java.util.Scanner;

/**
 *
 * @author lindseylogan
 */
public class AppCalc {
    public static void main(String[] args) {
        
        //properties
        int a;
        int b;
        String operation;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Would you like to use the calculator? (y/n): ");
        String userAction = sc.nextLine();
        
        while (userAction.equals("y")) {
        
            System.out.println("Choose an operation: addition, subtraction, multiplication, division");
            operation = sc.nextLine();
            
            
            System.out.println("Now choose 2 integers to perform calculations on: ");
            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());
            
            System.out.println("Calculating...");
            
            if (operation.equalsIgnoreCase("addition")) {
                int sum = SimpleCalculator.addition(a, b);
                System.out.println("The sum is: " + sum);
            }
            
            if (operation.equalsIgnoreCase("subtraction")) {
                int sub = SimpleCalculator.subtraction(a, b);
                System.out.println("The result is: " + sub);
            }
            
            if (operation.equalsIgnoreCase("multiplication")) {
                int product = SimpleCalculator.multiplication(a, b);
                System.out.println("The product is " + product);
            }
            
            if (operation.equalsIgnoreCase("division")) {
                int quotient = SimpleCalculator.division(a, b);
                System.out.println("The quotient is " + quotient);
            }
            
            System.out.print("Would you like to do another calculation? ");
            userAction = sc.nextLine();
}
        
        
        if (userAction.equals("n")){
            System.out.println("\nGoodbye");
        }
            
            
    }

}
