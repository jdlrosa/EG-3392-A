
/*
 * Julian De La Rosa
 * Assignment 8 FileSum
 * EG 3392
 */
import java.io.*;
import java.util.Scanner;

public class FileSum {

	public static void main(String[] args) throws IOException {

		Scanner kb = new Scanner(System.in);

		System.out.println("Please enter the numbers and enter -1 to end");

		File f = new File("C:/Test/Number.txt");

		PrintWriter p = new PrintWriter(f);

		int number = 0;
		while (number != -1) {
			number = kb.nextInt();
			p.print(number + " ");
		}

		p.close();

		Scanner s = new Scanner(f);

		int sum = 0;
		while (s.hasNext()) {
			sum += Integer.parseInt(s.next());
		}

		System.out.println("sum is " + sum);

		kb.close();

		s.close();

	}

}
