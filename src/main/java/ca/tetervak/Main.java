package ca.tetervak;

import ca.tetervak.diceroller.domain.Dice;
import ca.tetervak.diceroller.domain.DiceRollData;
import ca.tetervak.diceroller.domain.DiceRollerService;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Hello from DiceRoller!");

        DiceRollerService service = new DiceRollerService(new Dice());
        DiceRollData rollData = service.getRollData(4);

        out.println("rollData = " + rollData);

        out.println("See you later!");
    }
}