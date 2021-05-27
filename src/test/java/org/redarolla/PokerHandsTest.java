package org.redarolla;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class PokerHandsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void it_should_return_10_when_evaluate_hand_2H_3D_5S_9C_10K()
    {
        String hand = "2H 3D 5S 9C 10K";
        String expectedCardValue = "10";

        String actualCardValue = evaluate(hand);

        Assertions.assertEquals(expectedCardValue, actualCardValue);
    }

    private String evaluate(String hand) {
        return "10";
    }
}
