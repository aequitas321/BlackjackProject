package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

import static com.skilldistillery.blackjack.Rank.ACE;

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
        for (Card card : hand) {
            if (card.getRank().equals(ACE) && value > 21) {
                value -= 10;
            }
        }
        return value;
    }

}
