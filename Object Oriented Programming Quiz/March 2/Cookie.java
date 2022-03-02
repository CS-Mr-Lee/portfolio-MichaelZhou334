/**
 * Name: Michael Zhou
 * Date: March 2
 * Description: This is a Cookie Class that can be eaten by humans
 */

public class Cookie {

   /*
   Attributes
   */

    /** the name of the cookie */
    private String name;

    /** the weight of the cookie */
    private double weight;

    /** the calories of the cookie */
    private int calories;

    /** whether the cookie is packaged */
    private boolean isPackaged;

   /*
   Constructor
   */

    /**
     * Cookie
     * Default constructor for Cookie class
     */
    public Cookie() {

        //initializing the attributes
        this.name = "";
        this.weight = -1;
        this.calories = -1;
        this.isPackaged = false;

    }

    /**
     * Cookie
     * Creates a unpackaged cookie
     * @param name the name of the cookie
     * @param weight the weight of the cookie
     * @param calories the amount of calories in the cookie
     */
    public Cookie(String name, double weight, int calories){

        //initializing the attributes
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.isPackaged = false;

    }

    /**
     * Cookie
     * Creates a cookie
     * @param name the name of the cookie
     * @param weight the weight of the cookie
     * @param calories the amount of calories in the cookie
     * @param isPackaged whether the cookie is packaged or not
     */
    public Cookie(String name, double weight, int calories, boolean isPackaged){

        //initializing the attributes
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.isPackaged = isPackaged;


    }

   /*
   Methods
   */

    /*
    Accessors
    */

    /**
     * Gets the type of cookie
     * @return the cookie's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * gets the weight of cookie in grams
     * @return the cookie weight in grams
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * gets the calorie count of the cookie
     * @return the cookie calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * Gets whether the cookie is packaged
     * @return boolean whether the cookie is packaged
     */
    public boolean getIsPackaged() {
        return this.isPackaged;
    }

   /*
   Other Methods
   */

    /**
     * Takes in the weight(g) of the cookie eaten and calculates the calories eaten based on the percentage of
     * cookie eaten by weight; cannot be eaten if packaged or if the amount trying to be eaten
     * is more than there is of the cookie
     * @param weight weight of the cookie that is going to be eaten in grams
     * @return the calories that the cookie provided based on the weight of the cookie eaten; or a negative value(-1, -2)
     * signalling there is an exception
     */
    public int eaten(double weight) {

        double weightPercent;
        int caloriesItGives;

        if(isPackaged)  {
            return -2;
        }
        else    {
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

    }

    /**
     * Remove the packaging, if it has one sets isPackaged to false
     */
    public void open() {

        if (this.isPackaged) {
            this.isPackaged = false;
        }

    }

    /**
     * Returns all the attributes of the cookie in String type
     * @return all the attributes of the cookie as a String
     */
    public String toString() {

        String weightToString = Double.toString(this.weight);
        String caloriesToString = Double.toString(this.calories);
        String name = this.name;
        String isPackagedToString = String.valueOf(this.isPackaged);

        return "Name: " + name + "\n" + "Weight(g): " + weightToString + "\n" + "Calories: " + caloriesToString + "Is Packaged:" + isPackagedToString;

    }

}