package org.redarolla;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class PokerHandsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void it_should_return_10_when_evaluate_hand_2H_3D_5S_9C_10D()
    {
        String hand = "2H 3D 5S 9C 10D";
        String expectedCardValue = "10";

        String actualCardValue = evaluate(hand);

        Assertions.assertEquals(expectedCardValue, actualCardValue);
    }

    @Test
    public void it_should_return_9_when_evaluate_hand_2H_3D_5S_9C_4D()
    {
        String hand = "2H 3D 5S 9C 4D";
        String expectedCardValue = "9";

        String actualCardValue = evaluate(hand);

        Assertions.assertEquals(expectedCardValue, actualCardValue);
    }

    @Test
    public void it_should_return_6_when_evaluate_hand_2H_3D_5S_6C_4D()
    {
        String hand = "2H 3D 5S 6C 4D";
        String expectedCardValue = "6";

        String actualCardValue = evaluate(hand);

        Assertions.assertEquals(expectedCardValue, actualCardValue);
    }

    private String evaluate(String hand) {
        String[] cards = hand.split(" ");
        String[] cardValues = Arrays
                .stream(cards)
                .map(card -> card.replaceAll("\\D+",""))
                .toArray(String[]::new);
        int cardMaxValue = Arrays.stream(cardValues).map(Integer::parseInt).max(Integer::compare).get();

        return ""+cardMaxValue;
    }
}
