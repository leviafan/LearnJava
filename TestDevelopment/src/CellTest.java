import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;

public class CellTest {
    @Test
    public void testCreate() {
        Cell cell = new Cell(1, 2);

        assertEquals(1, cell.getX());
        assertEquals(2, cell.getY());
        assertEquals(true, cell.isEmpty());
        assertEquals("empty Cell at (1, 2)", cell.toString());
    }

}
