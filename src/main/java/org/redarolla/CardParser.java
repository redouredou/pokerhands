package org.redarolla;

import java.util.EnumMap;

public class CardParser {

    private static final EnumMap<Value,Character> VALUE_CHAR = new EnumMap<>(Value.class) {{
        put(Value.TWO, '2');
        put(Value.THREE, '3');
        put(Value.FOUR, '4');
        put(Value.FIVE, '5');
        put(Value.SIX, '6');
        put(Value.SEVEN, '7');
        put(Value.EIGHT, '8');
        put(Value.NINE, '9');
        put(Value.TEN, 'T');
        put(Value.JACK, 'J');
        put(Value.QUEEN, 'Q');
        put(Value.KING, 'K');
        put(Value.ACE, 'A');
    }};

    public static Character getCardValue(Value val){
        return VALUE_CHAR.get(val);
    }



}
