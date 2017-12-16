import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {

		String c = JOptionPane.showInputDialog(null, "You entered a dungeon enter a color red, green, blue");

		if (c.equals("red")) {
			JOptionPane.showMessageDialog(null, " you die from a deadly trap");
		} else if (c.equals("blue")) {
			JOptionPane.showMessageDialog(null, " You get trampled from the crumbling dungeon");
		}

		else {
			String f1 = JOptionPane.showInputDialog(null,
					" you made is succesfully inside the dungeon before it crumbled on you");
		}
		String f=JOptionPane.showInputDialog(null," There are three doors you can choos 1, 2, or 3");
if(f=("1")) {
	JOptionPane.showMessageDialog(null," you meet the boss and die super easily");
}
else if(f=("2")) {
	JOptionPane.showMessageDialog(null," you find treasure and get teleported out of the dungeon; YOU WIN!");
}
else { JOptionPane.showMessageDialog(null," you fall into an endless pit");

}
	}
}
