package advanced.homework.person;

public class PersonMain {

    public static void main(String[] args) {

        Student studentOne = new Student("Milosz", "Kruszewski","Stacjonarne",3,5000);
        Lecturer lecturerOne = new Lecturer("Economy", 7500);

        System.out.println(studentOne);
        System.out.println(lecturerOne);

        studentOne.setStudiesCost(2137);
        lecturerOne.setSpecialization("Programming");

        System.out.println(studentOne);
        System.out.println(lecturerOne);
    }
}
