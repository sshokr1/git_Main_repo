import java.util.Scanner;

public class Arraysum {
	public static void main(String args[]) {

		Scanner userinput = new Scanner(System.in);
		int[] array;
		array = new int[5];
		int sum = 0;
		System.out.println("Enter 5");
		for (int i = 0; i < 5; i++) {
			array[i] = userinput.nextInt();
			sum += array[i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]" + array[i]);
		}
		System.out.println("Sum of array elements is:" + sum);
	}

}