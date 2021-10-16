package day3.typy_generyczne;

public class GarageMain {

    public static void main(String[] args) {

        Car one = new BMW("X", "Red");
        Car two = new Porsche("Cayenne", "Black");


        Garage<Car> carGarage = new Garage<>(one, two);

        System.out.println(carGarage.getTheCarOut(one));
        System.out.println(carGarage.getTheCarOut(one));

    }
}
