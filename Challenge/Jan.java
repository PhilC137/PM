package Challenge;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Jan {
    public int s1;
    public int s2;
    public boolean result;
    MitgliederVerwaltung mv;

    public Jan(int a, int b, boolean result) {
        s1 = a;
        s2 = b;
        this.result = result;
    }

    @Before
    public void setUp() {
        mv = new MitgliederVerwaltung();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> values() {
        return Arrays.asList(new Object[][]{{16, 4, true}, {99, 7, true}, {0, 5, false}, {100, 5, false}, {17, 0, false}, {17, 8, false}, {17, -1, false}, {-1, 5, false}});
    }

    @Test()
    public void testMitgliederVerwaltung(){
        try {
            Assert.assertEquals(mv.testBeitritt(s1, s2), result);
        } catch (IllegalArgumentException aex) {
            Assert.assertNotNull(aex.getMessage());
        }
    }
}