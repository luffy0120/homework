package com.train;

public class Train {

    int ticket;
    int goBack_ticket;
    float total;


    public Train(int ticket, int goBackTicket, float total) {
            this.ticket = ticket;
            this.goBack_ticket = goBackTicket;
            this.total = total;
    }

    public void print(){
        System.out.println("Total tickets:" + ticket);
        System.out.println("Round-trip:" + goBack_ticket);
        System.out.println("Total:" + total);
    }




}
