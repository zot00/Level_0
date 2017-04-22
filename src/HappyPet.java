import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.

	public static void main(String[] args) {
		int hl = 0;
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String q = JOptionPane.showInputDialog("What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What will make your pet happy?", "", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "FOOD", "Water", "Groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
			if(task == 0){
				int task2 = JOptionPane.showOptionDialog(null, "Your pet " + q + " ate the food and dislikes it. It pooed all over your house. What do you choose to do?", "", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Do both of those while simultaneously cleaning yourself", "Kick your pet", "Hire a maid"}, null);
				if(task2 == 0){
					hl = hl+100;
					JOptionPane.showMessageDialog(null, "Your pet " + q + " hates you now, so it ate the maid.");
					JOptionPane.showMessageDialog(null, "It somehow escapes your house and becomes a worldwide absolute monarch. Take better care of your pet, because your house just got nuked.");
					JOptionPane.showMessageDialog(null, "Your Pet's Happiness: " + hl + "% :)");
					JOptionPane.showMessageDialog(null, "Your Happiness: 0% :(");
				}
				if(task2 == 1){
					hl = hl+100;
					JOptionPane.showMessageDialog(null, "Your pet " + q + " hates you now.");
					JOptionPane.showMessageDialog(null, "It somehow escapes your house and becomes a worldwide absolute monarch. Take better care of your pet, because your house just got nuked.");
					JOptionPane.showMessageDialog(null, "Your Pet's Happiness: " + hl + "% :)");
					JOptionPane.showMessageDialog(null, "Your Happiness: 0% :(");
				}
				if(task2 == 2){
					hl = hl+100;
					JOptionPane.showMessageDialog(null, "Your pet " + q + " ate the maid.");
					JOptionPane.showMessageDialog(null, "You managed to sew your pet after discovering it was secretly stealing money from the government, plus it ate the maid.");
					JOptionPane.showMessageDialog(null, "It somehow escapes your house and becomes a worldwide absolute monarch. Take better care of your pet, because your house just got nuked.");
					JOptionPane.showMessageDialog(null, "Your Pet's Happiness: " + hl + "% :)");
					JOptionPane.showMessageDialog(null, "Your Happiness: 0% :(");
				}
				}
			if(task == 1){
				hl = hl + 20;
				JOptionPane.showMessageDialog(null, "Your pet " + q + " drank the water and got hungry. You didn't offer it food because it was 20 minutes 'till dinner. It had your for dinner.");
				JOptionPane.showMessageDialog(null, "Your Pet's Happiness: " + hl + "% You're too chewy, but it is satisfied without an owner. Overall rating: :(");
				JOptionPane.showMessageDialog(null, "Your Happiness: 0% Overall rating: :(");
				}
			if(task == 2){
					hl = hl+100;
					JOptionPane.showMessageDialog(null, "You brushed your pet's fur until you suffocate.");
					JOptionPane.showMessageDialog(null, "Your Pet's Happiness: " + hl + "% Overall rating: :)");
					JOptionPane.showMessageDialog(null, "Your Happiness: 0% Overall rating: :(");
				}
	}
}