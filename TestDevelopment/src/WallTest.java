import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WallTest {
    @Test
    public void testCreate() {
        Wall wall = new Wall(1, 2);

        assertEquals(1, wall.getX());
        assertEquals(2, wall.getY());
        assertEquals(false, wall.isEmpty());
        assertEquals("Wall at (1, 2)", wall.toString());
    }

    @Test
    public void testDestroyTheWall() {
        Wall wall = new Wall(1, 2);
        Cell cell = wall.destroy();

        assertEquals(1, cell.getX());
        assertEquals(2, cell.getY());
        assertEquals(true, cell.isEmpty());
    }
}
