package org.redarolla;

import java.util.Arrays;

public enum Value {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);


    private int numValue;

    Value(int numValue){
        this.numValue = numValue;
    }

    public int getNumValue(){
        return this.numValue;
    }

    public static Value getEnum(int numValue){
        return Arrays
                .stream(values())
                .filter(value -> value.numValue == numValue)
                .findFirst()
                .orElse(null);
    }
}
