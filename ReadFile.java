/*Display the content of the file*/
package Assigment1;
import java.util.Scanner;
import java.io.*;

public class ReadFile
{
    public static void main(String[] input)
    {
        String fname;
        Scanner scan = new Scanner(System.in);
        
        /* enter filename with location and read its content */
        
        System.out.print("Enter File Name to Open (with location ) : ");
        fname = scan.nextLine();
        
        /* this will reference only one line at a time */
        
        String line = null;
        try
        {
            /* FileReader reads text files in the default encoding */
            FileReader fr = new FileReader(fname);
            
            /* always wrap the FileReader in BufferedReader */
            BufferedReader br = new BufferedReader(fr);
            
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            
            /* always close the file after use */
            br.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}