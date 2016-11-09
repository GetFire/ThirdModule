package Homework.Task3_3;


public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }
}
