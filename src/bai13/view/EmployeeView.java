package bai13.view;

import bai13.model.Employee;
import bai13.model.Experience;
import bai13.model.Fresher;
import bai13.model.Intern;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    Scanner scanner = new Scanner(System.in);
    public int menuView(){
        System.out.print("");
        System.out.println("Quản lý nhân viên");
        System.out.println("1. Thêm nhân viên");
        System.out.println("2. Sửa thông tin nhân viên");
        System.out.println("3. Xóa nhân viên");
        System.out.println("4. Hiển thị danh sách nhân viên");
        System.out.println("5. Hiển thị danh sách nhân viên theo loại");
        System.out.println("0. Thoát");

        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public Employee addEmployeeView(){
        System.out.println("Nhập thông tin nhân viên:");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("BirthDay (dd/mm/yyyy): ");
        String birthDay = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Employee Type (0: Experience, 1: Fresher, 2: Intern): ");
        int employeeType = scanner.nextInt();
        scanner.nextLine();

        Employee newEmployee = null;

        switch (employeeType) {
            case 0:
                System.out.print("Số năm kinh nghiệm: ");
                int expInYear = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kỹ năng chuyên môn: ");
                String proSkill = scanner.nextLine();
                newEmployee = new Experience( fullName, birthDay, phone, email, expInYear, proSkill);
                break;
            case 1:
                System.out.print("Thời gian tốt nghiệp: ");
                String graduationDate = scanner.nextLine();
                System.out.print("Xếp loại tốt nghiệp: ");
                String graduationRank = scanner.nextLine();
                System.out.print("Trường tốt nghiệp: ");
                String education = scanner.nextLine();
                newEmployee = new Fresher(fullName, birthDay, phone, email, graduationDate, graduationRank, education);
                break;
            case 2:
                System.out.print("Chuyên ngành đang học: ");
                String majors = scanner.nextLine();
                System.out.print("Học kì đang học: ");
                String semester = scanner.nextLine();
                System.out.print("Tên trường đang học: ");
                String universityName = scanner.nextLine();
                newEmployee = new Intern(fullName, birthDay, phone, email, majors, semester, universityName);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }

        return newEmployee;
    }

    public Employee updateEmployee(Employee employee){
        System.out.println("Nhập thông tin mới cho nhân viên (ID = " + employee.getId() + "):");
        System.out.print("Full Name: ");
        String newFullName = scanner.nextLine();
        System.out.print("BirthDay (dd/mm/yyyy): ");
        String newBirthDay = scanner.nextLine();
        System.out.print("Phone: ");
        String newPhone = scanner.nextLine();
        System.out.print("Email: ");
        String newEmail = scanner.nextLine();

        employee.setBirthday(newBirthDay);
        employee.setEmail(newEmail);
        employee.setPhone(newPhone);
        employee.setFullName(newFullName);

        if(employee instanceof Experience){
            System.out.print("Số năm kinh nghiệm: ");
            int expInYear = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Kỹ năng chuyên môn: ");
            String proSkill = scanner.nextLine();

            ((Experience) employee).setProSkill(proSkill);
            ((Experience) employee).setExpInYear(expInYear);

        }else if (employee instanceof Fresher){
            System.out.print("Thời gian tốt nghiệp: ");
            String graduationDate = scanner.nextLine();
            System.out.print("Xếp loại tốt nghiệp: ");
            String graduationRank = scanner.nextLine();
            System.out.print("Trường tốt nghiệp: ");
            String education = scanner.nextLine();
            ((Fresher) employee).setEducation(education);
            ((Fresher) employee).setGraduationDate(graduationDate);
            ((Fresher) employee).setGraduationRank(graduationRank);
        } else if (employee instanceof Intern) {
            System.out.print("Chuyên ngành đang học: ");
            String majors = scanner.nextLine();
            System.out.print("Học kì đang học: ");
            String semester = scanner.nextLine();
            System.out.print("Tên trường đang học: ");
            String universityName = scanner.nextLine();
            ((Intern) employee).setMajors(majors);
            ((Intern) employee).setSemester(semester);
            ((Intern) employee).setUniversityName(universityName);
        }

        return employee;
    }

    public int getIdView(){
        System.out.print("Nhập ID nhân viên: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public void employeeNotFoundView(int id){
        System.out.println("Không tìm thấy nhân viên với ID " + id);
    }
    public void displayEmployeeInfo(Employee employee) {
        employee.showInfo();
    }

    public void displayEmployeesInfo(List<Employee> employee){
        System.out.println("Danh sách nhân viên:");
        employee.forEach(this::displayEmployeeInfo);
    }

    public int employeeTypeView(){
        System.out.print("Employee Type (0: Experience, 1: Fresher, 2: Intern): ");
        int employeeType = scanner.nextInt();
        scanner.nextLine();
        return employeeType;
    }
}
