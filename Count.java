/*count the characters in the file*/
package Assigment1;
import java.util.Scanner;
import java.io.*;

public class Count {
	public static void main(String args[]){
		String fname;
		Scanner scan = new Scanner(System.in);
		/*enter the file name with location*/
		System.out.println("Enter File Name to Open (with location ) : ");
        fname = scan.nextLine();
       
        /*enter the chracter to be counted*/
        System.out.println("Enter the character to to be counted:");
        char character = scan.nextLine().charAt(0);
        
        int count = 0;/*variable to keep count of character*/
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(fname));
            String line = null;
            while ((line = br.readLine()) != null) {
                for(int i=0; i<line.length();i++){
                    if(line.charAt(i) == character){
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            // File not found
        } catch (IOException e) {
            // Couldn't read the file
        }
        
      System.out.print("The number of occurence is of character "+ character +
    		  " is "+count);
	}

}
