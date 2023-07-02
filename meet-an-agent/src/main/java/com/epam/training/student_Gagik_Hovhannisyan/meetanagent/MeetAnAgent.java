package com.epam.training.student_Gagik_Hovhannisyan.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if (inputNumber == PASSWORD) {
            System.out.println("Hello, Agent");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
