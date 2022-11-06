/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.classmodeling.UserIO;

/**
 *
 * @author lindseylogan
 */
public class TestingUserIO {
    public static void main(String[] args) {
        
        UserIO userIO = new UserIOImpl();
        
        int smallNum = userIO.readInt("Give me a small number: ");
        int bigNum = userIO.readInt("Give me a big number: ");
        if(bigNum < smallNum) {
            userIO.print("Hey! " + smallNum + " is BIGGER than " + bigNum);
            userIO.print("I guess I can fix it.");
            int swapNum = bigNum;
            bigNum = smallNum;
            smallNum = swapNum;
        }
        int betweenNum = userIO.readInt("Now give me one in between: ");
        userIO.print("I like the number "+betweenNum+"!");
        
        int testNum = userIO.readInt("Please enter a number between 1 - 5:", 1, 5);
        
        double testNum2 = userIO.readDouble("Please enter a decimal between 0.10 - 0.20", 0.10, 0.20);
    }
}
