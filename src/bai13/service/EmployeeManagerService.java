package bai13.service;

import bai13.entity.Employee;
import bai13.entity.Experience;
import bai13.entity.Fresher;
import bai13.entity.Intern;

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
                    if (type == 0) {
                        return employee instanceof Experience;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
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
