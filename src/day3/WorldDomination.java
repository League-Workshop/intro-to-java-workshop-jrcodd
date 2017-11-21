package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
//JOptionPane.showInputDialog("Do You Know How To Write Code?");
		// 2. If they say "yes", tell them they will rule the world.
String answer;
answer = JOptionPane.showInputDialog("Do You Know How To Write Code");
if(answer.equals("yes")) {
	JOptionPane.showMessageDialog(null, "You will Rule The World!!!");
}
		// 3. Otherwise, wish them good luck washing dishes.
	else {
		JOptionPane.showMessageDialog(null, "Good Luck Washing Dishes");
}
}
}

