/**
 * Name:Michael Zhou
 * Date: Feb 15
 * Description: This program reads the champions.json file and writes in MaxChampStats.txt file 
 * the name and hp of the champ with the highest hp + the name and armor of the champ with the lowest armor
 */

import java.io.*;
import java.util.*;

public class Zhou_Michael_ChampionFilter {

    public static void main(String[] args) {

        //Declare variables (temp means temporary)
        String fileReadingName = "champions.json";
        String fileWritingName = "MaxChampStats.txt";
        String lineIn;
        String maxHpName = "";
        String minArmorName = "";
        String tempName = "";
        double tempHpValue;
        double tempArmorValue;
        double maxHpValue = 0;
        double minArmorValue = 1000000;


        try {               //try-catch block in case file doesn't exist or cannot read/write the file data


            BufferedReader in = new BufferedReader(new FileReader(fileReadingName));        //declare BufferedReader to read the champions.json file
            lineIn = in.readLine();

            //while loop that reads the file until it gets to the end
            while (lineIn != null) {
                lineIn = lineIn.replaceAll("\\s", "");      //finds all the spaces and empty space and replaces it with nothing, so the String.split can work properly
                lineIn = lineIn.replaceAll(",", "");        //finds all the commas and replaces them with nothing, so the String.split can work properly

                String[] words = lineIn.split(":");                   //splits file into an array of words split by :

                for (int i = 0; i < words.length; i++) {                    //for loop that runs through all the words in the array

                    if (words[i].equals("\"name\"")) {                      //if the array has the word "name" in it, then the next word is the champion name, so store that

                        tempName = words[i + 1];                            //stores the name of the champion as tempName
                    }


                    if (words[i].equals("\"hp\"")) {                        //if the array has the word "hp" in it, then the next words is the temp champion's hp, so store that

                        tempHpValue = Double.parseDouble(words[i + 1]);     //store the temp champion's hp

                        if (tempHpValue > maxHpValue) {                     //if the temp champion's hp is larger than the maxHpValue so far recorded, then replace the hp values and names with the temp
                            maxHpValue = tempHpValue;
                            maxHpName = tempName;
                        }
                    }


                    if (words[i].equals("\"armor\"")) {                     //if the array has the word "armor" in it, then the next words is the temp champion's armor, so store that

                        tempArmorValue = Double.parseDouble(words[i + 1]);  //stores the temp champion's armor

                        if (tempArmorValue < minArmorValue) {               //if the temp champion's armor is larger than the maxArmorValue so far recorded, then replace the armor values and name with the temp
                            minArmorValue = tempArmorValue;
                            minArmorName = tempName;
                        }
                    }


                }
                lineIn = in.readLine();                                     //reads the next line in file
            }
            in.close();                                                     //closes the file

            BufferedWriter out = new BufferedWriter(new FileWriter(fileWritingName, false));                        //declare BufferedWriter to write MaxChampStats.txt


            out.write("The champion with the highest hp is " + maxHpName + " with " + maxHpValue + " health");          //write the champion's name with the highest hp value
            out.newLine();
            out.write("The champion with the lowest armor is " + minArmorName + " with " + minArmorValue + " armor");   //write the champion's name with the lowest armor value


            out.close();            //closes the file


        } catch (FileNotFoundException e) {           //catch if the file is not found
            e.printStackTrace();
        } catch (IOException e) {                     //catch if there is bad data in the file
            e.printStackTrace();


        }

    }
}
