import static org.junit.Assert.assertEquals;

public class SimpleFunctionsTest {

    @org.junit.Test
    public void percent() {
        SimpleFunctions sf = new SimpleFunctions();
        double answer  = sf.percent(100, 20);
        assertEquals(20, answer, 0.1);

    }

    @org.junit.Test
    public void square() {
    }
}
