import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
boolean f1 =false;
		String c = JOptionPane.showInputDialog(null, "You entered a dungeon enter a color red, green, blue");

		if (c.equals("red")) {
			c.equalsIgnoreCase("red");
			JOptionPane.showMessageDialog(null, " you die from a deadly trap");
			f1=false;
		} else if (c.equals("blue")) {
			JOptionPane.showMessageDialog(null, " You get trampled from the crumbling dungeon");
			f1=false;
		}

		else {
			JOptionPane.showMessageDialog(null,
					" you made it succesfully inside the dungeon before it crumbled on you");
			f1=true;
		}
		if(f1) {
		String f=JOptionPane.showInputDialog(null," There are three doors you can choos 1, 2, or 3");
if(f.equals("1")) {
	JOptionPane.showMessageDialog(null," you meet the boss and die super easily");
}
else if(f.equals("2")) {
	JOptionPane.showMessageDialog(null," you find treasure and get teleported out of the dungeon; YOU WIN!");
}
else { JOptionPane.showMessageDialog(null," you fall into an endless pit");

}
		}
	}
	}

