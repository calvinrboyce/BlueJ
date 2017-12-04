public class PracticeProgram
{
    public static void main (String args[])
    {
        System.out.println("\nCalvin Boyce   #1");
        System.out.println("1. "+!true); //false
        System.out.println("2. "+!false); //true
        System.out.println("3. "+ !(3<5)); //false
        System.out.println("4. "+ !(1==0)); //true
        
        int x=79, y=46, z=-3;
        double d=13.89, jj=40.0;
        boolean b = true, c = false;
        
        System.out.println("\nVariables and their values\n\n" +
        "int x = 79, y = 46, z = -3;/n"+
        "double d = 13.89; jj = 40.0;\n"+
        "boolean b = true, c = flase;\n");
        System.out.println("1.  true && false    = "+(true&&false)); //false
        System.out.println("2.  true && !false   = "+(true&&!false));//true
        System.out.println("3.  c || (d>0)       = "+(c||(d>0)));//true
        System.out.println("4.  !b||c            = "+(!b||c));//false
        System.out.println("5.  (x>102)&&true    = "+((x>102)&&true));//false
        System.out.println("6.  (jj==1)||false   = "+((jj==1)||false));//false
        System.out.println("7.  (jj==40)&&!false = "+((jj==40)&&!false));//true
        System.out.println("8.  x!=3             = "+(x!=3));//true
        System.out.println("9.  !(x!=3)          = "+!(x!=3)); //false
        System.out.println("10. !!true           = "+!!true); //true
    }
}