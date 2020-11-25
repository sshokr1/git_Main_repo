import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserData {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,mobile,age,email,faculty;
		 String[] array ;
	     array = new String [5];
      name = JOptionPane.showInputDialog("What is your name? ");
       array[0]=name; 
       mobile = JOptionPane.showInputDialog("What is your mobile num? ");
       array[1]=mobile; 
       age = JOptionPane.showInputDialog("What is your age ? ");
       array[2]=age; 
       email = JOptionPane.showInputDialog("What is your email ? ");
       array[3]=email; 
       faculty = JOptionPane.showInputDialog("What is your faculty? ");
       array[4]=faculty; 
       for (int i=0; i<array.length; i++)
       {
       	System.out.println("array["+i+"]= "+array[i]);
       }
	}

}
