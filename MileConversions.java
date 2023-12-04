/********************
 * Written by: Mauricio Lopez       **
 * Date Written: September 5, 2023  **
 * Purpose....MindTap 2-5           **
 *********************/
import java.util.Scanner;

public class MileConversions
{
    public static void main(String[] args)
    {
        // Variables and Constants
        final int INCHES_IN_MILES = 63360;
        final int FEET_IN_MILES = 5280;
        final int YARDS_IN_MILES = 1760;
        int miles = 0;
        int resultsInInches = 0;
        int resultsInFeet = 0;
        int resultsInYards = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of miles for conversion: ");
        miles = in.nextInt();

        // Calculation 
        resultsInInches = miles * INCHES_IN_MILES;
        resultsInFeet = miles * FEET_IN_MILES;
        resultsInYards = miles * YARDS_IN_MILES;

        // Output
        System.out.println("The program converts miles to inches: "
                           + resultsInInches);
        System.out.println("The program convers miles to feet: "
                           + resultsInFeet);
        System.out.println("The program converts miles to yards: "
                           + resultsInYards);
        
        in.close();
    } // end main
} // end MileConversions class
