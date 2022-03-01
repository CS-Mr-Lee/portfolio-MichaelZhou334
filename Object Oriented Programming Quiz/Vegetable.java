public class Vegetable {

    /*
    Attributes
    */

    /** the color of the vegetable */
    private String color;

    /** whether the vegetable is green */
    private boolean isGreen;

    /** what the vegetable is called */
    private final String name;

    /** the calories count of the vegetable */
    private int calories;

    /** whether the vegetable is edible or not */
    private boolean isEdible;

    private double weight;


    /*
    Constructor
     */

    /**
     * Vegetable
     * Creates a basic vegetable
     * @param color the color of the vegetable
     * @param isGreen whether the vegetable is green
     * @param name the name of the vegetable
     * @param calories the calories of the vegetable
     * @param isEdible whether the vegetable is edible
     * @param weight the weight of the vegetable
     */
    public Vegetable(String color, boolean isGreen, String name, int calories, boolean isEdible, double weight) {

        //initializing the attribute with the parameter
        this.color = color;
        this.name = name;
        this.isGreen = isGreen;
        this.isEdible = isEdible;

        //setting restrictions for weight attribute
        if (weight < 0) {
            this.weight = 0;
        }else {
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

    //Accessors

    /**
     * Gets the color of the vegetable
     * @return the vegetable color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Gets whether the vegetable is green
     * @return boolean whether vegetable is green
     */
    public boolean getIsGreen() {
        return this.isGreen;
    }

    /**
     * Gets the vegetable name
     * @return the name of the vegetable
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
     * Gets whether the vegetable is edible
     * @return boolean whether the vegetable is edible
     */
    public boolean getIsEdible() {
        return this.isEdible;
    }

    /**
     * Gets the weight of the vegetable
     * @return the vegetable weight
     */
    public double getWeight() {
        return this.weight;
    }



    /*
    Mutators
     */

    /**
     * takes in the weight of the vegetable eaten and calculates the calories eaten based on the percentage of
     * vegetable eaten by weight; cannot be eaten if the amount eaten is more than there is of the cookie
     * @param weight weight of the vegetable eaten
     * @return the calories that the vegetable provided based on the weight of the vegetable eaten
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
                return caloriesItGives;

            }

        }


    /**
     Returns all the attributes of the vegetable in String type
     @return all the attributes of the vegetable as a String
     */
    public String toString() {
        String weightToString = Double.toString(this.weight);
        String name = this.name;
        String caloriesToString = Integer.toString(this.calories);

        return "Name: " + name + "\n" + "Weight: " + weightToString + "\n" + "Calories: " + caloriesToString;
    }
}
