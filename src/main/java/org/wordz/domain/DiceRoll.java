package org.wordz.domain;

import org.wordz.domain.domainInterfaces.RandomNumbers;

public class DiceRoll {

    private final int NUMBER_OF_SIDES = 6;
    private final RandomNumbers rand;

    public DiceRoll(RandomNumbers rand) {
        this.rand = rand;
    }

    public String asText(){
        int rolled = rand.nextInt(NUMBER_OF_SIDES) + 1;

        return String.format("YOR ROLLED IS %d", rolled);
    }
}
