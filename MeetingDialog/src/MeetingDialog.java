
/*
 * Julian De La Rosa
 * Assignment 8 MeetingDialog
 * EG 3392
 */
import javax.swing.JOptionPane;

public class MeetingDialog {
	public static void main(String[] args) {
		String name;
		int answer;

		do {
			name = JOptionPane.showInputDialog(null, "What is your name?");
			answer = JOptionPane.showConfirmDialog(null, "Is " + name + " your name?");
		}

		while (answer == JOptionPane.NO_OPTION);

		JOptionPane.showMessageDialog(null, "Nice to meet you " + name);

		System.exit(0);
	}
}
