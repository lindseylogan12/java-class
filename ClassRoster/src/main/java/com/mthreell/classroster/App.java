/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mthreell.classroster;

import com.mthreell.classroster.controller.ClassRosterController;
import com.mthreell.classroster.dao.ClassRosterDao;
import com.mthreell.classroster.dao.ClassRosterDaoFileImpl;
import com.mthreell.classroster.ui.ClassRosterView;
import com.mthreell.classroster.ui.UserIO;
import com.mthreell.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author lindseylogan
 */
public class App {

    public static void main(String[] args) {
        
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = 
                new ClassRosterController(myDao, myView);
        controller.run();
    }
}
