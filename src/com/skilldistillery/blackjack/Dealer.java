package com.skilldistillery.blackjack;

import java.util.Objects;

public class Dealer {
    private BlackjackHand dealerHand;
    private Deck deck;

//      CONSTRUCTOR
    public Dealer() {
        dealerHand = new BlackjackHand();
    }


//      DEALER METHODS
    public void deal(Hand hand) {
        hand.addCard(deck.dealCard());
    }


    public void displayDealerHand() {
        System.out.println("Dealer face up card " + getHand().getHand().get(1));

    }


    public Deck getDeck() {
        deck = new Deck();
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
