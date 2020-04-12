package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
    protected ArrayList<Card> hand = new ArrayList<>();

    //Constructor
    public Hand() {

    }

    //Methods
    abstract int getHandValue();

    //      USED TO CLEAR EACH HAND AFTER EVERY ROUND
    public void clearHand(){
        hand.removeAll(getHand());
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "hand=" + hand +
                '}';
    }


}

