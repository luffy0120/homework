package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        int ticket = 0;
        Scanner scanner = new Scanner(System.in);



        int goBackTicket =0;

        float total = 0;


        while (ticket!=-1){

            System.out.println("Please enter number of tickets:");
            ticket = scanner.nextInt();
            if(ticket==-1){
                return ;
            }
            System.out.println("How many round-trip tickets: :");
            goBackTicket = scanner.nextInt();
            total = ticket*1000 + goBackTicket*2000*0.9f;
            Train train = new Train(ticket,goBackTicket,total);
            train.print();
        }



    }
}
