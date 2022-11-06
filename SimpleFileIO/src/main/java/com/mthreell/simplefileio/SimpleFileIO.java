/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mthreell.simplefileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author lindseylogan
 */
public class SimpleFileIO {

    public static void main(String[] args) throws Exception {
        //store to files
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));   //can be any file name u want
        
        out.println("this is a line in my file...");
        out.println("this is a second line...");
        out.println("this is a third line!");
        //flush forces everything to be written out to the file
        out.flush();
        out.close();
        //important to close out!!!
        
        
        //read from file
        Scanner sc = new Scanner(new BufferedReader(new FileReader("OutFile.txt")));
        
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
        
        System.out.println("That is all the content in the file.");
    }
}
