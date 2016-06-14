/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudhanshu.crud.and.mvc.controller;

import com.sudhanshu.crud.and.mvc.dao.TeacherDAO;
import com.sudhanshu.crud.and.mvc.entity.Teacher;
import java.util.Scanner;

/**
 *
 * @author Sudhanshu
 */
public class TeacherController {

    private TeacherDAO teacherDAO;
    private Scanner input;
    private int counter;

    public TeacherController(TeacherDAO teacherDAO, Scanner input) {
        this.teacherDAO = teacherDAO;
        this.input = input;

    }

    public void menu() {
        System.out.println("1.Add Teacher");
        System.out.println("2.Delete Teacher");
        System.out.println("3.Show All");
        System.out.println("4.Search by Id");
        System.out.println("6. Exit");
        System.out.println("Enter your choice [1-6]");

    }

    private void add() {
        while (true) {
            Teacher teacher = new Teacher();
            teacher.setId(teacherDAO.count() + 1);
            teacher.setId(teacherDAO.getAll().size() + 1);
            System.out.println("Enter First Name:");
            teacher.setFirstName(input.next());
            System.out.println("Enter Last Name:");
            teacher.setLastName(input.next());
            System.out.println("Enter Email");
            teacher.setEmail(input.next());
            teacherDAO.insert(teacher);
            System.out.println("Do you  want to add more ? [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;

            }

        }
    }

    private void delete() {
        System.out.println("Enter Id to delete ");
        Teacher teacher = teacherDAO.getById(input.nextInt());
        if (teacher != null) {
            System.out.println("Id:" + teacher.getId());
            System.out.println("Name:" + teacher.getFullName());
        } else {
            System.out.println("ID not found ");
        }
        System.out.println("Do you  really  want to delete ? [Y/N]");
        if (input.next().equalsIgnoreCase("n")) {

        }
        counter--;
    }

    private void showAll() {
        for (Teacher t : teacherDAO.getAll()) {
            System.out.println("Id:" + t.getId());
            System.out.println("Name:" + t.getFullName());
        }
        System.out.println("Press Any Key to Procced to Menu");
        input.next();
    }

    private void searchById() {
        while (true) {
            System.out.println("Enter Id to search");
            Teacher teacher = teacherDAO.getById(input.nextInt());
            if (teacher != null) {
                System.out.println("Id:" + teacher.getId());
                System.out.println("Name:" + teacher.getFullName());
            } else {
                System.out.println("ID not found ");
            }
            System.out.println("Do you  want to search again ? [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;

            }

        }
    }

    public void process() {
        menu();
        switch (input.nextInt()) {
            case 1:
                add();

            case 2:
                delete();
                break;
            case 3:
                showAll();
                break;
            case 4:
                searchById();
                break;
            case 5:
                break;
            case 6:
                System.out.println("Do you really want to exit? [Y/N]");
                if (input.next().equalsIgnoreCase("y")) {
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
