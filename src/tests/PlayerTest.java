import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * PlayerTest of BCIT
 *
 * @author Andres Arevalo & Yeongsuk Oh
 * @version 1.0
 */
class PlayerTest
{

    private Player p1, p2;
    @BeforeEach
    void setUp()
    {
        p1 = new Player("Falcao", "Garcia", 38, 72, "forward", 10,  "right");
        p2 = new Player("James", "Rodriguez", 32, 75, "midfielder", 10, "left");
    }

    @AfterEach
    void tearDown()
    {
        p1 = null;
        p2 = null;
    }

    @Test
    void testShirtNumber()
    {
        assertEquals(0, p1.getShirtNumber());
        assertEquals(0, p2.getShirtNumber());

        p1.setShirtNumber(9);
        p2.setShirtNumber(10);

        assertEquals(9, p1.getShirtNumber());
        assertEquals(10, p2.getShirtNumber());
    }

    @Test
    void testScoreGoal()
    {
        assertEquals(0, p1.getGoals());
        assertEquals(0, p2.getGoals());

        p1.scoreGoal();
        p2.scoreGoal();
        p2.scoreGoal();

        assertEquals(1, p1.getGoals());
        assertEquals(2, p2.getGoals());
    }

    @Test
    void testAssistGoal()
    {
        assertEquals(0, p1.getAssists());
        assertEquals(0, p2.getAssists());

        p1.assistGoal();
        p1.assistGoal();
        p2.assistGoal();

        assertEquals(2, p1.getAssists());
        assertEquals(1, p2.getAssists());
    }
}