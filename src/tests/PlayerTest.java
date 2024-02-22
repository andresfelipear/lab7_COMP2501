import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * PlayerTest of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
class PlayerTest
{

    private Player p1, p2;
    @BeforeEach
    void setUp()
    {
        p1 = new Player("Falcao", "Garcia", 38, 72, "forward", 10,  "right");
        p1 = new Player("James", "Rodriguez", 32, 75, "midfielder", 10, "left");
    }

    @AfterEach
    void tearDown()
    {
        p1 = null;
        p2 = null;
    }
}