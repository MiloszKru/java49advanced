package day3.interfejs4;

import java.util.Arrays;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student("Mil","Kru", 1112);
        Student student2 = new Student("Bla","Dre", 1452);
        Student student3 = new Student("Bul","Man", 1234);

        Student[] students = new Student[] {student1, student2, student3};
        for (Student student : students) {
            System.out.println(student);
            
        }
        System.out.println("##############");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
