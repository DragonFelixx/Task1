package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double deposit = readDouble("кол-во вложенных денег:");
        double percent = readDouble("процент вклада(проценты в месяц):");
        double date = readDouble("срок(в месяцах):");

        double interestReceived = FindinterestReceived(percent);
        double result = FindEarning(deposit, date, interestReceived);

        System.out.println("Доход = " + result);
    }

    private static double FindinterestReceived(double percent) {
        return  1 + percent/100;
    }

    private static double FindEarning(double deposit, double date, double interestReceived) {
        return deposit * Math.pow(interestReceived, date) - deposit;
    }

    public static double readDouble(String name)
    {
        System.out.printf("Введите %s ", name);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}