/*
 * Calvin Boyce
 * Coach Tua'one
 * Mixed Results
 * 9/26/17
 */
public class MixedResults
{
    public static void main(String[] args)
    {
        double d1 = 37.9;
        double d2 = 1004.128;
        int i1 = 12;
        int i2 = 18;
        
        System.out.println(57.2 * (i1/i2) + 1); //1.0
        System.out.println(57.2 * ((double)i1/i2) + 1); //39.13
        System.out.println(15 - i1 * ( d1 * 3) + 4); //-1345.4
        System.out.println(15 - i1 * (int)(d1 * 3) + 4); //-1337
        System.out.println(15 - i1 * ((int)d1*3) + 4); //-1313
    }
}