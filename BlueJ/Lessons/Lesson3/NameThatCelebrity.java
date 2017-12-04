/*
 * Name That Celebrity
 * Calvin Boyce
 * 9/8/17
 * Coach Tua'one
 * CompSci2 per1
 */

public class NameThatCelebrity
{
    public static void main(String[] args)
    {
        //celebrity names
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";
        
        //print shortened names
        String s4 = s1;
        int l = s4.length();
        System.out.println(s1 + ">>>" + s4.substring(2, l-3));
        
        s4 = s2;
        l = s4.length();
        System.out.println(s2 + ">>>" + s4.substring(2, l-3));
        
        s4 = s3;
        l = s4.length();
        System.out.println(s3 + ">>>" + s4.substring(2, l-3));
    }
}