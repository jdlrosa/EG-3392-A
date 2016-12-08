/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 9 TempConverter
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConverter extends JFrame{
	
	public TempConverter(){
		setTitle("Temperature Converter");
		setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("Enter a value in Celcius or Fahrenheit");
		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		
		ActionListener ctofevt = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				double celsius = Double.parseDouble(text1.getText());
				text2.setText(Double.toString((celsius * 1.8) + 32));
			}
		};
		
		ActionListener ftocevt = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				double fahrenheit = Double.parseDouble(text1.getText());
				text2.setText(Double.toString((fahrenheit - 32) / 1.8));
			}
		};
		
		JRadioButton toFahrenheit = new JRadioButton("Convert to fahrenheit");
		toFahrenheit.addActionListener(ctofevt);
		JRadioButton toCelcius = new JRadioButton("Convert to celcius");
		toCelcius.addActionListener(ftocevt);
		
		add(label1);
		add(text1);
		add(toFahrenheit);
		add(toCelcius);
		add(text2);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new TempConverter();
	}

}
