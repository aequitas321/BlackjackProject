package com.skilldistillery.blackjack;

import java.util.Objects;

public class Dealer{
    private BlackjackHand hand;
    private Deck deck;


    public Dealer() {
        deck = new Deck();
        hand = new BlackjackHand();
    }

    public void deal(){
        hand.addCard(deck.dealCard());
        hand.addCard(deck.dealCard());
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dealer dealer = (Dealer) o;
        return Objects.equals(deck, dealer.deck) &&
                Objects.equals(hand, dealer.hand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deck, hand);
    }

    public BlackjackHand getHand() {
        return hand;
    }

    public void setHand(BlackjackHand hand) {
        this.hand = hand;
    }


}
