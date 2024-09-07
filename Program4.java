//Youre on your own!
import java.util.Scanner;
//Jk ask for help if you need it (but also look at previous programs!!)
public class Program4{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter the first variable:");
        int Variable1 = 0;
        Variable1 = myScanner.nextInt();
        System.out.println("Enter the second variable:");
        int Variable2 = 0;
        Variable2 = myScanner.nextInt();
        System.out.println("Enter the third variable:");
        int Variable3 = 0;
        Variable3 = myScanner.nextInt();
        System.out.println("Enter the fourth variable:");
        int Variable4 = 0;
        Variable4 = myScanner.nextInt();
        int Variable5 = 0;
        double Variable6 = 0;
        Variable5 = Variable1 + Variable2 + Variable3 + Variable4;
        Variable6 = (double) Variable5 / 4;
        
        System.out.println ("The sum of the four numbers is " + Variable5);
        System.out.println();
        System.out.println("The average of the four numbers " + Variable6);
        
        
        
    }
}


//Paste console output below:
/*
Enter the first variable:
475
Enter the second variable:
821
Enter the third variable:
369
Enter the fourth variable:
562
The sum of the four numbers is 2227

The average of the four numbers 556.75
*/
