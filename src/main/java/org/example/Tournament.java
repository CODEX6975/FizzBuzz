package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Tournament {
    private String name;
    private double totalPrizeMoney;
    private ArrayList<SnookerPlayer> players;

    public Tournament(String name, double totalPrizeMoney, ArrayList<SnookerPlayer> players) {
        this.name = name;
        this.totalPrizeMoney = totalPrizeMoney;
        this.players = players;
    }

    public void increaseAll( double amount ) {
        for( SnookerPlayer player : players) {
            player.increasePrizeMoneyWon(amount);
        }
    }

    public void printInOrderOfTotalPrizeMoney() {
        // sort the players in order in the ArrayList.
        Collections.sort(players);


        // print them out
        System.out.println( players);

    }
    @Override
    public String toString() {
        return "Tournament{" +
                "name='" + name + '\'' +
                ", totalPrizeMoney=" + totalPrizeMoney +
                ", players=" + players +
                '}';
    }
}
