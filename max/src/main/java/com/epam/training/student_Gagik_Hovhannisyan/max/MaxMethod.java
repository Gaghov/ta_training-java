package com.epam.training.student_Gagik_Hovhannisyan.max;

public class MaxMethod {
    public static int max(int[] values) {
        int output = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > output) {
                output = values[i];
            }
        }
        return output;
    }
}
