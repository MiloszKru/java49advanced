package day2.service;

import day2.model.Figure;

public class PaintSimulator {

    public static double calculatePaintDemand(double canCapacity, Figure[] figures) {

        double currentSum = 0;
        for (Figure figure : figures) {
            currentSum += figure.calculateSurface();
        }
        return Math.ceil(currentSum / canCapacity);
    }
}
