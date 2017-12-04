import java.io.*;
import java.util.*;
public class Lesson07Double {
    public static void main (String args[]) {
        do {
            System.out.println("\nCalvin Boyce  #1");
            Scanner kbReader = new Scanner (System.in);
            System.out.print("Enter your decimal number here. ");
            double d = kbReader.nextDouble();
            System.out.println(3*d);
        }while(true);
    }
}