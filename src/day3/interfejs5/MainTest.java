package day3.interfejs5;

public class MainTest {

    public static void main(String[] args) {

        Cooling fan1 = new Fan(20);
        Heating heater1 = new Heater(15);
        AirConditioner airConditioner1 = new AirConditioner(18);

        fan1.decreaseTemperature();
        heater1.increaseTemperature();
        airConditioner1.decreaseTemperature();
        airConditioner1.increaseTemperature();
    }
}
