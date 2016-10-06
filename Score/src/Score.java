/*
 * Julian De La Rosa
 * EG3392
 * Assignment 6 Score
 */
public class Score {

	private int[] scores;
	private int average;

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public Score(int[] testScore) throws IllegalArgumentException {
		setAverage(rightScore(testScore));
		setScores(testScore);
	}

	private int rightScore(int[] testScore) {
		int avg = 0;
		for (int i = 0; i < testScore.length; i++) {
			if (testScore[i] < 0 || testScore[i] > 100)
				throw new IllegalArgumentException("Score for test " + (i + 1)
				+ " is out of range.\nNumber cannot be less than 0 and greater than 100");
			avg += testScore[i];
		}
		return(avg / testScore.length);
	}
	
	public int getAvg(){
		return average;
	}
}