package Services.impl;

import Model.Courses;
import Services.StudentService;

import static Services.impl.TeacherServiceImpl.courseList;

public class StudentServiceImpl implements StudentService {

    @Override
    public void takeCourse(String CourseName, String firstName) {
        for (Courses course : courseList) {
            if (course.getName().equalsIgnoreCase(CourseName)) {
                System.out.println("Course taken by " + firstName + ": " + course.getName());
                return;
            }
        }
        System.out.println("Course NOT found  ");
    }
}
