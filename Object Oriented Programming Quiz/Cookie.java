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

    /** whether the cookie is packaged or not*/
    private boolean isPackaged;


   /*
   Constructor
   */

    public Cookie(String name, double weight, int calories, boolean isPackaged){
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.isPackaged = isPackaged;


    }

   /*
   Methods
   */

    //Accessors

    /**
     Gets the type of animal
     @return the animal name
     */
    public String getName() {
        return this.name;
    }

    /**
     gets the weight of the meat in grams
     @return the meat weight in grams
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     gets whether the bone exists
     @return boolean whether there is a bone
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     Gets the fat content
     @return the fat content as a percentage
     */
    public boolean getIsPackaged() {
        return this.isPackaged;
    }

   /*
   Mutators
   */

    /**
     * takes in the weight of the cookie eaten and calculates the calories eaten based on the percentage of
     * cookie eaten by weight; cannot be eaten if packaged or if the amount eaten is more than there is of the cookie
     * @param weight weight of the cookie eaten
     * @return the calories that the cookie provided based on the weight of the cookie eaten
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
                return caloriesItGives;

            }

        }

    }


    /**
     Remove the packaging, if it has one
     Sets isPackaged to false
     */
    public void open() {
        if (this.isPackaged) {
            this.isPackaged = false;
        }
    }
}