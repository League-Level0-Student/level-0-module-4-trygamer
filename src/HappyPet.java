
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String pet = JOptionPane.showInputDialog("what kind of pet do you want to buy");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 10; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your " + pet + " happy?",
					"Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "take a walk", "groom", "clean up poop", }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				cuddle(pet);
			} else if (task == 1) {
				food(pet);
			} else if (task == 2) {
				takeawalk(pet);
			} else if (task == 3) {
				groom(pet);
			} else if (task == 4) {
				cleanuppoop(pet);
			}

			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.

			if (happinessLevel >= 10) {
JOptionPane.showMessageDialog(null, "you love your pet");
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void cuddle(String pet) {
		JOptionPane.showMessageDialog(null, pet + " zzzzzzzzz");
		happinessLevel = happinessLevel + 1;
	}

	static void food(String pet) {
		JOptionPane.showMessageDialog(null, pet + " yummy");
		happinessLevel = happinessLevel + 3;
	}

	static void takeawalk(String pet) {
		JOptionPane.showMessageDialog(null, pet + " zzzzzzzzz");
		happinessLevel = happinessLevel + 2;
	}

	static void groom(String pet) {
		JOptionPane.showMessageDialog(null, pet + " purrr");
		happinessLevel = happinessLevel + 1;
	}

	static void cleanuppoop(String pet) {
		JOptionPane.showMessageDialog(null, pet + " ooopsie");
		happinessLevel = happinessLevel + 2;
	}
}