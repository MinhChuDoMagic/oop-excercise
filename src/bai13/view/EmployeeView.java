package bai13.view;

import bai13.model.Employee;

import java.util.List;

public class EmployeeView {
    public void displayEmployeeInfo(Employee employee) {
        employee.showInfo();
    }

    public void displayEmployeesInfo(List<Employee> employee){
        employee.forEach(this::displayEmployeeInfo);
    }
}
