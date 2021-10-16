package day3.interfejs5;

public interface Cooling {

    double getTemperature();
    void decreaseTemperature();
    default void showActualTemperature(double temperature) {
        System.out.println("Aktualna temperatura w pomieszczeniu wynosi " + temperature + " stopni Celsjusza");
    }
}
