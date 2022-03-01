/**
 Human.java
 ---------------------------------------
 Programmer: Kevin Yao, Michael Zhou
 Date:  February 27th, 2022
 Course:  ICS4U1
 ---------------------------------------
 This Class creates the attributes with the constructor and contains all the methods to call attributes of an object and
 mutate all attributes of a Human object
 */

public class Human {

    /*
    Attributes
    */

    /** the name of the human */
    private String name;

    /** the weight of the human */
    private double weight;

    /** the energy level the human has */
    private double energyLevel;

    /** the biological gender of the human*/
    private String sex;

    /** the age of the human */
    private int age;

    /** the race of the human */
    private String race;

    /*
    Constructor
    */

    /**
     Human
     Creates a human
     @param name the name of human
     @param weight the weight of human
     @param energyLevel the energy level of human
     @param sex the sex of human
     @param age the age of human
     @param race the race of human
     */
    public Human(String name, double weight, double energyLevel, String sex, int age, String race)  {
        //variables
        this.name = name;
        this.weight = weight;
        this.energyLevel = energyLevel;
        this.sex = sex;
        this.age = age;
        this.race = race;

        //setting restrictions for weight attribute
        if (weight < 0)  {
            this.weight = 0;
        }
        else if(weight > 500)  {
            weight = 500;
        }

        //setting restrictions for energy level attribute
        if (energyLevel < 0)  {
            this.energyLevel = 0;
        }
        if (energyLevel > 100)  {
            this.energyLevel = 100;
        }

        //setting restrictions for age attribute
        if (age < 0)  {
            this.age = 0;
        }


    }

  /*
  Methods
  */

  /*
  Accessors
  */

    /**
     Gets the name of the human
     @return the person's name
     */
    public String getName() {
        return this.name;
    }

    /**
     Gets the weight of the person
     @return the weight of the person
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     Gets the energy level of human
     @return the person's energy level
     */
    public double getEnergyLevel() {
        return this.energyLevel;
    }

    /**
     Gets the sex of human
     @return the person's sex
     */
    public String getSex() {
        return this.sex;
    }

    /**
     Gets the age of human
     @return the age of the human
     */
    public int getAge() {
        return this.age;
    }

    /**
     Gets the race of the human
     @return the human's race
     */
    public String getRace() {
        return this.race;
    }

  /*
  Mutators
  */

    /**
     Changes the name of the human
     @param newName expected new name
     */
    public void setName (String newName) {
        this.name = newName;
    }

    /**
     Changes the weight of the human
     @param newWeight expected new weight
     */
    public void setWeight(double newWeight) {

        if (newWeight < 0)  { //restriction from negative weight
            this.weight = 0;
        } else if (newWeight == 0) { //specifically for 0
            this.weight = 0;
        } else if (newWeight > 500) {
            this.weight = 500;
        } else { //all other cases
            this.weight = newWeight;
        }
    }
    /**
     Changes the energyLevel of the human
     @param newEnergyLevel expected new energy level
     */
    public void setEnergyLevel (double newEnergyLevel) {

        if (newEnergyLevel < 0)  { //restriction from negative energy
            this.energyLevel = 0;
        } else if (newEnergyLevel == 0) { //specifically for 0
            this.energyLevel = 0;
        } else if (newEnergyLevel > 100) {
            this.energyLevel = 100;
        } else { //all other cases
            this.energyLevel = newEnergyLevel;
        }
    }

    /**
     Changes the sex of the human
     @param newSex expected new sex
     */
    public void setSex (String newSex) {
        this.sex = newSex;
    }

    /**
     Changes the age of the human; age cannot be negative
     @param newAge expected new age
     */
    public void setAge (int newAge) {
        if (newAge < 0)  { //restriction from negative energy
            this.age = 0;
        } else if (newAge == 0) { //specifically for 0
            this.age = 0;
        } else { //all other cases
            this.age = newAge;
        }
    }

    /**
     Changes the race of the human
     @param newRace expected new race
     */
    public void setRace (String newRace) {
        this.race = newRace;
    }

  /*
  Other Methods
  */

    /**
     Adds energy level to the human based on how many hours they slept; the total energy level cannot be more than 100%
     @param hours the number of hours the human is going to sleep
     */
    public void sleep(int hours)  {
        this.energyLevel = energyLevel + hours * 0.1;
        if (this.energyLevel > 100)  {
            this.energyLevel = 100;
        }
    }

    /**
     Subtracts energy level and weight from the human based on how many kilometers they ran; the total weight of the human cannot be negative and the total energy level cannot be less than 0%
     @param km the number of kilometers the human is going to run for
     */
    public void run (double km)  {
        this.weight = weight - km*0.001;
        if (this.weight < 0){
            this.weight = 0;
        }
        this.energyLevel = energyLevel - km*0.03;
        if (this.energyLevel < 0)  {
            this.energyLevel = 0;
        }

    }

    public void eat (Cookie food, double grams)  {

        double caloriesEaten;

        caloriesEaten = food.eaten(grams);

        if (caloriesEaten == -2 ) {         //packaged
            System.out.println("I can't eat the bag");
        } else if (caloriesEaten == -1) {       //too much weight
            System.out.println("I don't have that much food");
        } else  {
            this.energyLevel = this.energyLevel + caloriesEaten/15;
        }



    }


    /**
     Returns all the attributes of the human in String type
     @return all the attributes of the human
     */
    public String toString() {
        String weightToString = Double.toString(this.weight);
        String energyLevelToString = Double.toString(this.energyLevel);
        String ageToString = Integer.toString(age);

        return "Name: " + name + "\n" + "Weight: " + weightToString + "\n" + "Energy Level: " + energyLevelToString + "\n" + "Sex: " + sex + "\n" + "Age:" + ageToString + "\n" + "Race: " + race;
    }

}

