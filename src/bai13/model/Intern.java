package bai13.model;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;

    public Intern(String fullName, String birthDay, String phone, String email, String majors, String semester, String universityName) {
        super(fullName, birthDay, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public void showTypeSpecificInfo() {
        System.out.println("Majors: " + majors);
        System.out.println("Semester: " + semester);
        System.out.println("University Name: " + universityName);
    }
}
