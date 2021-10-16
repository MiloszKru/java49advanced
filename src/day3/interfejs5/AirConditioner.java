package day3.interfejs5;

import java.util.Random;

public class AirConditioner implements Cooling, Heating {

    double temperature;

    public AirConditioner(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void increaseTemperature() {
        Random random = new Random();
        double randomTemp = random.nextInt(20);
        System.out.println("Temperatura wzrosła do: " + (temperature + randomTemp) + " stopni");

    }

    @Override
    public void decreaseTemperature() {
        Random random = new Random();
        double randomTemp = random.nextInt(20);
        System.out.println("Temperatura została zmniejszona do: " + (temperature - randomTemp) + " stopni");
    }

    @Override
    public void showActualTemperature(double temperature) {
        System.out.println("Aktualna temperatura w pomieszczeniu wynosi " + temperature + " stopni Celsjusza");

    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "temperature=" + temperature +
                '}';
    }
}
