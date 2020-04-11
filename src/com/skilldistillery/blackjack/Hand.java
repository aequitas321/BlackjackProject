package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
    protected ArrayList<Card> hand = new ArrayList<>();

    //Constructor
   public Hand() {

    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    //Methods
    public void addCard(Card card){
        hand.add(card);
   }

    abstract int getHandValue();


    @Override
    public String toString() {
        return "Hand{" +
                "hand=" + hand +
                '}';
    }


}

