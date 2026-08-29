package com.Ecotrace;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class department {
    @Id
    int d_id;
    String name;
//    @OneToOne
//    Employee e;
    @ManyToMany
List<Employee> allEmployee =new ArrayList<>();

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getAllEmployee() {
        return allEmployee;
    }

    public void setAllEmployee(List<Employee> allEmployee) {
        this.allEmployee = allEmployee;
    }

    //    public Employee getE() {
//        return e;
//    }
//
//    public void setE(Employee e) {
//        this.e = e;
//    }
}
