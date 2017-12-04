import java.io.*;
import java.util.*;
public class GoingInCircles{
    public static void main (String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("What is the area?_ ");
        double a = kbReader.nextDouble();
        System.out.println("Radius of your circle is " + Math.sqrt(a/Math.PI));
    }
}