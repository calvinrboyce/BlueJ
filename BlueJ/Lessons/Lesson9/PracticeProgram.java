import java.util.Scanner;

class PracticeProgram
{
    public static void main (String args[])
    {
        System.out.println("\nExample 1:");
        //Get a grade from the keyboard
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your grade? ");
        int myGrade = kbReader.nextInt();
        //Make a decision based on the value of the grade you entered
        if (myGrade >= 70)
        {
            //execute code here if the test above is true
            System.out.println("Congratulations, you passed.");
        } 
        else
        {
            //execute code here if the test above is false
            System.out.println("Better luck next time.");
        }
        
        System.out.println("\nExample 2:");
        kbReader = new Scanner(System.in);
        System.out.print("What state do you live in? ");
        String state = kbReader.nextLine(); //get state from keyboard
        System.out.print("What is the price? ");
        double purchasePrice = kbReader.nextDouble(); //get price from keyboard
        double tax = 0;
        if (state.toLowerCase().equals("utah") || state.toLowerCase().equals("ut"))
        {
            //execute code here if test above is true
            tax = purchasePrice *.08; //8% tax
        }
        double totalPrice = purchasePrice + tax;
        System.out.println("The total price is " + totalPrice + ".");
        
        int groovyDude = 37;
        System.out.println("\n\nExample 3:  groovyDude = 37 "+(groovyDude ==37));
        if (groovyDude == 37)
        groovyDude++; //this line is executed if test is true
        System.out.println("groovyDude = "+groovyDude); //38
        
        groovyDude = 105;
        System.out.println("\n\nExample 4:  groovyDude = 37 "+(groovyDude ==37));
        if (groovyDude ==37)
        groovyDude++; //this line is not executed if test is false
        System.out.println("groovyDude = "+groovyDude); //105
        
        System.out.println("\n\nExample 5::");
        //Get a grade from the keyboard
        kbReader = new Scanner(System.in);
        System.out.println("What is your grade? ");
        int theGrade = kbReader.nextInt();
        if (theGrade>=90){
            System.out.println("You made an A.");
        } else if (theGrade>=80) {
            System.out.println("You made a B.");
        } else if (theGrade>=70) {
            System.out.println("You made a C.");
        } else if (theGrade>=60) {
            System.out.println("You made a D.");
        } else {
            System.out.println("Sorry, you failed.");
        }
        
    }
}