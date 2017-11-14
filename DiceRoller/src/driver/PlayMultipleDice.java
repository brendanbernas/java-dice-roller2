package driver;

import dicegame.DiceRoller;

public class PlayMultipleDice {

	public static void main(String[] args) {
		//get DiceRoller object
		DiceRoller dice = new DiceRoller();
		
		final int DICE_SIZE = 6;
		final int ROLL_TIMES = 20;
		
		//roll a die with 6 sides, 20 times
		int[] rolls = dice.rollDice(DICE_SIZE, ROLL_TIMES);
		
		//an array with size of 6
		int[] formattedRolls = new int[DICE_SIZE];
		
		for(int i: rolls){
			//add + 1 for the corresponding index of formattedRolls
			//must subtract 1 from i due to 0 based indexing in arrays
			formattedRolls[i - 1] = formattedRolls[i - 1] + 1;
		}
		
		System.out.println("Dice of " + DICE_SIZE + " sides, rolled " + ROLL_TIMES + " times:");
		System.out.print("Dice sides:\t");
		for(int i = 1; i <= DICE_SIZE; i++) {
			System.out.print(i + "\t");
		}
		System.out.print("\nRoll amount:\t");
		
		for(int i: formattedRolls){
			System.out.print(i + "\t");
		}
	}

}
