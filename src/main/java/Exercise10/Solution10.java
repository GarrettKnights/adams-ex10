/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Garrett Adams
 */


package Exercise10;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {

        Scanner ScanWord = new Scanner(System.in);

        int p1;
        int q1;
        int p2;
        int q2;
        int p3;
        int q3;
        double ob1;
        double ob2;
        double ob3;
        double subtotal;
        double tax;
        double total;
        double taxrate = 0.055;

        //Asks user for input
        System.out.print("Enter the price of item 1: ");
        //Scans peeps input
        p1 = ScanWord.nextInt();
        //Asks user for input
        System.out.print("Enter the quantity for item 1: ");
        //Scans pizzanum input
        q1 = ScanWord.nextInt();
        //Asks user for input
        System.out.print("Enter the price of item 2: ");
        //Scans slices input
        p2 = ScanWord.nextInt();
        //Asks user for input
        System.out.print("Enter the quantity for item 2: ");
        //Scans slices input
        q2 = ScanWord.nextInt();
        //Asks user for input
        System.out.print("Enter the price of item 3: ");
        //Scans slices input
        p3 = ScanWord.nextInt();
        //Asks user for input
        System.out.print("Enter the quantity for item 3: ");
        //Scans slices input
        q3 = ScanWord.nextInt();

        ob1 = p1 * q1;
        ob2 = p2 * q2;
        ob3 = p3 * q3;

        subtotal = ob1 + ob2 + ob3;
        tax = subtotal * taxrate;
        total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);

    }
}
