package com.epam.training.student_Gagik_Hovhannisyan.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int numberOfPiecesPerPizza = scanner.nextInt();
        int numberOfPizza;

        for (numberOfPizza = 1; ; numberOfPizza++) {
            if ((numberOfPizza*numberOfPiecesPerPizza)%numberOfPeople == 0) {
                break;
            }
        }
        System.out.println(numberOfPizza);



    }
}
