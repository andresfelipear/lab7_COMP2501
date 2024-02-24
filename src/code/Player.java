/**
 * Player of BCIT
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

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeightKg()
    {
        return weightKg;
    }

    public String getPosition()
    {
        return position;
    }

    public int getShirtNumber()
    {
        return shirtNumber;
    }

    public int getShoesSizeUs()
    {
        return shoesSizeUs;
    }

    public String getDominantFoot()
    {
        return dominantFoot;
    }

    public int getGoals()
    {
        return goals;
    }

    public int getAssists()
    {
        return assists;
    }

    public void setShirtNumber(final int shirtNumber)
    {
        this.shirtNumber = shirtNumber;
    }

    public void scoreGoal()
    {
        goals++;
    }

    public void assistGoal()
    {
        assists++;
    }
}
