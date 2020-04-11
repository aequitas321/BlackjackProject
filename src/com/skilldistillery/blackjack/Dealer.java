package com.skilldistillery.blackjack;

import java.util.Objects;

public class Dealer{
    private BlackjackHand dealerHand;
    private Deck deck;


    public Dealer() {
        deck = new Deck();
        dealerHand = new BlackjackHand();
    }

    public void deal(Hand hand){
        hand.addCard(deck.dealCard());
    }

    public void dealToPlayer(){

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
                Objects.equals(dealerHand, dealer.dealerHand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deck, dealerHand);
    }

    public BlackjackHand getHand() {
        return dealerHand;
    }



}
