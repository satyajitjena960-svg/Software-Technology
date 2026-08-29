package com.Ecotrace;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    @Id
    int id;
    String name;
    @ManyToMany(mappedBy = "allEmployee")
    List<department> alldep=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<department> getAlldep() {
        return alldep;
    }

    public void setAlldep(List<department> alldep) {
        this.alldep = alldep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
