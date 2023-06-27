package Challenge;

import org.junit.*;
import org.junit.Assert;


public class Tests {

    int gAeKuA;
    int gAeKoA;
    int uAeKuA;
    int uAeKoA;

    int gAeKuM;
    int gAeKoM;
    int uAeKuM;
    int uAeKoM;


    MitgliederVerwaltung mv;

    @Before
    public void setUP(){

        gAeKuA = 0;
        gAeKoA = 15;
        uAeKuA = -1;
        uAeKoA = 16;

        gAeKuM = 4;
        gAeKoM = 7;
        uAeKuM = 3;
        uAeKoM = 8;


        mv = new MitgliederVerwaltung();
    }

    @Test
    public void test_gAeKA_gleich0_gAeKM_gleich0()
    {
        Assert.assertFalse(mv.testBeitritt(gAeKuA,gAeKuM));
    }

    @Test
    public void test_gAeKA_gleich0_gAeKM_gleich10()
    {
        Assert.assertFalse(mv.testBeitritt(gAeKuA,gAeKoM));
    }

    @Test
    public void test_gAeKA_gleich0_gAeKM_unter0()
    {
        Assert.assertFalse(mv.testBeitritt(gAeKuA,uAeKuM));
    }
}
