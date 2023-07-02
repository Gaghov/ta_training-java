package com.epam.training.student_Gagik_Hovhannisyan.meetautocode;

import java.util.Scanner;

public class ElectronicWatch { // 1:01:40
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hour = (seconds/3600)%24;
        int minutes = ((seconds - (hour*3600))/60)%60 ;
        int secondss = (seconds - (hour*3600 + minutes*60))%60;
        String hh = String.format("%2d", hour);
        String mm = String.format("%02d", minutes);
        String ss = String.format("%02d", secondss);

        System.out.println(hh + ":" + mm + ":" + ss);
    }
}
