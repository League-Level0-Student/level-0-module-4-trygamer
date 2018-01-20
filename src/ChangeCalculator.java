//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String n =JOptionPane.showInputDialog("how many nickels do you have");
String d =JOptionPane.showInputDialog("how many dimes do you have");
String q =JOptionPane.showInputDialog("how many quarters do you have");
		// Convert their answer to an int using Integer.parseInt()
int n1 =Integer.parseInt(n);
int d1 =Integer.parseInt(d);
int q1 =Integer.parseInt(q);

double change= .25*q1 +.05*n1+ .10*d1;

JOptionPane.showMessageDialog(null, "$"+change);

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}
