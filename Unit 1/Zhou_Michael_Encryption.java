/**
 * Name: Michael Zhou
 * Date: Feb 14
 * Description: This program encrypts a line of code by exchanging the first and last character of each word
 * and shift the middle characters two in the ASCII table, with spaces unchanged
 */

import java.util.*;
public class Zhou_Michael_Encryption {
    public static void main(String[] args) {

        //declare variables
        String sentence;
        int amountOfWords;
        char tempFirstCharacter;
        char tempLastCharacter;
        String tempWord;

        Scanner input = new Scanner(System.in);       //declare Scanner

        System.out.println("Input words split up by a space");    //asks the user for their line of code, and stores as sentence
        sentence = input.nextLine();

        String [] words = sentence.split(" ");                    //split the sentence into an array of words that were seperated by a space 

        amountOfWords = words.length;                             //finds the length of the array

       for (int i = 0; i < amountOfWords; i++) {                  //for loop that runs through each array index
       
          if (words[i].length() > 2)   {                          //if statement to find word is more than 2
          
            tempWord = words[i];                                     //declare tempWord as the word
            
            tempFirstCharacter = (char) (tempWord.charAt(0));                       //find the first character in the word and store that
            tempLastCharacter = (char) (tempWord.charAt(tempWord.length()-1));      //find the last character in the word and store that
            System.out.print((char)(tempLastCharacter));                            //print out the last character, which will now start that the beginning of the new word
            
            
            for (int j = 1; j< tempWord.length()-1; j++) {                          //for loop that runs through each character in the word
            
               if (tempWord.charAt(j) > 124) {                                      //if the ASCII value is more than 124, then it can't go up 2 anymore so restart at the start of the characters in ASCII table
                  System.out.print((char)(tempWord.charAt(j)-(126+2)+35));          //print the new shifted character
               }
               else  {                                                              //else just shft the character 2 on ASCII table
                  System.out.print((char)(tempWord.charAt(j)+2));                   //print the new shifted character
               }
               
            
            }  
            System.out.print((char)(tempFirstCharacter));                           //pint the first character of the original word, which will now be at the end of the new word         
            System.out.print(" ");                                                  //space for next word
            
            
          } 
           else   {                                                                 //if the word is less than 2 characters don't do anything to it
            System.out.print(words[i]);
            System.out.print(" ");                                                  //space for next word
           }
       }
       

    }
}
