import java.util.Scanner;
public class EvenOrOdd {
    public static void main (String args[]) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x = kbReader.nextInt();
        if (x%2==0) {
            System.out.println("The integer "+x+" is even.");
        }else{
            System.out.println("The integer "+x+" is odd.");
        }
    }
}