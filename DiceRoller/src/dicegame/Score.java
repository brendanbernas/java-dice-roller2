package dicegame;

public class Score {
	private int scoreAmount;

	public Score() {
		//when we instantiate score will default to 0
		scoreAmount = 0;
	}
	
	public int getScoreAmount() {
		return scoreAmount;
	}

	public void setScoreAmount(int scoreAmount) {
		this.scoreAmount = scoreAmount;
	}
	
	//adds amountToAdd to scoreAmount
	public void addScore(int amountToAdd) {
		this.scoreAmount += amountToAdd;
	}
}
