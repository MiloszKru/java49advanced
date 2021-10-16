package day3.interfejs5;

import java.util.Random;

public class Heater implements Heating {

    double temperature;

    public Heater(double temperature) {
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
    public String toString() {
        return "Heater{" +
                "temperature=" + temperature +
                '}';
    }
}
