package Model;

public class Student extends BasicUser {
    private String studentClass;
    private int idNumber;
    private double studentAverage;

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getStudentAverage() {
        return studentAverage;
    }

    public void setStudentAverage(double studentAverage) {
        this.studentAverage = studentAverage;
    }

    public Student() {
    }
}
