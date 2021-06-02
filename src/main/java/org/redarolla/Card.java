package org.redarolla;

public class Card {

    private char suit;
    private Value value;

    public Card(Value value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public char getSuit() {
        return suit;
    }


}
