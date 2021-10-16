package day3.interfejs4;

public class Student implements Comparable{

    private String name;
    private String surname;
    private int indexNumber;

    public Student(String name, String surname, int indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student)o;
        return Integer.compare(this.indexNumber, other.indexNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", indexNumber=" + indexNumber +
                '}';
    }
}
