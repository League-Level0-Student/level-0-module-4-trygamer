//    Copyright (c) The League of Amazing Programmers 2013-2017

import javax.swing.JOptionPane;

public class Test_Scores {
public static void main(String[] args) {
	
	String a =JOptionPane.showInputDialog("What what percent was your last test score?");
	
	 int a1 = Integer.parseInt(a);
			 
			 if(a1>89) {
				 JOptionPane.showMessageDialog(null, "That's an A");
				
			 }
			 else if(a1>79) {
				 JOptionPane.showMessageDialog(null, "That's an B");
			 }
				 else if(a1>69) {
					 JOptionPane.showMessageDialog(null, "That's an C");
				 }
					 else if(a1>59) {
						 JOptionPane.showMessageDialog(null, "That's an D");
					 }
					 else if(a1<=59) {
						 JOptionPane.showMessageDialog(null, "That's an F");
					 }
					 
}
	 
}
