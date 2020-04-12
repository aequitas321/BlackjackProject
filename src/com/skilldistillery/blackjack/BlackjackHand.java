package com.skilldistillery.blackjack;

import java.util.List;

public class BlackjackHand extends Hand {

    public BlackjackHand() {

    }

    public boolean isBlackjack() {
        return getHandValue() == 21;
    }

    public boolean isBust() {
        return getHandValue() > 21;
    }

    public List<Card> getHand() {
        return hand;
    }


    @Override
    int getHandValue() {
        int value = 0;
        for (Card card : hand) {
            value += card.getValue();
        }
        return value;
    }
}
