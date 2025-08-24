package Model;

public class Applicants extends BasicUser {
    private double score;
    private String address;
    private String guardianContact;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuardianContact() {
        return guardianContact;
    }

    public void setGuardianContact(String guardianContact) {
        this.guardianContact = guardianContact;
    }

    public Applicants() {
    }
}
