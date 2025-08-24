package Services.impl;

import Model.Courses;
import Model.Student;
import Services.TeacherService;

import java.util.ArrayList;
import java.util.List;

import static Services.impl.PrincipalServiceImpl.studentList;

public class TeacherServiceImpl implements TeacherService {

    public static List<Courses> courseList = new ArrayList<>();


    @Override
    public void teach(String courseName) {
        for (Courses course : courseList) {
            if (course.getName().equals(courseName)) {
                System.out.println(course.getName());
            }
            return;

        }
        System.out.println("Course NOT found");


    }


    @Override
    public void record(double score, String firstName, String lastName) {
//        studentList.forEach(student -> {
//            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
//                student.setStudentAverage(score);
//                System.out.println(firstName + " average: " + student.getStudentAverage());
//            }
//        });
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                student.setStudentAverage(score);
                System.out.println(firstName + " average: " + student.getStudentAverage());
            }
        }
    }


    @Override
    public void loadCourses() {
        Courses course1 = new Courses();
        course1.setName("Mathematics");
        course1.setTotalScore(95);

        Courses course2 = new Courses();
        course2.setName("Geography");
        course2.setTotalScore(100);

        courseList.add(course1);
        courseList.add(course2);
        System.out.println("Number of courses loaded: " + courseList.size());
    }

    @Override
    public void loadStudents() {
        Student student1 = new Student();
        student1.setStudentAverage(85);
        student1.setStudentClass("Jss3");
        student1.setIdNumber(5623);
        student1.setFirstName("Rita");
        student1.setLastName("Obi");
        student1.setAge(15);

        Student student2 = new Student();
        student2.setStudentAverage(67);
        student2.setStudentClass("Jss3");
        student2.setIdNumber(2165);
        student2.setFirstName("Max");
        student2.setLastName("Ebo");
        student2.setAge(14);

        studentList.add(student1);
        studentList.add(student2);

        System.out.println("Number of student loaded: " + studentList.size());
        for (Student student : studentList) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName() + "\nAge: " + student.getAge() + "\nClass " + student.getStudentClass() + "\nID Number: " + student.getIdNumber() + "\nAverage Score: " + student.getStudentAverage() + "\n");
        }

    }
}
