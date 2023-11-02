package bai14.service;

import bai14.entity.Student;
import bai14.exception.InvalidDOBException;
import bai14.exception.InvalidFullNameException;
import bai14.exception.InvalidPhoneNumberException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class ValidationService {
    public static void validateStudent(Student student) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        validateFullName(student.getFullName());
        validateDOB(student.getDoB());
        validatePhoneNumber(student.getPhoneNumber());
    }

    public static void validateFullName(String fullName) throws InvalidFullNameException {
        if (fullName.length() < 10 || fullName.length() > 50) {
            throw new InvalidFullNameException();
        }
    }

    public static void validateDOB(String dob) throws InvalidDOBException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(dob);
        } catch (ParseException e) {
            throw new InvalidDOBException();
        }
    }

    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        Pattern pattern = Pattern.compile("^(090|098|091|031|035|038)\\d{7}$");
        if (!pattern.matcher(phoneNumber).matches()) {
            throw new InvalidPhoneNumberException();
        }
    }
}
