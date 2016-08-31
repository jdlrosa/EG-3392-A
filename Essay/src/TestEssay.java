/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 2 Test
 */

import java.util.Scanner;

public class TestEssay {

	public static void main(String[] args) {
		
		int grammarTotal;
		int spellingTotal;
		int contentTotal;
		double total;
		
		Scanner KB = new Scanner(System.in);
		
		System.out.println("Please enter points earned in grammar: ");
		grammarTotal = KB.nextInt();
		System.out.println("Please enter points earned in spelling: ");
		spellingTotal = KB.nextInt();
		System.out.println("Please enter points earned in content: ");
		contentTotal = KB.nextInt();
		
		total = (grammarTotal+ spellingTotal +contentTotal);
		
		Essay A = new Essay(grammarTotal, spellingTotal, contentTotal, total);
		
		System.out.println(A.toString());
		
		KB.close();

	}

}
