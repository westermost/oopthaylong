package oopthaylong.Tuan1.Nhi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListStudent {
    private ArrayList<Student> students;
    private int totalStudent;

    public void createList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("No of students");
        int total = scanner.nextInt();
        
        for (int i = 0; i < total; i++) {
            Student student = new Student();
            student.inputStudentInfo();
            students.add(student);
            totalStudent ++;
        }
    }

    public void rankingStudent() {
        for (Student student : students) {
            student.rankingStudent();
        }
    }

    public void outputStudentsInfo() {
        for (Student student : students) {
            student.outputStudentInfo();
        }
    }

    public void sortLstStudent() {
        Collections.sort(students);
    }
}
