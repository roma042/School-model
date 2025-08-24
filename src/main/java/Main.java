import Services.PrincipalService;
import Services.StudentService;
import Services.TeacherService;
import Services.impl.PrincipalServiceImpl;
import Services.impl.StudentServiceImpl;
import Services.impl.TeacherServiceImpl;

public class Main {
    public static void main(String[] args) {
        TeacherService teacher = new TeacherServiceImpl();
        PrincipalService principalService = new PrincipalServiceImpl();
        StudentService student = new StudentServiceImpl();

        teacher.loadCourses();
        teacher.loadStudents();
        teacher.teach("Mathematics");
        teacher.record(78, "Max", "Ebo");

        principalService.loadApplicants();
        principalService.admit("Theon", "Greyjoy", 7);
        principalService.expel();

        student.takeCourse("Mathematics", "Max");
    }
}
