package com.Ecotrace.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    int c_id;
    String c_name;

    @ManyToMany
    List<Student> allStudent=new ArrayList<>();

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public List<Student> getAllStudent() {
        return allStudent;
    }

    public void setAllStudent(List<Student> allStudent) {
        this.allStudent = allStudent;
    }
}
