/**
 * Name: Michael Zhou
 * Date: March 2
 * Description: This is a Vegetable Class that can be eaten by humans
 */

public class Vegetable {

    /*
    Attributes
    */

    /** what the vegetable is called */
    private String name;

    /** the weight of the vegetable */
    private double weight;

    /** the calories count of the vegetable */
    private int calories;

    /*
    Constructor
    */

    /**
     * Vegetable
     * Default constructor for Vegetable class
     */
    public Vegetable()  {
        this.name = "";
        this.weight = -1;
        this.calories = -1;
    }

    /**
     * Vegetable
     * Creates a vegetable
     * @param name the name of the vegetable
     * @param weight the weight of the vegetable in grams
     * @param calories the amount of calories in the vegetable
     */
    public Vegetable(String name, double weight, int calories) {

        //initializing the attribute with the parameter
        this.name = name;

        //setting restrictions for weight attribute
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }

        //setting restrictions for calories attribute
        if (calories < 0) {
            this.calories = 0;
        } else  {
            this.calories = calories;
        }

    }

    /*
    Methods
    */

    /*
    Accessors
    */

    /**
     * Gets the name of the vegetable
     * @return the vegetable's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the calories count of the vegetable
     * @return the vegetable calories
     */
    public int getCalories() {
        return this.calories;
    }


    /**
     * Gets the weight of the vegetable in grams
     * @return the vegetable weight in grams
     */
    public double getWeight() {
        return this.weight;
    }

    /*
    Other Methods
    */

    /**
     * Takes in the weight(g) of the vegetable eaten and calculates the calories eaten based on the percentage of
     * vegetable eaten by weight; cannot be eaten if the amount trying to be eaten is more than there is of the vegetable
     * @param weight weight of the vegetable that is going to be eaten in grams
     * @return the calories that the vegetable provided based on percentage of the weight of the vegetable eaten; or a
     * negative value(-1) signalling there is an exception
     */
    public int eaten(double weight) {

        double weightPercent;
        int caloriesItGives;

            if (weight > this.weight)   {
                return -1;
            }
            else    {
                weightPercent = this.weight/weight;
                caloriesItGives = (int)(this.calories * weightPercent);
                this.weight = this.weight - weight;
                return caloriesItGives;

            }

        }

    /**
     * Returns all the attributes of the vegetable in String type
     * @return all the attributes of the vegetable as a String
     */
    public String toString() {

        String weightToString = Double.toString(this.weight);
        String name = this.name;
        String caloriesToString = Integer.toString(this.calories);

        return "Name: " + name + "\n" + "Weight(g): " + weightToString + "\n" + "Calories: " + caloriesToString;

    }

}
