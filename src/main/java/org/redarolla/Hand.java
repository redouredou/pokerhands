package org.redarolla;

import java.util.Optional;
import java.util.Set;

public class Hand {

    private Set<Card> handCards;

    public Hand(Set<Card> handCards) {
        this.handCards = handCards;
    }


    public String evaluate() {

        var cardMaxValue = 0;

        Optional<Integer> cardMaxValueOpt = this.handCards.stream()
                .map(Card::getValue)
                .map(Value::getNumValue)
                .max(Integer::compare);

        if(cardMaxValueOpt.isPresent()){
            cardMaxValue = cardMaxValueOpt.get();
        }

        return ""+CardParser.getCardValue(Value.getEnum(cardMaxValue));
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handCards=" + handCards +
                '}';
    }
}
