import org.junit.*;
import static org.junit.Assert.*;

public class AdditionTest {

    @Test
	public void testAddition() {
		int a = 5;
        int b = 10;

        assertEquals("Should return 15", 15, Addition.sum(5, 10));
	}
}
