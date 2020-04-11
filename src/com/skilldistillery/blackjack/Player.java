package com.skilldistillery.blackjack;

import java.util.Objects;

public class Player {
    BlackjackHand hand;

    public Player(){
        hand = new BlackjackHand();
    }

    public BlackjackHand getHand() {
        return hand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(hand, player.hand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hand);
    }

    public void setHand(BlackjackHand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Player{" +
                "hand=" + hand +
                '}';
    }
}
