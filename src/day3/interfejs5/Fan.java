package day3.interfejs5;

import java.util.Random;

public class Fan implements Cooling {

    double temperature;

    public Fan(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void decreaseTemperature() {
        Random random = new Random();
        double randomTemp = random.nextInt(20);
        System.out.println("Temperatura została zmniejszona do: " + (temperature - randomTemp) + " stopni");
    }


    @Override
    public String toString() {
        return "Fan{" +
                "temperature=" + temperature +
                '}';
    }
}
