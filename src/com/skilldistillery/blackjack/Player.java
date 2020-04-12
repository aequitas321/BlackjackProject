package com.skilldistillery.blackjack;

import java.util.Objects;

public class Player {
    private BlackjackHand playerHand;

//          CONSTRUCTOR
    public Player() {
        playerHand = new BlackjackHand();
    }

//      METHODS
    public void displayHand() {
        System.out.print("Player hand: " + getHand() + "\t");
        System.out.println("Player hand value: " + getHand().getHandValue());
    }

    public BlackjackHand getHand() {
        return playerHand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(playerHand, player.playerHand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerHand);
    }


    @Override
    public String toString() {
        return "Player{" +
                "hand=" + playerHand +
                '}';
    }
}
