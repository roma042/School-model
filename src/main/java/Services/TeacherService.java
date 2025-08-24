package Services;

public interface TeacherService {
    void teach(String courseName);

    void record(double score, String firstName, String lastName);

    void loadCourses();

    void loadStudents();
}
