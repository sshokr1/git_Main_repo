import java.util.Scanner;


public class containString {


 public static void main(String[] args){
	
	 Scanner input = new Scanner(System.in);

     System.out.print("enter first name: ");
     String name1 = input.next();
     System.out.print("enter second name: ");
     String name2 = input.next();
	
    // boolean containname1 = name2.contains("yes");
     boolean name = name1.contains(name2);
     System.out.print(name);
 }


} 

	
	
	
	

 
