package com.Ecotrace;

import com.Ecotrace.Student.Course;
import com.Ecotrace.Student.Courserepo;
import com.Ecotrace.Student.Student;
import com.Ecotrace.Student.Studentepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class EcotraceApplication {

	public static void main(String[] args) {



//        Iterable<Employee> allEmployee-er.findAll();
//        allEmployee.forEach(EmpData->{
//            System.out.println(EmpData);
//        });

//        Optional<Employee> oneData=er.findById(101);
//        System.out.println(oneData.get());
//        Optional<Employee> oneData=er.findById(101);
//        Employee updateData=oneData.get();
//        System.out.println(updateData);
//        updateData.setName("satya");
//        System.out.println(updateData);
//        er.save(updateData);


//        er.delete(101);
//        er.deleteAll();

//        Departmentrepo d=ioc.getBean(Departmentrepo.class);
//        Emprepo er=ioc.getBean(Emprepo.class);
//        Employee e1=new Employee();
//        Employee e3=new Employee();
//        Employee e2=new Employee();
//        department d1=new department();
//        department d2=new department();
//        department d3=new department();
//
//        List<department> alldep=new ArrayList<>();
//        alldep.add(d1);
//        alldep.add(d2);
//        alldep.add(d3);
//        List<department> alldep1=new ArrayList<>();
//        alldep1.add(d1);
//        alldep1.add(d2);
//        alldep1.add(d3);
//        e1.setName("sj");
//        e1.setId(1);
//        e1.setAlldep(alldep);
//        e2.setId(2);
//        e2.setAlldep(alldep1);
//        e2.setName("Satyajit");
//        e3.setId(3);
//        e3.setAlldep(alldep);
//        e3.setName("Satya");
//        er.save(e2);
//        er.save(e1);
//        er.save(e3);
//
//        List<Employee> allemp=new ArrayList<>();
//        allemp.add(e1);
//        allemp.add(e2);
//        allemp.add(e3);

        ApplicationContext ioc = SpringApplication.run(EcotraceApplication.class, args);
        Studentepo s = ioc.getBean(Studentepo.class);
        Courserepo c = ioc.getBean(Courserepo.class);

        Student s1 = new Student();
        s1.setS_id(1);
        s1.setS_name("Satyajit");

        Student s2 = new Student();
        s2.setS_id(2);
        s2.setS_name("Sj");

        s.save(s1);
        s.save(s2);

        Course c1 = new Course();
        c1.setC_id(101);
        c1.setC_name("MCA");

        Course c2 = new Course();
        c2.setC_id(102);
        c2.setC_name("BCA");

        List<Course> cor = new ArrayList<>();
        cor.add(c1);
        List<Course> cor2 = new ArrayList<>();
        cor2.add(c2);

        List<Student> st1 = new ArrayList<>();
        st1.add(s1);
        List<Student> st2 = new ArrayList<>();
        st2.add(s2);

        c1.setAllStudent(st1);
        c2.setAllStudent(st2);

        s1.setAllCourse(cor);
        s2.setAllCourse(cor2);

        c.save(c1);
        c.save(c2);

        s.save(s1);
        s.save(s2);





	}

}
