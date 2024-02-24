/**
 * Players of BCIT
 *
 * @author Andres Arevalo & Yeongsuk Oh
 * @version 1.0
 */
public class Player
{
    private final String firstName;
    private final String lastName;
    private final int age;
    private final double weightKg;
    private final String position;
    private int shirtNumber;
    private final int shoesSizeUs;
    private final String dominantFoot;

    public int goals;
    public int assists;


    /**
     * Constructs a Player object with the specified personal details.
     *
     * @param firstName    The first name of the player.
     * @param lastName     The last name of the player.
     * @param age          The age of the player.
     * @param weightKg     The weight of the player in kilograms.
     * @param position     The playing position of the player.
     * @param shoesSizeUs  The shoe size of the player in US units.
     * @param dominantFoot The dominant foot (e.g., "left" or "right") of the player.
     */
    public Player(final String firstName,
            final String lastName,
            final int age,
            final double weightKg,
            final String position,
            final int shoesSizeUs,
            final String dominantFoot)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weightKg = weightKg;
        this.position = position;
        this.shoesSizeUs = shoesSizeUs;
        this.dominantFoot = dominantFoot;
    }

    /**
     * Gets the first name of the player.
     *
     * @return The first name of the player.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Gets the last name of the player.
     *
     * @return The last name of the player.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Gets the age of the player.
     *
     * @return The age of the player.
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Gets the weight of the player in kilograms.
     *
     * @return The weight of the player in kilograms.
     */
    public double getWeightKg()
    {
        return weightKg;
    }

    /**
     * Gets the playing position of the player.
     *
     * @return The playing position of the player.
     */
    public String getPosition()
    {
        return position;
    }

    /**
     * Gets the shirt number assigned to the player.
     *
     * @return The shirt number of the player.
     */
    public int getShirtNumber()
    {
        return shirtNumber;
    }

    /**
     * Gets the shoe size of the player in US units.
     *
     * @return The shoe size of the player in US units.
     */
    public int getShoesSizeUs()
    {
        return shoesSizeUs;
    }

    /**
     * Gets the dominant foot of the player.
     *
     * @return The dominant foot of the player.
     */
    public String getDominantFoot()
    {
        return dominantFoot;
    }

    /**
     * Gets the total number of goals scored by the player.
     *
     * @return The total number of goals scored by the player.
     */
    public int getGoals()
    {
        return goals;
    }

    /**
     * Gets the total number of assists made by the player.
     *
     * @return The total number of assists made by the player.
     */
    public int getAssists()
    {
        return assists;
    }

    /**
     * Sets the shirt number for the player.
     *
     * @param shirtNumber The new shirt number to set.
     */
    public void setShirtNumber(final int shirtNumber)
    {
        this.shirtNumber = shirtNumber;
    }

    /**
     * Increments the goal count for the player.
     */
    public void scoreGoal()
    {
        goals++;
    }

    /**
     * Increments the assist count for the player.
     */
    public void assistGoal()
    {
        assists++;
    }

}
