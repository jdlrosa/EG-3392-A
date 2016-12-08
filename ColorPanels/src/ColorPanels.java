
/*
 * Julian De La Rosa
 * Assignment 8 ColorPanels
 * EG 3392
 */
import java.awt.Color;
import javax.swing.*;

public class ColorPanels extends JFrame {

	public ColorPanels() {
		setTitle("ColorPanels");
		setLayout(null);
		setSize(600, 320);

		JPanel a = new JPanel();
		a.setLayout(null);
		a.setBackground(Color.RED);
		a.setLocation(15, 50);
		a.setSize(170, 150);
		add(a);

		JLabel l1 = new JLabel("Red");
		l1.setForeground(Color.RED);
		l1.setBounds(85, 05, 50, 50);
		add(l1);

		JButton b1 = new JButton("RED");
		b1.setBounds(55, 215, 100, 50);
		add(b1);

		JPanel b = new JPanel();
		b.setLayout(null);
		b.setBackground(Color.GREEN);
		b.setLocation(205, 50);
		b.setSize(170, 150);
		add(b);

		JLabel l2 = new JLabel("Green");
		l2.setForeground(Color.GREEN);
		l2.setBounds(270, 05, 50, 50);
		add(l2);

		JButton b2 = new JButton("GREEN");
		b2.setBounds(245, 215, 100, 50);
		add(b2);

		JPanel c = new JPanel();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		c.setLocation(395, 50);
		c.setSize(170, 150);
		add(c);

		JLabel l3 = new JLabel("Yellow");
		l3.setForeground(Color.YELLOW);
		l3.setBounds(460, 05, 50, 50);
		add(l3);

		JButton b3 = new JButton("YELLOW");
		b3.setBounds(435, 215, 100, 50);
		add(b3);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {
		new ColorPanels();
	}

}
