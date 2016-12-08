
/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 9 CtoFConverter
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CtoFConverter extends JFrame {

	public CtoFConverter() {
		setTitle("Temperature Converter");
		setLayout(new FlowLayout());

		JLabel cLabel = new JLabel("Celcius: ");
		JLabel fLabel = new JLabel("Fahrenheit: ");

		JTextField cText = new JTextField(5);
		JTextField fText = new JTextField(5);

		ActionListener evt = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				double celsius = Double.parseDouble(cText.getText());
				fText.setText(Double.toString((celsius * 1.8) + 32));
			}
		};

		JButton convert = new JButton("Convert");
		convert.addActionListener(evt);

		add(cLabel);
		add(cText);
		add(fLabel);
		add(fText);
		add(convert);

		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new CtoFConverter();

	}

}
