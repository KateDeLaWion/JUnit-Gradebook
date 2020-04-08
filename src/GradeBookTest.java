import static org.junit.Assert.*;

        import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
        import org.junit.Test;

public class GradeBookTest {
    private GradeBook g1;

    @Before
    public void setUp() throws Exception {
        g1 = new GradeBook(5);

        g1.addScore(50);
        g1.addScore(75);
    }

    @After
    public void tearDown() throws Exception {
        g1 = null;
    }

    public void testSum() {
        assertEquals(125, g1.sum(), .0001);
    }

    public void testMinimum() {
        assertEquals(50, g1.minimum(), .001);
    }

    @Test
    public void addScoreTest(){
        Assert.assertEquals("50.0 75.0", g1.toString());
    }
}