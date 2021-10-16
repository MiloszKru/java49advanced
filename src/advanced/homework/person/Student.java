package advanced.homework.person;

public class Student extends Person {

    private String studiesType;
    private int studiesYear;
    private double studiesCost;


    public Student(String name, String address, String studiesType, int studiesYear, double studiesCost) {
        super(name, address);
        this.studiesType = studiesType;
        this.studiesYear = studiesYear;
        this.studiesCost = studiesCost;
    }


    public String getStudiesType() {
        return studiesType;
    }

    public void setStudiesType(String studiesType) {
        this.studiesType = studiesType;
    }

    public int getStudiesYear() {
        return studiesYear;
    }

    public void setStudiesYear(int studyYear) {
        this.studiesYear = studyYear;
    }

    public double getStudiesCost() {
        return studiesCost;
    }

    public void setStudiesCost(double studyCost) {
        this.studiesCost = studyCost;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                "studiesType='" + studiesType + '\'' +
                ", studiesYear=" + studiesYear +
                ", studiesCost=" + studiesCost +
                '}';
    }
}
