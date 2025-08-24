package Services.impl;

import Model.Applicants;
import Model.Student;
import Services.PrincipalService;
import Services.StudentService;

import java.util.ArrayList;
import java.util.List;

public class PrincipalServiceImpl implements PrincipalService {
    public static List<Applicants> applicantsList = new ArrayList<>();
    public static List<Student> studentList = new ArrayList<>();

    private void sendEmail() {
        for (Applicants applicant : applicantsList) {
            System.out.println("From email: " + "Congratulations " + applicant.getFirstName() + " you have been admitted!");
            return;
        }
    }


    @Override
    public void admit(String firstName, String lastName, int Age) {
        for (Applicants applicant : applicantsList) {
            if (applicant.getFirstName().equals(firstName) && applicant.getLastName().equals(lastName) && applicant.getAge() > 9 && !studentList.contains(applicant)) {
                System.out.println("Congratulations " + applicant.getFirstName() + " you have been admitted!");
                Student newStudent = new Student();
                studentList.add(newStudent);
                System.out.println("Total number of students: " + studentList.size());
                sendEmail();
                return;

            }

        }
        System.out.println("Not admitted");

    }

    @Override
    public void expel() {
        for (Student student : studentList) {
            if (student.getIdNumber() == 2165) {
                System.out.println(student.getFirstName() + ", ID number: " + student.getIdNumber() + "; YOU HAVE BEEN EXPELLED!");
                studentList.remove(student);
                System.out.println("Remaining " + studentList.size() + " students");
                return;
            }
        }
        System.out.println("RECORD NOT FOUND");
    }

    @Override
    public void loadApplicants() {
        Applicants applicant1 = new Applicants();
        applicant1.setFirstName("Theon");
        applicant1.setLastName("Greyjoy");
        applicant1.setAge(13);

        Applicants applicant2 = new Applicants();
        applicant2.setFirstName("Godwin");
        applicant2.setLastName("Patrick");
        applicant2.setAge(9);

        applicantsList.add(applicant1);
        applicantsList.add(applicant2);

        System.out.println("N0 of applicants: " + applicantsList.size());
    }

}
