import javax.swing.JOptionPane;

public class Grade2 {
	public static void main(String[] args) {

		String usergrade = JOptionPane.showInputDialog("What is your Grade? ");

		switch (usergrade.toLowerCase()) {
		case "A":
			JOptionPane.showMessageDialog(null, " This Grade starts from 85 to 100  ");
			break;

		case "B":
			JOptionPane.showMessageDialog(null, " This Grade starts from 75 to 85 ");
			break;
		case "C":
			JOptionPane.showMessageDialog(null, " This Grade starts from 50 to 65  ");
			break;
		case "D":
			JOptionPane.showMessageDialog(null, " This Grade starts from 0 to 50  ");
			break;
		case "E":
			JOptionPane.showMessageDialog(null, " This Grade starts from 65 to 75");
			break;

		default:
			JOptionPane.showMessageDialog(null, " invalid input, please insert a valid grade");
			break;
		}
	}
}
