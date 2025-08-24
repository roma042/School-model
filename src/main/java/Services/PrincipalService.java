package Services;

import Model.Student;

public interface PrincipalService {
    void admit(String firstName, String lastName, int Age);

    void expel();

    void loadApplicants();
}
