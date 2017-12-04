/* Calvin Boyce #1 9/26/17
 * Lesson 5 practice program
 */
class PracticeProgram
{
    public static void main (String args[])
    {
        double d = (double)5/4; //same as 5.0/4(double) only applies to the 5
        System.out.println(d); //1.0
        int j = 5;
        int k = 4;
        d = (double)(j/k); //(j/k) is in its own little world and performs
        //a double, 1.0
        System.out.println(d); //1.0
    }//end of main()
}//end of class