import java.io.*;
import java.util.*;
public class Lesson07Int {
    public static void main (String args[]) {
        do {
            System.out.println("\nCalvin Boyce   #1");
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Enter your integer here. ");
            int i = kbReader.nextInt();
            System.out.println(3*i);
        }while(true);
    }
}