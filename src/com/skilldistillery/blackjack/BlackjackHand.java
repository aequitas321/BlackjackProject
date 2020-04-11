package com.skilldistillery.blackjack;

public class BlackjackHand extends Hand {

    public BlackjackHand(){

    }

    public boolean isBlackjack(){
        return getHandValue() == 21;
    }

    public boolean isBust(){
        return getHandValue() > 21;
    }

    @Override
    int getHandValue() {
        int value = 0;
        for (Card card: hand) {
            value += card.getValue();
        }
        return value;
    }
}
