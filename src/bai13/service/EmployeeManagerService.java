package bai13.service;

import bai13.model.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerService {
    private List<Employee> employees;

    public EmployeeManagerService() {
        this.employees = new ArrayList<>();
    }

    public void insert(Employee employee) {
        this.employees.add(employee);
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
}
