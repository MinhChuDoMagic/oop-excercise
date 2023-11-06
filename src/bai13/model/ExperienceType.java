package bai13.model;

public enum ExperienceType {
    EXPERIENCE(0),
    FRESHER(1),
    INTERN(2);

    private int value;

    ExperienceType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
