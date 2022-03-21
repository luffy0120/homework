package com.train

import java.util.Scanner


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var ticket = scanner.nextInt()
    println("How many round-trip tickets: :")
    var goBackTicket = scanner.nextInt()
    var total = ticket*1000 + goBackTicket*2000*0.9f
    val t = Trains(ticket, goBackTicket, total)
    t.count()



}

    class Trains(var ticket:Int, var goBackTicket:Int, var total:Float){
        fun count(){
            this.total = total
            println("Total tickets: $ticket" )
            println("Round-trip: $goBackTicket")
            println("Total: $total")
        }
    }