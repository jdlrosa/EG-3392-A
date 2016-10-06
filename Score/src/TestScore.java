/*
 * Julian De La Rosa
 * EG3392
 * Assignment 6 TestScore
 */
import java.util.Scanner;
public class TestScore {

	public static void main(String[] args) throws Exception {
		
		Scanner kb = new Scanner(System.in);
		int array[] = new int[5];
		
		System.out.println("Enter the scores");
		for(int i = 0; i < 5; i++)
			array[i] = kb.nextInt();
		
		try{
			Score s = new Score(array);
			System.out.println("The average is " + s.getAvg());
		}
		
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		kb.close();

	}

}
