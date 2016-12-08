
/*
 * Julian De La Rosa
 * Assignment 10 Battleship
 * EG 3392
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Battleship extends JFrame {

	public static final int bounds = -1;

	// values for the grid
	public static final int empty = 0;
	public static final int ship = 1;
	public static final int hit = 2;
	public static final int miss = 3;

	// directions used for ship placement
	public static final int right = 0;
	public static final int down = 1;

	// lengths of the ships
	private static final int carrierLength = 4;
	private static final int submarineLength = 3;
	private static final int patrolBoatLength = 1;

	// array of all ships
	public static final int[] shipLength = { carrierLength, submarineLength, patrolBoatLength };

	// hits required to destroy ships
	public static int totalHitsRequired;

	// the number of rows and columns in grid
	public static int numberofRows = 8;
	public static int numberofCols = 8;

	// size of the panel to be played on
	public static final int panelWidth = 600;
	public static final int panelHeight = 600;

	public static final int[][] grid = new int[numberofRows][numberofCols];

	public static final int FONT_SIZE = 20;

	// labels for stats
	public JLabel totalShotsLabel;
	public JLabel hitsLabel;
	public JLabel missesLabel;

	public int hits;
	public int misses;

	public int numHits;
	public int numMisses;

	public void BattleshipGrid(int numRows, int numCols) {
		numberofRows = numRows;
		numberofCols = numCols;

		// initialize the grid
		initGrid();

		// determine the total number of hits required
		calcTotalHits();

		// randomly place ships
		placeShips();
	}

	public void initGrid() {
		int row;
		int col;
		for (row = 0; row < numberofRows; row++) {
			for (col = 0; col < numberofCols; col++) {
				grid[row][col] = empty;
			}
		}

	}

	/**
	 * Calculates the total number of hits required to destroy all ships and win
	 * the game.
	 */
	public static void calcTotalHits() {
		totalHitsRequired = 0;

		// add all the ship lengths together to get
		// the total number of hits required
		for (int length : shipLength) {
			totalHitsRequired += length;
		}
	}

	public void placeShips() {
		if (Math.random() < 0.5) {
			int col = (int) (Math.random() * 8);
			int row = (int) (Math.random() * 8);
			for (int i = 0; i < shipLength; i++) {
				grid[row][col + i] = 0;
			}
		} else {
			int col = (int) (Math.random() * 8);
			int row = (int) (Math.random() * 8);
			for (int i = 0; i < size; i++) {
				grid[row + i][col] = 0;
			}
		}

	}

	/**
	 * returns true if the attack resulted in a ship being hit, and false
	 * otherwise.
	 *
	 */
	public boolean attack(int row, int col) {
		if (this.grid[row][col].equals(hits)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * true if all ships have been destroyed, false otherwise
	 */
	public boolean allGone() {

		return false;
	}

	/**
	 * Determine if the cell at the specified row and column is in the grid's
	 * bounds.
	 */
	private boolean inBounds(int row, int col) {
		return ((row >= 0) && (row < numberofRows) && (col >= 0) && (col < numberofCols));
	}

	/**
	 * Returns the value of the cell at [row][col] if the cell is in bounds.
	 * Otherwise, returns bounds
	 */
	public int getCell(int row, int col) {
		if (inBounds(row, col))
			return grid[row][col];
		else
			return bounds;
	}

	/**
	 * Prints the grid.
	 */
	public void printGrid() {
		//for (int i = 0; i < display.length; i++) {
	         //  for (int j = 0; j < display[i].length; j++);
	        	   }
	//}

	public void HitMissPanel(int width, int height) {
		setPreferredSize(new Dimension(width, height));
		setBackground(Color.DARK_GRAY);

		setLayout(new GridLayout(1, 0));

		// create a new label for the total number of shots
		totalShotsLabel = new JLabel("", JLabel.CENTER);
		totalShotsLabel.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));
		totalShotsLabel.setForeground(Color.WHITE);

		// create a new label for the total number of hits
		hitsLabel = new JLabel("", JLabel.CENTER);
		hitsLabel.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));
		hitsLabel.setForeground(Color.WHITE);

		// create a new label for the total number of misses
		missesLabel = new JLabel("", JLabel.CENTER);
		missesLabel.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));
		missesLabel.setForeground(Color.WHITE);

		// initialize stats
		setStats(0, 0);

		// add the labels to this panel
		add(totalShotsLabel);
		add(hitsLabel);
		add(missesLabel);

	}

	public void setStats(int hits, int misses) {
		this.hits = hits;
		this.misses = misses;
		updateLabels();
	}

	/**
	 * Updates the hit and miss statistics labels.
	 */
	private void updateLabels() {
		totalShotsLabel.setText("Shots: " + (hits + misses));
		hitsLabel.setText("Hits: " + hits);
		missesLabel.setText("Misses: " + misses);

	}

	public Battleship() {
		setTitle("Welcome to Battleship");
		setLayout(new BorderLayout());
		setSize(600, 600);

		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public class Listener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			// attack the grid based on where the user clicked
			attackGrid(e.getX(), e.getY());

			// update the graphics
			repaint();

			if (grid.allGone()) {
				JOptionPane.showMessageDialog(null, "You win!");
				System.exit(0);
			}
		}
	};

	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Color.BLACK);

		drawGridLines(g);
		drawGridCells(g);
	}

	public void drawGridLines(Graphics g) {
		g.setColor(Color.WHITE);

		// draw vertical grid lines
		for (int x = 0; x < panelWidth; x += panelWidth / grid.numberofCols) {
			g.drawLine(x, 0, x, panelHeight - 1);
		}

		// draw horizontal grid lines
		for (int y = 0; y < panelHeight; y += panelHeight / grid.numberofRows) {
			g.drawLine(0, y, panelWidth - 1, y);
		}
	}

	/**
	 * empty cells are black squares, misses are blue squares, and hits are red
	 * squares.
	 *
	 */
	private void drawGridCells(Graphics g) {
		// iterate over the entire grid
		for (int row = 0; row < grid.numberofRows; row++) {
			for (int col = 0; col < grid.numberofCols; col++) {
				
				/* g.setColor(Color.black);
			      g.drawRect(20, 20, 120, 120);
			      
			     
			      g.setColor(Color.red);
			      g.fillRect(160, 160, 120, 120);
				*/
			}
		}
	}

	/**
	 * sees what was clicked on to attack and left alone if already done update
	 * stats
	 * 
	 */
	private boolean attackGrid(int mouseX, int mouseY) {
		// if (this.grid()[row][col].equals()) {
		// return false;
		// }else

		{
			return true;
		}

		// setStats(numHits, numMisses);
	}

	public static void main(String[] args) {
		
		new Battleship();

	}

}
