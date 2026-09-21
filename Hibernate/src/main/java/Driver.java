import Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("HND");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

//        Student s1=new Student(10,"Satyajit");
//        et.begin();
//        em.persist(s1);
//        et.commit();

       // int choice=sc.nextInt();

        do {
            System.out.println("1.add\n2.merge\n3.findById\n4.delete");
            int choice=sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    Student s = new Student(id, name);
                    et.begin();
                    em.persist(s);
                    et.commit();
                    System.out.println("Student added successfully");
                    break;
                }
                case 2: {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    Student s = new Student(id, name);
                    et.begin();
                    em.merge(s);
                    et.commit();
                    System.out.println("Student merged successfully");
                    break;
                }
                case 3: {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    Student s = em.find(Student.class, id);
                    if (s != null) {
                        System.out.println(s);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    Student s = em.find(Student.class, id);
                    if (s != null) {
                        et.begin();
                        em.remove(s);
                        et.commit();
                        System.out.println("Student deleted successfully");
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }while (true);
    }

}
