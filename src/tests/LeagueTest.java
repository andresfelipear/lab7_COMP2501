import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeagueTest
{
    League l1;
    League l2;

    Team team1;
    Team team2;

    @BeforeEach
    void setUp()
    {
        l1 = new League("MLS", League.CATEGORY_PROFESSIONAL);
        l2 = new League("USL Championship", League.CATEGORY_SEMI);

        team1 = new Team("Vancouver Whitecaps F.C.");
        team2 = new Team("Toronto F.C.");
    }

    @AfterEach
    void tearDown()
    {
        l1 = null;
        l2 = null;

        team1 = null;
        team2 = null;
    }

    @Test
    void getName()
    {
        assertEquals("MLS", l1.getName());
        assertEquals("USL Championship", l2.getName());
    }

    @Test
    void addTeam()
    {
        l1.addTeam(team1);
        l2.addTeam(team2);

        assertEquals(1, l1.getTeams().size());
        assertEquals(1, l2.getTeams().size());
    }
}