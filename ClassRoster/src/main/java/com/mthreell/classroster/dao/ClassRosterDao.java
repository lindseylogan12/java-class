/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.classroster.dao;

import com.mthreell.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author lindseylogan
 */
public interface ClassRosterDao {
    
    // adds student to roster and associates with given ID
    // if student associated with student id alrdy, returns student object
    // otherwise null
    Student addStudent(String studentId, Student student)
            throws ClassRosterDaoException;
    
    List<Student> getAllStudents()
            throws ClassRosterDaoException;
    
    // returns student object associated with given student id
    Student getStudent(String studentId)
            throws ClassRosterDaoException;
    
    Student removeStudent(String studentId)
            throws ClassRosterDaoException;
    
}
