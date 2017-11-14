package driver;

import java.util.Scanner;

import dicegame.DiceRoller;
import dicegame.Score;

public class PlayDice {
	public static void main(String[] args)
	{
		//getting objects that we will be using for this program
		DiceRoller dice = new DiceRoller(); //using this to roll
		Scanner input = new Scanner(System.in);
		Score compScore = new Score(); //using this to keep opponent score
		Score userScore = new Score(); //using this to keep user score
		boolean contFlag = true;
		do {
			//roll the dice
			int compRoll = dice.rollDice(6);
			int userRoll = dice.rollDice(6);
			//show the rolls in the console
			System.out.println("Opponent roll: \t" + compRoll);
			System.out.println("Your roll: \t" + userRoll);
			
			//output win/lose/draw
			if(userRoll > compRoll)
			{
				System.out.println("You win!");
				userScore.addScore(1);
			}	
			else if(compRoll > userRoll)
			{
				System.out.println("You lose!");
				compScore.addScore(1);
			}
			else
			{
				System.out.println("Draw!");
				//no score to add, it is a tie
			}
				
			//output score
			System.out.println("Opponent score:  \t" + compScore.getScoreAmount());	
			System.out.println("User score:  \t\t" + userScore.getScoreAmount());
			
			System.out.println("\nEnter \"y\" to roll again. Enter anything else to quit");
			
			//if user inputs anything other then "y" contFlag will be false and program will end
			if(!input.next().equals("y"))
				contFlag = false;
			
		}while(contFlag);
		//executed once the loop is exited
		System.out.println("Thank you for playing, bye!");
	}
}
