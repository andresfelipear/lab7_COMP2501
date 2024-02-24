import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest
{
    Team team1;
    Team team2;
    Player player1;
    Player player2;

    @BeforeEach
    void setUp()
    {
        team1 = new Team("F.C. Barcelona");
        team2 = new Team("Real Madrid");

        player1 = new Player("Falcao", "Garcia", 38, 72, "forward", 10,  "right");
        player2 = new Player("James", "Rodriguez", 32, 75, "midfielder", 10, "left");
    }

    @AfterEach
    void tearDown()
    {
        team1 = null;
        team2 = null;

        player1 = null;
        player2 = null;
    }

    @Test
    void testGetName()
    {
        assertEquals("F.C. Barcelona", team1.getName());
        assertEquals("Real Madrid", team2.getName());
    }

    @Test
    void testSignNewPlayer()
    {
        team1.signNewPlayer(player1);
        team2.signNewPlayer(player2);

        assertEquals(player1, team1.getPlayers().getLast());
        assertEquals(player2, team2.getPlayers().getLast());
    }

    @Test
    void testTransferPlayer()
    {
        team1.transferPlayer(player1, team2);
        assertEquals(player1, team2.getPlayers().getLast());
    }


}