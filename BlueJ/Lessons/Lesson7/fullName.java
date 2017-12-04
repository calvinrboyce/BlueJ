import java.io.*;
import java.util.*;
public class fullName {
    public static void main (String args[]) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("What is your first name?");
        String a = kbReader.next();
        System.out.println("What is your last name?");
        String b = kbReader.next();
        System.out.println("Your full name is " + a + " " + b + ".");
    }
}