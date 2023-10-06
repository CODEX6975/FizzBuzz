package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Snooker Tournament System");

        SnookerPlayer player1 = new SnookerPlayer("Tom","Irish",50000.0,0,0);
        SnookerPlayer player2 = new SnookerPlayer("Mary","Finnish",2000.0,0,0);

        player1.increasePrizeMoneyWon(10.00);
        System.out.println( player1.toString() );

        ArrayList<SnookerPlayer> list = new ArrayList<>();
        list.add(player1);
        list.add(player2);

        Tournament tournament1 =
                new Tournament("PGA",30000.00, list);
        

        tournament1.printInOrderOfTotalPrizeMoney();

        tournament1.increaseAll(5000.00);

        System.out.println(tournament1);

    }
}