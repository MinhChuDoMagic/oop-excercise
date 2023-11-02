package bai13.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    public static int count = 0;
    private int id;
    private String fullName;
    private String birthday;
    private String phone;
    private String email;
    private List<Certificate> certificates;

    public Employee(String fullName, String birthday, String phone, String email) {
        this.id = ++count;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.certificates = new ArrayList<>();
    }

    public void addCertificate(String id, String name, String rank, String date) {
        Certificate certificate = new Certificate(id, name, rank, date);
        certificates.add(certificate);
    }

    public void showInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Day: " + birthday);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        for (Certificate certificate : certificates) {
            certificate.showInfo();
        }
        this.showTypeSpecificInfo();
    }
    public abstract void showTypeSpecificInfo();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }
}
