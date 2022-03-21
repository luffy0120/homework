package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        System.out.println("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        int ticket = scanner.nextInt();

        System.out.println("How many round-trip tickets: :");
        int goBackTicket = scanner.nextInt();

        float total = ticket*1000 + goBackTicket*2000*0.9f;

            Train train = new Train(ticket,goBackTicket,total);
            train.print();
    }
}
