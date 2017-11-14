package dicegame;

public class DiceRoller {
	//will return an integer from 1 to diceSize
	public int rollDice(int diceSize)
	{
		return (int) (Math.random() * diceSize) + 1;
	}
	
	public int[] rollDice(int diceSize, int rollTimes)
	{
		//create empty array with 'rollTimes' size
		int[] out = new int[rollTimes];
		//will loop 'diceSize' times
		for(int i = 0; i < rollTimes; i++)
		{
			//add the roll to the array
			out[i] = this.rollDice(diceSize);
		}
		return out;
	}
}
