import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OceanPanel extends JFrame {
	private JPanel panel;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 400;
	private Ocean newOcean;
	private boolean shootAt;
	private int row;
	private int column;

	public OceanPanel() {

		super("Welcome to Battleship");
		newOcean = new Ocean();
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);

	}

	// listener for the different button actions
	class ShipButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Frame messageFrame = new Frame();
			if (newOcean.isGameOver() == false) {

				newOcean.assistPlace(row, column);
				newOcean.shootAt(row, column);
				newOcean.shotsFired++;
				Ship ship = newOcean.getShipAtPosition(row, column);

				if (shootAt == true) {

					JOptionPane.showMessageDialog(messageFrame, "You Hit My Ship!");
					panel.setBackground(Color.RED);

				}

				else {

					JOptionPane.showMessageDialog(messageFrame, "You Missed My Ship!");
					panel.setBackground(Color.WHITE);
				}

				if (ship.shootAt(row, column)) {

					newOcean.hitCount++;

					if (ship.isSunk()) {

						JOptionPane.showMessageDialog(messageFrame, "you sunk my" + ship.getShipType());

					}
				}
			}
		};
	}

	// panel that everything will be placed on
	private void buildPanel() {
		panel = new JPanel(new GridLayout(10, 10));
		JButton squares[][] = new JButton[10][10];

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {

				squares[i][j] = new ShipButton(i, j, newOcean);
				squares[i][j] = new JButton();
				squares[i][j].setBackground(Color.BLUE);
				squares[i][j].setBounds(i * 50, j * 50, 100, 100);
				squares[i][j].addActionListener(new ShipButtonListener());

				panel.add(squares[i][j]);
			}

		}
	}

	public static void main(String[] args) {
		new OceanPanel();
	}
}
