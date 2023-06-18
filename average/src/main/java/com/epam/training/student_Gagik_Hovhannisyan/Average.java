package com.epam.training.student_Gagik_Hovhannisyan;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentValue;
        int averageValue;
        int sum = 0;
        int numbersAmount = 0;

        do {
            currentValue = scanner.nextInt();
            if (currentValue == 0) {
                break;
            }
            sum = sum + currentValue;
            numbersAmount++;
        }
        while (currentValue != 0);

            averageValue = sum/numbersAmount;
            System.out.println(averageValue);
        }

    }

