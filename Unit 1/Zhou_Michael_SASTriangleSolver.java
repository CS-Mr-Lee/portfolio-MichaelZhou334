/**
 * Name:Michael Zhou
 * Date: Feb 12
 * Description: Create a method that returns the smallest angle(degrees) in a triangle given
 * 2 sides and the angle(radians) between them. Sides and angles can have decimals
 */


import java.util.*;
import java.lang.*;

public class Zhou_Michael_SASTriangleSolver {

    /**
     * Name: smallestAngle
     * Description: This method uses cosine and sine law to find the smallest angle of a triangle
     * given 2 sides and the angle between them in radians
     *
     * @param sideA - User inputted first side
     * @param sideB - User inputted second side
     * @param angleC - User inputted angle between them in radians
     * @return - returns the calculated smallest angle still in radians
     */
    static double smallestAngle(double sideA, double sideB, double angleC) {

        //declare variables
        double sideC;
        double smallestSide;
        double smallestAngle = 0;

        sideC = Math.sqrt(sideA*sideA + sideB*sideB - 2*sideA*sideB*Math.cos(angleC));      //find the non-user inputted side using cosine law

        smallestSide = Math.min(sideC, Math.min(sideB,sideA));  //finds the smallest side from all 3 sides. Since smallest side is opposite to the smallest angle (from trigonometry)

        if (smallestSide == sideC )  {                                          //if smallest side is C(non-user inputted) then angle is already known
            smallestAngle = angleC;
        }
        if (smallestSide == sideA)  {                                           //if the smallest side is A, calculate using sine law what the smallest angle is
            smallestAngle = Math.asin(((sideA * Math.sin(angleC)) / sideC));
        }
        if (smallestSide == sideB)  {                                           //if the smallest side is B, calculate using sine law what the smallest angle is
            smallestAngle = Math.asin(((sideB * Math.sin(angleC)) / sideC));
        }
        return smallestAngle;                                                   //return the smallestAngle

    }

    public static void main(String[] args) {

        //declare variables
        double sideA;
        double sideB;
        double sideC;
        double angleC;
        double smallestRadianAngle;

        Scanner input = new Scanner(System.in);     //declare Scanner

        System.out.println("What is side A of triangle");       //asks the user for side A of triangle
        sideA = input.nextDouble();

        System.out.println("What is side b of triangle");       //asks the user for side B of triangle
        sideB = input.nextDouble();

        System.out.println("What is angle (radians) between the triangle");        //asks the user for angle between the triangle
        angleC = input.nextDouble();


        System.out.println( "Smallest Angle of the triangle in Degrees: "+ smallestAngle(sideA, sideB, angleC )* 180/Math.PI);      //call on the method and calculate in degrees the smallest angle
    }
}
