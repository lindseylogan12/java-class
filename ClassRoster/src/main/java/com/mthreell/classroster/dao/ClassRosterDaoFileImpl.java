/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.classroster.dao;

import com.mthreell.classroster.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lindseylogan -- this files holds all data in memory only; wont read from or write to file
 */
public class ClassRosterDaoFileImpl implements ClassRosterDao {
    
    private Map<String, Student> students = new HashMap<>();
    
    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    @Override
    public Student addStudent(String studentId, Student student) 
    throws ClassRosterDaoException {
        loadRoster();
        Student newStudent = students.put(studentId, student);
        writeRoster();
        return newStudent;
    }

    @Override
    public List<Student> getAllStudents() 
    throws ClassRosterDaoException {
        loadRoster();
        return new ArrayList(students.values());
    }

    @Override
    public Student getStudent(String studentId) 
    throws ClassRosterDaoException {
        loadRoster();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) 
    throws ClassRosterDaoException {
        loadRoster();
        Student removedStudent = students.remove(studentId);
        writeRoster();
        return removedStudent;
    }
    
    private Student unmarshallStudent(String studentAsText) {
        String[] studentTokens = studentAsText.split(DELIMITER);
        
        String studentId = studentTokens[0];
        Student studentFromFile = new Student(studentId); //create new student object to satisfy req of student constructor
        
        studentFromFile.setFirstName(studentTokens[1]);
        studentFromFile.setLastName(studentTokens[2]);
        studentFromFile.setCohort(studentTokens[3]);
        
        //student created! return it
        return studentFromFile;
    }
    
    private void loadRoster() throws ClassRosterDaoException {
        Scanner scanner;
        
        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new ClassRosterDaoException(
            "-_- Could not load roster data into memory.", e);
        }
        String currentLine; //holds more recent line read from file
        
        Student currentStudent; //hols most recent student unmarshalled
        
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentStudent = unmarshallStudent(currentLine); //unmarshall line into student
            
            //use studentId as map key for student object
            students.put(currentStudent.getStudentId(), currentStudent);
        }
        //close scanner
        scanner.close();
    }
    
    private String marshallStudent(Student aStudent) {
        //we need to turn a student object into a line of text for our file
        
        //start with studentId
        String studentAsText = aStudent.getStudentId() + DELIMITER;
        studentAsText += aStudent.getFirstName() + DELIMITER;
        studentAsText += aStudent.getLastName() + DELIMITER;
        studentAsText += aStudent.getCohort(); //skip delimiter!
        
        //we have turned student into text! return it!
        return studentAsText;
    }
    
    private void writeRoster() throws ClassRosterDaoException {
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new ClassRosterDaoException(
            "Could not save student data.", e);
        }
        
        String studentAsText;
        List<Student> studentList = this.getAllStudents();
        for (Student currentStudent : studentList) {
        // turn a student object into a string:
        studentAsText = marshallStudent(currentStudent);
        //write the student object to the file:
        out.print(studentAsText);
        //force PrintWriter to write line to the file:
        out.flush();
        }
        //clean up
        out.close();
    }
     
    
}
