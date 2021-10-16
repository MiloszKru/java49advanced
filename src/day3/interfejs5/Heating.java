package day3.interfejs5;

public interface Heating {

    double getTemperature();
    void increaseTemperature();
    default void showActualTemperature(double temperature) {
        System.out.println("Aktualna temperatura w pomieszczeniu wynosi " + temperature + " stopni Celsjusza");
    }
}
