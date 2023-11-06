package bai13.model;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience(String fullName, String birthDay, String phone, String email, int expInYear, String proSkill) {
        super(fullName, birthDay, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public void showTypeSpecificInfo() {
        System.out.println("Years of Experience: " + expInYear);
        System.out.println("Professional Skill: " + proSkill);
    }
}
