package Model;

public class Teacher extends BasicUser {
    private String courseTaught;
    private String qualification;

    public String getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Teacher() {
    }


}
