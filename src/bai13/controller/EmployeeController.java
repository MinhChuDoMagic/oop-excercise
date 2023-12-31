package bai13.controller;

import bai13.exception.BirthDayException;
import bai13.exception.EmailException;
import bai13.exception.FullNameException;
import bai13.exception.PhoneException;
import bai13.model.*;
import bai13.utils.Validator;
import bai13.view.EmployeeView;
import bai13.view.MenuValue;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    private List<Employee> employees;
    private final EmployeeView view;

    public EmployeeController() {
        this.view = new EmployeeView();
        this.employees = new ArrayList<>();
    }

    public void insert(Employee employee) throws PhoneException, FullNameException, EmailException, BirthDayException {
        employeeCheck(employee);
        this.employees.add(employee);
    }

    public void update(int id, Employee updatedEmployee) throws BirthDayException, EmailException, PhoneException, FullNameException {
        employeeCheck(updatedEmployee);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.set(i, updatedEmployee);
                break;
            }
        }
    }

    public Employee findById(int id) {
        return this.employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }

    public boolean deleteById(int id) {
        Employee employee = this.findById(id);
        if (employee == null) {
            return false;
        }
        this.employees.remove(employee);
        return true;
    }
    public List<Employee> findByType(int type) {
        return this.employees.stream()
                .filter(employee -> {
                    if (type == ExperienceType.EXPERIENCE.getValue()) {
                        return employee instanceof Experience;
                    }
                    if (type == ExperienceType.FRESHER.getValue()) {
                        return employee instanceof Fresher;
                    }
                    if (type == ExperienceType.INTERN.getValue()) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .toList();
    }

    public List<Employee> findAll() {
        return this.employees;
    }

    public void employeeCheck(Employee employee) throws BirthDayException, EmailException, PhoneException, FullNameException {
        Validator.birthdayCheck(employee.getBirthday());
        Validator.emailCheck(employee.getEmail());
        Validator.phoneCheck(employee.getPhone());
        Validator.nameCheck(employee.getFullName());
    }


    public void findByTypeAndDisplay(int type){
        view.displayEmployeesInfo(findByType(type));
    }

    public void findByIdAndDisplay(int id){
        view.displayEmployeeInfo(findById(id));
    }

    public void display() throws PhoneException, FullNameException, EmailException, BirthDayException {
        while (true){
            int choice = view.menuView();
            if(choice == MenuValue.ADD.getValue()){
                Employee employee = view.addEmployeeView();
                insert(employee);
            } else if (choice == MenuValue.UPDATE.getValue()) {
                int id = view.getIdView();
                Employee employee = findById(id);
                if(employee == null){
                    view.employeeNotFoundView(id);
                }else {
                    employee = view.updateEmployee(employee);
                    update(employee.getId(), employee);
                }
            } else if (choice == MenuValue.DELETE.getValue()) {
                int id = view.getIdView();
                deleteById(id);
            } else if (choice == MenuValue.DISPLAY_ALL.getValue()) {
                view.displayEmployeesInfo(employees);
            } else if (choice == MenuValue.DISPLAY_TYPE.getValue()) {
                int type = view.employeeTypeView();
                findByTypeAndDisplay(type);
            } else if (choice == MenuValue.EXIT.getValue()) {
                System.exit(0);
            }else {
                System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
