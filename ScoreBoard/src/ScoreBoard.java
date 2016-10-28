/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 9 ScoreBoard
 */
import java.awt.*;
import javax.swing.*;

public class ScoreBoard extends JFrame {

	public ScoreBoard() {
		setTitle("JButton ScoreBoard");
		setLayout(new BorderLayout());

		JPanel red = new JPanel();
		JPanel blue = new JPanel();

		JLabel redLabel = new JLabel("Red Team");
		redLabel.setForeground(Color.RED);
		redLabel.setHorizontalAlignment(JLabel.CENTER);
		red.add(redLabel);
		JLabel redScore = new JLabel("0");
		redScore.setHorizontalAlignment(JLabel.CENTER);
		red.add(redScore);
		JButton redButton = new JButton("Red Score");
		red.add(redButton);
		red.setLayout(new GridLayout(3, 1));
		
		JLabel blueLabel = new JLabel("Blue Team");
		blueLabel.setForeground(Color.BLUE);
		blueLabel.setHorizontalAlignment(JLabel.CENTER);
		blue.add(blueLabel);
		JLabel blueScore = new JLabel("0");
		blueScore.setHorizontalAlignment(JLabel.CENTER);
		blue.add(blueScore);
		JButton blueButton = new JButton("Blue Score");
		blue.add(blueButton);
		blue.setLayout(new GridLayout(3, 1));

		JButton reset = new JButton("Reset Score");
		

		add(red, BorderLayout.EAST);
		add(blue, BorderLayout.WEST);
		add(reset, BorderLayout.SOUTH);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ScoreBoard();

	}

}
