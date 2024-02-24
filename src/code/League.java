import java.util.ArrayList;
import java.util.List;

/**
 * League
 *
 * @author user
 * @version 1.0
 */
public class League
{
    private final String name;
    private final String category;
    private final List<Team> teams;

    final static String CATEGORY_PROFESSIONAL = "PROFESSIONAL";
    final static String CATEGORY_SEMI = "SEMI";
    final static String CATEGORY_AMATEUR = "AMATEUR";

    /**
     * Represents a soccer league with a specific name and category.
     * A league contains a list of teams participating in it.
     *
     * @param name     The name of the league.
     * @param category The category of the league, which should be one of: "professional", "semi", or "amateur".
     * @throws IllegalArgumentException If the name is null or empty, or if the category is not one of the specified values.
     * @throws NullPointerException     If the category is null.
     */
    public League(final String name, final String category)
    {
        if(name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Invalid name");
        }

        if(category == null)
        {
            throw new NullPointerException("Category can't be null");
        }

        if(!category.equalsIgnoreCase(CATEGORY_PROFESSIONAL) &&
                !category.equalsIgnoreCase(CATEGORY_SEMI) && !category.equalsIgnoreCase(CATEGORY_AMATEUR))
        {
            throw new IllegalArgumentException("Invalid category. It should be professional, semi, or amateur.");
        }

        this.name = name;
        this.category = category;
        teams = new ArrayList<>();
    }

    /**
     * Gets the name of the league.
     *
     * @return The name of the league.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the category of the league.
     *
     * @return The category of the league.
     */
    public String getCategory()
    {
        return category;
    }

    /**
     * Gets the list of teams participating in the league.
     *
     * @return The list of teams in the league.
     */
    public List<Team> getTeams()
    {
        return teams;
    }

    /**
     * Adds a team to the league.
     *
     * @param team The team to be added to the league.
     */
    public void addTeam(Team team)
    {
        teams.add(team);
    }

}
