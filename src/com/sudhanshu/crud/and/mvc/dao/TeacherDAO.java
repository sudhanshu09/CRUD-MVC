/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudhanshu.crud.and.mvc.dao;

import com.sudhanshu.crud.and.mvc.entity.Teacher;
import java.util.ArrayList;

/**
 *
 * @author Sudhanshu
 */
public interface TeacherDAO {

    boolean insert(Teacher t);

    boolean delete(int id);

    Teacher getById(int id);

    ArrayList<Teacher> getAll();

    public int count();
    
  
  }


