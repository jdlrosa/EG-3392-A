
/*
 * Julian De La Rosa
 * EG3392
 * Assignment 6 Division
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int A = 0;
		int B;
		
		try{
		System.out.println("Please enter the first integer");
		A = kb.nextInt();
		
		System.out.println("Please enter the second integer");
		B = kb.nextInt();
		
		System.out.println(A / B);
		}
		
		catch(InputMismatchException e){
			System.out.println(e.getMessage() + "exception");
			System.out.println("Please reenter the integers");
			kb.nextLine();
			A = kb.nextInt();
			B = kb.nextInt();
			System.out.println(A / B);
		}
		
		catch(ArithmeticException e){
			System.out.println(e.getMessage() + "exception");
			System.out.println("Please reenter the second integer" );
			B = kb.nextInt();
			System.out.println(A / B);
		}
		
		
		
		kb.close();

	}

}
