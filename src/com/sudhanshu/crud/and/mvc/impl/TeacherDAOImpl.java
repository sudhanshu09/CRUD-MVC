/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sudhanshu.crud.and.mvc.impl;

import com.sudhanshu.crud.and.mvc.entity.Teacher;
import com.sudhanshu.crud.and.mvc.dao.TeacherDAO;
import java.util.ArrayList;

/**
 *
 * @author Sudhanshu
 */
public class TeacherDAOImpl implements TeacherDAO{
     private   ArrayList<Teacher> teacherList = new ArrayList<>();
   
    
    @Override
    public boolean insert(Teacher t) {
     return  teacherList.add(t);
       
    }

    @Override
    public boolean delete(int id) {
      Teacher t=getById(id);
      if (t!=null){
         teacherList.remove(t);
         return true;
      }
       return false;
      
    }

    @Override
    public Teacher getById(int id) {
        for (Teacher t: teacherList){
            if (t.getId()==id){
                return t;
            }
        }
        return null;
}

    @Override
    public ArrayList<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public int count() {
return teacherList.size();
    }
    

    
    }

