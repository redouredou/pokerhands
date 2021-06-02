package org.redarolla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

class PokerHandsTest
{

    @ParameterizedTest(name = " it should return the highest value {1} with the Hand {0} ")
    @MethodSource("provideHandsCard")
    void it_should_return_card_with_highest_value(Hand hand, String expectedValue){

        String actualValue = hand.evaluate();

        Assertions.assertEquals(expectedValue, actualValue);
    }

    public static Stream<Arguments> provideHandsCard(){
        return Stream.of(
                Arguments.of(
                        new Hand(new HashSet<>(Arrays.asList(
                                new Card("2","H"),
                                new Card("3","D"),
                                new Card("5","S"),
                                new Card("9","C"),
                                new Card("4","D")))), "9"
                ),
                Arguments.of(
                        new Hand(new HashSet<>(Arrays.asList(
                                new Card("2","H"),
                                new Card("3","D"),
                                new Card("5","S"),
                                new Card("9","C"),
                                new Card("10","D")))), "10"
                ),
                Arguments.of(
                        new Hand(new HashSet<>(Arrays.asList(
                                new Card("2","H"),
                                new Card("3","D"),
                                new Card("5","S"),
                                new Card("6","C"),
                                new Card("4","D")))), "6"
                )
        );
    }

}
