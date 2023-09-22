package org.example;

public class SnookerPlayer implements Comparable<SnookerPlayer> {

    private String name;
    private String nationality;
    private double prizeMoneyWon; // allows decimal places
    private int numberOfGamesPlayed;
    private int numberOfGamesWon;


    public int compareTo(SnookerPlayer other) {
        if(this.prizeMoneyWon<other.prizeMoneyWon)
            return -1;
        else if(this.prizeMoneyWon>other.prizeMoneyWon)
            return 1;

        return 0;
    }

    public void increasePrizeMoneyWon( double amount ) {
        prizeMoneyWon=prizeMoneyWon+amount;
    }

    public void updatePerformance( boolean won) {
        numberOfGamesPlayed ++;

        if(won==true)
            numberOfGamesWon++;
    }







    public SnookerPlayer(String name, String nationality,
                         double prizeMoneyWon,
                         int numberOfGamesPlayed,
                         int numberOfGamesWon) {
        this.name = name;
        this.nationality = nationality;
        this.prizeMoneyWon = prizeMoneyWon;
        this.numberOfGamesPlayed = numberOfGamesPlayed;
        this.numberOfGamesWon = numberOfGamesWon;
    }

    @Override
    public String toString() {
        return "SnookerPlayer{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", prizeMoneyWon=" + prizeMoneyWon +
                ", numberOfGamesPlayed=" + numberOfGamesPlayed +
                ", numberOfGamesWon=" + numberOfGamesWon +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getPrizeMoneyWon() {
        return prizeMoneyWon;
    }

    public void setPrizeMoneyWon(double prizeMoneyWon) {
        this.prizeMoneyWon = prizeMoneyWon;
    }

    public int getNumberOfGamesPlayed() {
        return numberOfGamesPlayed;
    }

    public void setNumberOfGamesPlayed(int numberOfGamesPlayed) {
        this.numberOfGamesPlayed = numberOfGamesPlayed;
    }

    public int getNumberOfGamesWon() {
        return numberOfGamesWon;
    }

    public void setNumberOfGamesWon(int numberOfGamesWon) {
        this.numberOfGamesWon = numberOfGamesWon;
    }
}
