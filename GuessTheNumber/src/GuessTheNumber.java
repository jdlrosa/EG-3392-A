/*
 * Julian De La Rosa
 * EG 3392 A
 * Guess The Number
 */

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int input = 0;
		int counter = 0;
		int answer = (int) (1000 * Math.random());

		System.out.println("Enter a number between 1 and 1000");
		input = keyboard.nextInt();
		counter++;

		if (input != answer) {
			while (input != answer) {
				if (input < answer) {
					System.out.println("Too low. Try again: ");
					input = keyboard.nextInt();
				} else if (input > answer) {
					System.out.println("Too high. Try again: ");
					input = keyboard.nextInt();
				}
				counter++;
			}
		}

		if (input == answer) {
			System.out.println("Congratulations. You guessed the number! It took you " + counter + " tries to find it.");
		}
		keyboard.close();
	}

}
