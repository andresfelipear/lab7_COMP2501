/**
 * Player of BCIT
 *
 * @author Andres Arevalo, Yeongh Sun, Lida
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
}
