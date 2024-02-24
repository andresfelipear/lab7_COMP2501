import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Team
 *
 * @author Andres Arevalo & Yeongsuk Oh
 * @version 1.0
 */
public class Team
{
    private final String name;
    private final List<Player> players;

    /**
     * Represents a soccer team with a specific name.
     * A team can have a list of players as its members.
     *
     * @param name The name of the team.
     * @throws IllegalArgumentException If the name is null or empty.
     */
    public Team(final String name)
    {
        if(name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Invalid team name");
        }

        this.name = name;
        players = new ArrayList<>();
    }

    /**
     * Gets the name of the team.
     *
     * @return The name of the team.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Transfers a player from the current team to another team.
     *
     * @param player    The player to transfer.
     * @param otherTeam The team to transfer the player to.
     */
    public void transferPlayer(Player player, Team otherTeam)
    {
        Iterator<Player> it = players.iterator();
        while(it.hasNext())
        {
            Player currentPlayer = it.next();
            if(currentPlayer.getFirstName().equalsIgnoreCase(player.getFirstName()) &&
                    currentPlayer.getLastName().equalsIgnoreCase(player.getLastName()))
            {
                it.remove();
            }
        }
        otherTeam.signNewPlayer(player);
    }

    /**
     * Signs a new player to the team.
     *
     * @param player The player to be signed to the team.
     */
    public void signNewPlayer(Player player)
    {
        players.add(player);
    }

    /**
     * Gets the list of players in the team.
     *
     * @return The list of players in the team.
     */
    public List<Player> getPlayers()
    {
        return players;
    }

}
