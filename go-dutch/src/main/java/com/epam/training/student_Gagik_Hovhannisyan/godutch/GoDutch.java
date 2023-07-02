package com.epam.training.student_Gagik_Hovhannisyan.godutch;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAmount = scanner.nextInt();
        int numberOfFriends = scanner.nextInt();
        int totalAmountWithTips = totalAmount + totalAmount / 10;

        if (totalAmount < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            System.out.println(totalAmountWithTips / numberOfFriends);
        }
    }
}


 class Transport {

}

abstract class Car extends Transport {

}