package com.skilldistillery.blackjack;

import java.util.List;

public abstract class Hand {
    protected List<Card> hand;

    //Constructor
   public Hand() {

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

