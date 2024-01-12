package ca.tetervak.diceroller.domain;

import java.util.ArrayList;
import java.util.List;

public class DiceRollerService {

    private final Rollable rollable;

    public DiceRollerService(Rollable rollable) {
        this.rollable = rollable;
    }

    public DiceRollData getRollData(int numberOfDice) {

        if(numberOfDice < 1){
            throw new IllegalArgumentException("Illegal Number of Dice " + numberOfDice);
        }

        List<Integer> list = new ArrayList<>(numberOfDice);
        for(int i = 0; i < numberOfDice; i++){
            list.add(rollable.roll());
        }

        return new DiceRollData(list);
    }
}
