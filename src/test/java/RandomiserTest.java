import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class RandomiserTest {

    private Randomiser randomiser;
    private ArrayList<String> names;

    @Before
    public void setUp() throws Exception {
        names = new ArrayList<String>();
        names.add("J");
        names.add("Old Danny");
        names.add("Young Danny");
        randomiser = new Randomiser();
        randomiser.setNames(names);
        }

    @Test
    public void testHasNames() {
        assertEquals(3, randomiser.getNames().size());
    }

    @Test
    public void testRandomNameReturnsAName() {
        assertTrue(randomiser.pickRandomName() instanceof String);
        assertEquals(2, randomiser.getNames().size());
    }

    @Test
    public void testPicksPair() {
        assertEquals(2, randomiser.pickRandomPair().size());
        assertEquals(1, randomiser.getNames().size());
    }
}
