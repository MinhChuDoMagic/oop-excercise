package bai14.service;

import bai14.entity.GoodStudent;
import bai14.entity.NormalStudent;
import bai14.entity.Student;

import java.util.*;

public class FindStudentService {
    List<GoodStudent> goodStudents;
    List<NormalStudent> normalStudents;

    public FindStudentService(List<GoodStudent> goodStudents, List<NormalStudent> normalStudents) {
        goodStudents.sort(Student.customComparator);
        normalStudents.sort(Student.customComparator);
        this.goodStudents = goodStudents;
        this.normalStudents = normalStudents;
    }

    public void findStudent(int numOfHires){
        List<GoodStudent> hiredGoodStudents = new ArrayList<>();
        List<NormalStudent> hiredNormalStudents = new ArrayList();

        if (goodStudents.size() > numOfHires) {
            Collections.sort(goodStudents, (s1, s2) -> {
                if (s1.getGpa() == s2.getGpa()) {
                    return s1.getFullName().compareTo(s2.getFullName());
                }
                return Double.compare(s2.getGpa(), s1.getGpa());
            });
            hiredGoodStudents.addAll(goodStudents.subList(0, numOfHires));
        } else {
            hiredGoodStudents.addAll(goodStudents);
        }

        numOfHires -= hiredGoodStudents.size();

        if (normalStudents.size() > numOfHires) {
            Collections.sort(normalStudents, (s1, s2) -> {
                if (s1.getEntryTestScore() == s2.getEntryTestScore()) {
                    if (s1.getEnglishScore() == s2.getEnglishScore()) {
                        return s1.getFullName().compareTo(s2.getFullName());
                    }
                    return Integer.compare(s2.getEnglishScore(), s1.getEnglishScore());
                }
                return Integer.compare(s2.getEntryTestScore(), s1.getEntryTestScore());
            });
            hiredNormalStudents.addAll(normalStudents.subList(0, numOfHires));
        } else {
            hiredNormalStudents.addAll(normalStudents);
        }

        System.out.println("Hired Good Students:");
        for (GoodStudent student : hiredGoodStudents) {
            student.showMyInfo();
        }

        System.out.println("\nHired Normal Students:");
        for (NormalStudent student : hiredNormalStudents) {
            student.showMyInfo();
        }
    }
}
