/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.calculator;

import java.util.Scanner;

public class Calculator {

    private static Object num;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double first, second, total;
        int i, check;

        while (true) {

            System.out.println("Enter the first number");
            first = scanner.nextInt();
            System.out.println("Enter the second number");
            second = scanner.nextInt();

            System.out.println("*****************************");
            System.out.println("1.   Addition");
            System.out.println("2.   Subtraction");
            System.out.println("3.   Division");
            System.out.println("4.   Multiplication");
            System.out.println("*****************************");
            System.out.println("Select the above option to your desire");
            i = scanner.nextInt();

            switch (i) {
                case 1:
                    total = first + second;
                    System.out.println("The total is  " + total);
                    break;
                case 2:
                    total = first - second;
                    System.out.println("The total is  " + total);
                    break;
                case 3:
                    double division = first / second;
                    System.out.println("The total is  " + division);
                    break;
                case 4:
                    total = first * second;
                    System.out.println("The total is  " + total);
                    break;
                default:
                    System.out.println("Please re-enter the value");
                    break;

            }
            System.out.println("Do you want to exit(1 = No / 0 = Yes)");
            check = scanner.nextInt();
            if (check == 0) {
                System.exit(0);

            }
        }

    }
}
