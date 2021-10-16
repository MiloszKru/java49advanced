package day3.typy_generyczne;

public class Garage <T> {

    protected T car1;
    protected T car2;

    public Garage(T car1, T car2) {
        this.car1 = car1;
        this.car2 = car2;
    }

    public void parkTheCar(T something){
        if (this.car1 == null) {
            this.car1 = something;
        } else if (this.car2 == null) {
            this.car2 = something;
        } else {
            System.out.println("Garage is full, can't park.");
        }
    }

    public T getTheCarOut(T sthToGetOut) {
        if (sthToGetOut != null) {
            if (sthToGetOut.equals(this.car1)) {
                T temp = this.car1;
                this.car1 = null;
                return this.car1;
            } else if (sthToGetOut.equals(this.car2)){
                this.car2 = null;
                return sthToGetOut;
            } else {
                System.out.println("No such car in garage");
            }
        } else {
            System.out.println("I don't know what you want.");
        }
        return sthToGetOut;

    }

    @Override
    public String toString() {
        return "Garage{" +
                "car1=" + car1 +
                ", car2=" + car2 +
                '}';
    }
}
