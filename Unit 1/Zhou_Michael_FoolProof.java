/**
 * Name: Michael Zhou
 * Date: Feb 15
 * Description: This program repeatedly asks for the numerator and divisor. The program prints out the quotient, or informative error message if there is problem.
 * The program exist the loop when data is entered for the numerator that starts with "q" or "Q"
 */

import java.util.*;

public class Zhou_Michael_FoolProof {
    public static void main(String[] args) {

        //declare variables
        double numerator = 0;
        double divisor = 0;
        double result;
        String quitChecking = "";


        Scanner input = new Scanner(System.in);                 //declare scanner

        do {                                                    //do-while loop so the program keeps repeating

            try {                                               //try catch block for numerator in case bad data is entered
                System.out.println("Enter the numerator:");
                numerator = input.nextDouble();


            } catch (InputMismatchException e) {                //catches bad data

                quitChecking = input.nextLine();                //takes the input in as a String

                if (quitChecking.charAt(0) == 'q' || quitChecking.charAt(0) == 'Q') {       //if the bad data starts with "q"/"Q" then terminate the from the loop and therefore program
                    break;
                }

                System.out.println("You entered bad data.");    //informative message telling them they entered bad data and restarting the loop
                System.out.println("Please try again.");
                continue;

            }


            try {                                               //try catch block for divisor in case bad data/zero is entered and restarting the loop

                System.out.println("Enter the divisor:");       //asks for the divisor
                divisor = input.nextDouble();

            } catch (InputMismatchException e) {                        //catches bad data
                System.out.println("You entered bad data.");            //informative message telling them they entered bad data and restarting the loop
                System.out.println("Please try again.");
                input.nextLine();
                continue;
            }

            if (divisor == 0) {                                                 //if the user entered zero for the divisor, tell them you can't do that and restart the loop
                System.out.println("Sorry, you can't divide by zero");
                continue;
            }

            result = numerator / divisor;                                       //no problems occur so calculate the result and print it
            System.out.println(numerator + " / " + divisor + " is " + result);


        } while (true);

        input.close();              //close the Scanner


    }

}
