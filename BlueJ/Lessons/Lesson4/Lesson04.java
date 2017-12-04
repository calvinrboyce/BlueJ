/* Calvin Boyce #1 9/18/2000
 * Lesson 04 Program
 */
class Lesson04
{
    public static void main(String args[])
    {
        System.out.println("Calvin # 1\n");
        
        System.out.println("The assignment operator:");
        double p;
        double j = 47.2;
        p = j;//assign the value of j to p.  Both p and j are now equal to 47.2
        System.out.println("p = "+p+" j = "+j);
        
        System.out.println("Multiple declarations:");
        double d = 1, mud = 1, puma = 1;//the variables are only declared
        double x = 31.2, m = 37.09, zu = 1; p = 43.917;//x, m, & p declared and initialized
                                                   //zu is just declared
        System.out.println("d = "+d+" mud = "+mud+" puma = "+puma+
        "\nx = "+x+" m = "+m+" zu = "+zu+" p = "+p);
        
        System.out.println("PEMDAS:");
        System.out.println(5 + 3 * 4 -7);//10
        System.out.println(8 - 5*6 / 3 + (5-6) * 3);//-5
        
        //count = count+3 //this is illegal in algebra; however, in computer science it
        //means the new count equals the old cound + 3.
        
        System.out.println("Not the same as in Algebra:");
        int count =15;
        count = count+3;
        System.out.println(count);//18
        
        System.out.println("Code Examples");
        int g = 409;
        g += 5;
        System.out.println(g);//414
        d = 20.3;
        m = 10.0;
        m*= d -1;
        System.out.println(m);//193.0
        
        System.out.println("Code Examples");
        int q = 78;
        p = 2 + q++;
        System.out.println("p = "+p+", q = "+q);//p = 80, q = 79
        q = 78;
        p = ++q + 2;
        System.out.println("p = "+p+", q = "+q);//p = 81, q=79
        
        x = 5;
        int y = 2;
        System.out.println(x/y); //Both x and y are integers, so the "real" answer of 2.5
                                 //has the fractional part thrown away to give 2
        
    }//end of main()
}//end of class