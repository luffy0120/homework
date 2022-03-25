package com.train

import java.util.Scanner


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    var ticket = 0
    var goBackTicket = 0
    var total = 0f

    while (ticket!=-1){
        println("Please enter number of tickets:")
        ticket = scanner.nextInt()
        if(ticket==-1){
            return
        }
        println("How many round-trip tickets: :")
        goBackTicket = scanner.nextInt()
        total = ticket*1000 + goBackTicket*2000*0.9f
        val t = Trains(ticket, goBackTicket, total)
        t.count()
    }


}

    class Trains(var ticket:Int, var goBackTicket:Int, var total:Float){
        fun count(){
            this.total = total
            println("Total tickets: $ticket" )
            println("Round-trip: $goBackTicket")
            println("Total: $total")
        }
    }