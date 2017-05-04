/*Take 2 value from user and Xor*/
package Assigment1;
import java.util.Scanner;

public class Xor {
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		/*Enter the first number*/
		System.out.println("Enter the first number:");
		int x = scan.nextInt();
		/*Enter the second number*/
		System.out.println("Enter the second number:");
		int y = scan.nextInt();
		
		int z = x ^ y;//XOR operation
		
		System.out.println("Result is :"+z);
	}

}
