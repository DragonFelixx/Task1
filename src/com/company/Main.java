package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double deposit, percent, date, interestReceived, result;

        deposit = readDouble("кол-во вложенных денег:");
        percent = readDouble("процент вклада(проценты в месяц):");
        date = readDouble("срок(в месяцах):");

        interestReceived = interestReceived(percent);
        result = result(deposit, date, interestReceived);

        System.out.println("Доход = " + result);
    }

    private static double interestReceived(double percent) {
        return  1 + percent/100;
    }

    private static double result(double deposit, double date, double interestReceived) {
        return deposit * Math.pow(interestReceived, date) - deposit;
    }

    public static double readDouble(String name)
    {
        System.out.printf("Введите %s ", name);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}