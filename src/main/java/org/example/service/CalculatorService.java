package org.example.service;

import java.util.Arrays;

public class CalculatorService {
    public static double average(double... values) {
        return Arrays.stream(values).average().getAsDouble();
    }

    public static double absencesPercentage(int absences) {
        int classesPerSemester = 60;
        return (double) absences / classesPerSemester * 100;
    }

    public static double naf(double average) {
        return Math.ceil((10 - average) * 2);
    }
}
