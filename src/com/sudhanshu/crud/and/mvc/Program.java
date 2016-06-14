/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudhanshu.crud.and.mvc;

import com.sudhanshu.crud.and.mvc.controller.TeacherController;
import com.sudhanshu.crud.and.mvc.entity.Teacher;
import java.util.ArrayList;
import com.sudhanshu.crud.and.mvc.dao.TeacherDAO;
import com.sudhanshu.crud.and.mvc.impl.TeacherDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Sudhanshu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*     ArrayList<Teacher> teacherList = new ArrayList<>();
         System.out.println(teacherList.size());
         teacherList.add(new Teacher(1, "John", "Jackson", "john@gmail.com"));
         teacherList.add(new Teacher(2, "Marry", "Parker", "marry@gmail.com"));
         teacherList.add(new Teacher(3, "Harry", "Smith", "harry@gmail.com"));

         /*  teacherList.remove(0);
         System.out.println(teacherList.size());

         Teacher t = teacherList.get(1);
         System.out.println(t.getFirstName());*/
        /* for (Teacher t:teacherList){
         System.out.println(t.getFirstName());
         }
         */
        Scanner input = new Scanner(System.in);
        TeacherDAO teacherDAO = new TeacherDAOImpl();
        TeacherController tController=new TeacherController(teacherDAO, input);
        System.out.println("Welcome to Teacher Mangagement System ");
        
        while (true) {
          tController.process();
            
        }
        
        
    }

}
