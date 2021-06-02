package org.redarolla;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

public class Hand {

    private Set<Card> handCards;

    public Hand(Set<Card> handCards) {
        this.handCards = handCards;
    }


    public String evaluate() {
        String[] cardValues = this.handCards.stream()
                .map(Card::getValue)
                .toArray(String[]::new);

        var cardMaxValue = 0;

        Optional<Integer> cardMaxValueOpt = Arrays
                .stream(cardValues)
                .map(Integer::parseInt)
                .max(Integer::compare);

        if(cardMaxValueOpt.isPresent()){
            cardMaxValue = cardMaxValueOpt.get();
        }

        return ""+cardMaxValue;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handCards=" + handCards +
                '}';
    }
}
