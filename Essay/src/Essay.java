/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 2 Essay
 */

public class Essay extends GradedActivity {

	private final int grammar = 25;
	private final int spelling = 35;
	private final int content = 40;
	

	private int grammarGrade;
	private int spellingGrade;
	private int contentGrade;
	
	public Essay() {
		super();
	}

	public Essay(int grammarGrade, int spellingGrade, int contentGrade, double score) {
		super(score);
		this.grammarGrade = grammarGrade;
		this.spellingGrade = spellingGrade;
		this.contentGrade = contentGrade;
		
		if(grammarGrade > grammar){
			System.out.println("Warning: invalid point number for current section");
			this.grammarGrade = 0;
			setScore(score - grammarGrade);
		}
		
		if(spellingGrade > spelling){
			System.out.println("Warning: invalid point number for current section");
			this.spellingGrade = 0;
			setScore(score - spellingGrade);
		}
		
		if(contentGrade > content){
			System.out.println("Warning: invalid point number for current section");
			this.contentGrade = 0;
			setScore(score - contentGrade);
		}
		
	}
	
	
	public int getGrammarGrade() {
		return grammarGrade;
	}

	public void setGrammarGrade(int grammarGrade) {
		this.grammarGrade = grammarGrade;
	}

	public int getSpellingGrade() {
		return spellingGrade;
	}

	public void setSpellingGrade(int spellingGrade) {
		this.spellingGrade = spellingGrade;
	}

	public int getContentGrade() {
		return contentGrade;
	}

	public void setContentGrade(int contentGrade) {
		this.contentGrade = contentGrade;
	}
	
	
	public String toString() {
	       return "Grammer: " + getGrammarGrade() + " Spelling:  " + getSpellingGrade() + " Content: " + getContentGrade()
	       + "\nTotal Score: " + getScore() + " Grade: " + getGrade();
	   }
}