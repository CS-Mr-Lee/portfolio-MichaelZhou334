/**
 * Name:
 * Date: Feb 13, 2022
 * Description: This program asks for two grocery items and their price, 
 * then prints them out in a formatted way
 */

import java.util.*;
import java.text.*;

public class Zhou_Michael_GroceryItem {
    public static void main(String[] args) {

        //declare variables
        String grocery1Name;
        String grocery2Name;
        double grocery1Price;
        double grocery2Price;

        Scanner input = new Scanner(System.in);     //declare Scanner


        System.out.println("The price of 1 grocery must not exceed $99.99");                            //state the restrictions
        System.out.println("The name of 1 grocery must not exceed 20 characters(including spaces)");

        System.out.println("What is the name of Grocery #1");               //asks for the name of Grocery #1 and stores it
        grocery1Name = input.nextLine();

        System.out.println("What is the name of Grocery #2");               //asks for the name of Grocery #2 and stores it
        grocery2Name = input.nextLine();

        System.out.println("What is the price of " + grocery1Name);         //asks for the price of Grocery #1 and stores it
        grocery1Price = input.nextDouble();

        System.out.println("What is the price of " + grocery2Name);         //asks for the price of Grocery #2 and stores it
        grocery2Price = input.nextDouble();

        NumberFormat nf = NumberFormat.getCurrencyInstance();               //creates format in the form of currency, so $ at the front and 2 decimal places

        System.out.println("-".repeat(27));                                                 //prints the top border
        
        System.out.printf("%-20s %6s%n", grocery1Name, nf.format(grocery1Price));           //prints the wanted format
        System.out.printf("%-20s %6s%n", grocery2Name, nf.format(grocery2Price));
        
        System.out.println("-".repeat(27));                                                 //prints the bottom border


    }
}
