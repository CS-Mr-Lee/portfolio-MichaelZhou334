/**
 * Name: Michael Zhou
 * Date: March 2
 * Description: This is a Human Class that can eat vegetables and cookies
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
    private int energyLevel;

    /*
    Constructor
    */

    /**
     * Human
     * Default constructor for Human class
     */
    public Human() {

        //variables
        this.name = "";
        this.weight = -1;
        this.energyLevel = -1;

    }

    /**
     * Human
     * Creates a human
     * @param name the name of human
     * @param weight the weight of human in kg
     * @param energyLevel the energy level of human
     */
    public Human(String name, double weight, int energyLevel)  {

        //variables
        this.name = name;
        this.weight = weight;
        this.energyLevel = energyLevel;

        //setting restrictions for weight attribute
        if (weight < 0)  {
            this.weight = 0;
        } else if(weight > 500)  {
            this.weight = 500;
        }

        //setting restrictions for energy level attribute
        if (energyLevel < 0)  {
            this.energyLevel = 0;
        } else if (energyLevel > 100)  {
            this.energyLevel = 100;
        }

    }

    /*
    Methods
    */

    /*
    Accessors
    */

    /**
     * Gets the name of the human
     * @return the person's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the weight of the person in kg
     * @return person's weight in kg
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Gets the energy level of human
     * @return the person's energy level
     */
    public double getEnergyLevel() {
        return this.energyLevel;
    }

    /*
    Other Methods
    */

    /**
     * Adds energy level to the human based on how many hours they slept; the total energy level cannot be more than 100%
     * @param hours the number of hours the human is going to sleep
     */
    public void sleep(int hours)  {

        this.energyLevel = (int) (energyLevel + hours * 10);

        if (this.energyLevel > 100)  {
            this.energyLevel = 100;
        }

    }

    /**
     * Subtracts energy level and weight(kg) from the human based on how many kilometers they ran; the total weight of the
     * human cannot be negative and the total energy level cannot be less than 0%
     * @param km the number of kilometers the human is going to run for
     */
    public void run (double km)  {

        this.weight = weight - km * 0.001;

        if (this.weight < 0)    {
            this.weight = 0;
        }

        this.energyLevel = (int) (energyLevel - km*3);

        if (this.energyLevel < 0)   {
            this.energyLevel = 0;
        }

    }

    /**
     * Human eats the vegetable, gains weight and energy;
     * if unsuccessful the person's attributes does not change and prints the reason why
     * @param veg attributes of the vegetable
     * @param grams how much vegetable is going to be eaten in grams
     */
    public void eat (Vegetable veg, double grams)  {

        double caloriesEatenVeg;
        double gramsToKg;

        gramsToKg = grams/1000;

        caloriesEatenVeg = veg.eaten(grams);

        if (caloriesEatenVeg == -1) {
            System.out.println("I don't have that much food");
        } else  {
            this.energyLevel = (int) (this.energyLevel + caloriesEatenVeg/15);
            this.weight = this.weight + gramsToKg;
        }

    }

    /**
     * Human eats the cookie, gains weight and energy;
     * if unsuccessful the person's attributes does not change and prints the reason why
     * @param food attributes of the cookie
     * @param grams how much of the cookie is going to be eaten in grams
     */
    public void eat (Cookie food, double grams)  {

        double caloriesEatenCookie;
        double gramsToKg;

        gramsToKg = grams/1000;

        caloriesEatenCookie = food.eaten(grams);

        if (caloriesEatenCookie == -2 ) {
            System.out.println("I can't eat the bag");
        } else if (caloriesEatenCookie == -1) {
            System.out.println("I don't have that much food");
        } else  {
            this.energyLevel = (int) (this.energyLevel + caloriesEatenCookie/15);
            this.weight = this.weight + gramsToKg;
        }

    }


    /**
     * Returns all the attributes of the human in String type
     * @return all the attributes of the human
     */
    public String toString() {

        String weightToString = Double.toString(this.weight);
        String energyLevelToString = Double.toString(this.energyLevel);
        String name = this.name;

        return "Name: " + name + "\n" + "Weight(kg): " + weightToString + "\n" + "Energy Level: " + energyLevelToString;

    }

}

