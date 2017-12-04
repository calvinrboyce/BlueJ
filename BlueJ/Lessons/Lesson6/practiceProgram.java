/*
 * Calvin Boyce #1 9/28/27
 * Lesson 6 Program
 */
class practiceProgram{
    public static void main (String args[])
    {
        double d = -379.22;
        System.out.println(Math.abs(d));//379.22
        
        double b = 42.01;
        double e = 3.728;
        System.out.println(Math.pow(b,e));//1126831.027
        
        d = 2034.56;
        System.out.println(Math.sqrt(d));//45.10609715
        
        d = 1.4;
        System.out.println(Math.ceil(d));//2.0
        
        d = -1.6;
        System.out.println(Math.ceil(d));//-1.0
        
        d = 1.4;
        System.out.println(Math.floor(d));//1.0
        
        d = -1.6;
        System.out.println(Math.floor(d));//-2.0
        
        d = 7.89;
        System.out.println(Math.log(d));//2.065596135 log is base e
        
        double x = 2038.5;
        double y = -8999.0;
        System.out.println(Math.min(x,y));//-8999.0
        
        x = 2038.5;
        y = -8999.0;
        System.out.println(Math.max(x,y));//2038.5
        
        x = 148.2;
        System.out.println(Math.round(x));//148
        
        x = 148.7;
        System.out.println(Math.round(x));//149
        
        x = -148.2;
        System.out.println(Math.round(x));//-148
        
        x = -148.7;
        System.out.println(Math.round(x));//-149
        
        System.out.println(Math.PI);//3.14159265
    }//end of main()
}//end of class