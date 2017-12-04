import java.io.*;
import java.util.*;
public class Lesson07String {
    public static void main (String args[]) {
        do {
            System.out.println("\nCalvin Boyce  #1");
            Scanner kbReader = new Scanner (System.in);
            System.out.print("Enter your String here. "); //Enter One Two
            String s1 = kbReader.next();//inputs up to the first white space
            System.out.println("This is the first part of the String,..." + s1);
            String s2 = kbReader.next();
            System.out.println("This is the next part of the String,..." + s2 
            + "\n\nThis is the String concatenated\n"+s1+" "+s2);
        }while(true);
    }
}