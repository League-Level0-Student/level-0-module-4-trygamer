//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday = false, isVacation=false;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
        int ans=JOptionPane.showConfirmDialog(null, "is it a weekday?", "",JOptionPane.YES_NO_OPTION);
        

if(ans==0) {
	isVacation= true;
	
}

if(isWeekday==true) {
	JOptionPane.showMessageDialog(null, "get up lazy bones");
}

	
	



int ans1 = 0;
if(isVacation==true) {
	  ans1=JOptionPane.showConfirmDialog(null, "is it a vacation?", "",JOptionPane.YES_NO_OPTION);
	
}
if(ans1==0) {
	JOptionPane.showMessageDialog(null, "sleep in");
}
else { 
	JOptionPane.showMessageDialog(null, "get up lazy bones");
}
	
	/*

         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }}

