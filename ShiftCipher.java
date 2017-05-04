package Assigment1;
import java.util.Scanner;

public class ShiftCipher
{
    // Encrypts text using a shift 
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();
 
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
 //decryption
    public static StringBuffer decrypt(StringBuffer enmsg, int s)
    {
        StringBuffer result= new StringBuffer();
 
        for (int i=0; i<enmsg.length(); i++)
        {
            if (Character.isUpperCase(enmsg.charAt(i)))
            {
                char ch = (char)(((int)enmsg.charAt(i) -
                                  s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)enmsg.charAt(i) -
                                  s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    // main code
    public static void main(String[] args)
    {
    	 Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String for Encryption: ");
         String message = new String();
         message = sc.next();
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number of bits to be shifted ");
         int s = input.nextInt();

   
        System.out.println("Text  : " + message);
        System.out.println("Shift : " + s);
        System.out.println("ShiftCipher: " + encrypt( message, s));
        StringBuffer enmsg = encrypt( message, s);
        System.out.println("Originalmessage: " + decrypt( enmsg, s));
    }
}