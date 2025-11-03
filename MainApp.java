package com.hibernate;

import com.hibernate.dao.StudentDAO;
import com.hibernate.entity.Student;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        System.out.println("=== Create Student ===");
        dao.saveStudent(new Student("Ravi", "Java", 5500));
        dao.saveStudent(new Student("Simran", "Python", 6500));

        System.out.println("=== Read Students ===");
        List<Student> students = dao.getAllStudents();
        students.forEach(System.out::println);

        System.out.println("=== Update Student ID 1 ===");
        dao.updateStudent(1, "Ravi Kumar");

        System.out.println("=== Delete Student ID 2 ===");
        dao.deleteStudent(2);

        System.out.println("=== Final Student List ===");
        dao.getAllStudents().forEach(System.out::println);
    }
}
