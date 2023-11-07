package bai13;

import bai13.controller.EmployeeController;
import bai13.exception.BirthDayException;
import bai13.exception.EmailException;
import bai13.exception.FullNameException;
import bai13.exception.PhoneException;

public class Main {
    public static void main(String[] args) throws PhoneException, FullNameException, EmailException, BirthDayException {
        EmployeeController controller = new EmployeeController();
        controller.display();
    }
}