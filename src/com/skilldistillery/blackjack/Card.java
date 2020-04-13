package com.skilldistillery.blackjack;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getValue() {
        return rank.getValue();
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rank == null) ? 0 : rank.hashCode());
        result = prime * result + ((suit == null) ? 0 : suit.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (rank != other.rank)
            return false;
        if (suit != other.suit)
            return false;
        return true;
    }


    @Override
    public String toString() {
        System.out.println("----------------");
        System.out.println(" \t" + rank + " ");
        System.out.println("      OF         ");
        System.out.println(" \t" + suit +" ");
        System.out.println("                 ");
        System.out.println("----------------");
        return "|" + rank + " of " + suit + "|";
    }

}
