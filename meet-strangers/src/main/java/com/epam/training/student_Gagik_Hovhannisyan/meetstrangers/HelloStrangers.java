package com.epam.training.student_Gagik_Hovhannisyan.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int numOfStrangers = scanner.nextInt();
    if(numOfStrangers>0) {
        String[] strangers = new String[numOfStrangers];
        for (int i = 0; i<numOfStrangers; i++) {
            Scanner newScanner = new Scanner(System.in);
            String nameOfStrangers = newScanner.nextLine();
            strangers[i] = nameOfStrangers;
        }
        for (int j = 0; j<numOfStrangers; j++) {
            System.out.println("Hello, " + strangers[j]);
        }
    }
    else if(numOfStrangers == 0) {
        System.out.println("Oh, it looks like there is no one here");
    }
    else {
        System.out.println("Seriously? Why so negative?");
    }

    }
}
