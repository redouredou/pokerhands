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
                                new Card(Value.TWO,'H'),
                                new Card(Value.THREE,'D'),
                                new Card(Value.FOUR,'S'),
                                new Card(Value.FIVE,'C'),
                                new Card(Value.NINE,'D')))), "9"
                ),
                Arguments.of(
                        new Hand(new HashSet<>(Arrays.asList(
                                new Card(Value.TWO,'H'),
                                new Card(Value.THREE,'D'),
                                new Card(Value.FIVE,'S'),
                                new Card(Value.SIX,'C'),
                                new Card(Value.FOUR,'D')))), "6"
                ),
                Arguments.of(
                        new Hand(new HashSet<>(Arrays.asList(
                                new Card(Value.TWO,'H'),
                                new Card(Value.THREE,'D'),
                                new Card(Value.FIVE,'S'),
                                new Card(Value.SIX,'C'),
                                new Card(Value.TEN,'D')))), "T"
                ),
                Arguments.of(
                        new Hand(new HashSet<>(Arrays.asList(
                                new Card(Value.QUEEN,'H'),
                                new Card(Value.TEN,'D'),
                                new Card(Value.ACE,'S'),
                                new Card(Value.KING,'C'),
                                new Card(Value.JACK,'D')))), "A"
                )
        );
    }

}
