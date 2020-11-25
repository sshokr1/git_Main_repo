
import java.util.Scanner;
	public class stringtask1 {

	  public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);

	        System.out.print("enter first name: ");
	        String x = input.next();
	        System.out.print("enter second name: ");
	        String y = input.next();
	       
	        if (x.equals(y) == true) { 
	           System.out.println("equal"); 
	        } 
	        else { 
	           System.out.println("not equal");
	        
	        //boolean equal=x.equals(y);
	       // System.out.println("equal");
	       // boolean shallowCompare = (x==y);
	       // System.out.println(shallowCompare);
	        		
	        }
	    }
	
	}
