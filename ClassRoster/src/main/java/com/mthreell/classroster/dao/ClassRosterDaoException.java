/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.classroster.dao;

/**
 *
 * @author lindseylogan
 */
public class ClassRosterDaoException extends Exception {
    
    //when something is wrong but isn't caused by another exception
    public ClassRosterDaoException(String message) {
        super(message);
    }
    
    //something is wrong and is caused by another exception in underlying impl
    public ClassRosterDaoException(String message, Throwable cause) {   //exception extends throwable; base class is throwable
        super(message, cause);
    }
    
}
