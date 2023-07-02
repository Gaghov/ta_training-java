package com.epam.training.student_Gagik_Hovhannisyan.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        int days = 0;
        int sum = 0;

        if (a>b || a>=h) {
            do {
                days++;
                sum = sum + a;
                if (sum>= h) {
                    break;
                }

                sum -= b;
            }
            while (sum < h);
            System.out.println(days);
        }
        else {
            System.out.println("Impossible");
        }

    }
}
