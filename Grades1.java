import javax.swing.JOptionPane;

public class Grades1 {
public static void main(String[] args) {
	
	
		String input = JOptionPane.showInputDialog("What is your score? ");
		int userscore1 = Integer.parseInt(input);
		 
		 
	if (userscore1>=50 && userscore1 <65) 
		JOptionPane.showMessageDialog(null, " C ");
	
	else if (userscore1>=65 && userscore1 <75)
	JOptionPane.showMessageDialog(null, " F ");

	
	else if (userscore1>=75 && userscore1 <85)
		JOptionPane.showMessageDialog(null, " B ");
		
	else if (userscore1>=0 && userscore1 <50)
		JOptionPane.showMessageDialog(null, " D ");
		
		else if (userscore1>=85 && userscore1 <100)
		JOptionPane.showMessageDialog(null, " A ");
		else 
			JOptionPane.showMessageDialog(null, " invalid input, please insert a valid score");
}
}
