package Uebung;

import org.junit.Assert;
import org.junit.*;

public class TestKlasse{

    private Klasse klasse;

    @BeforeClass
    public static void beforeClassfunc() {


    }


    @Before
    public void beforefunc()

    {

       klasse = new Klasse();
    }

    @Test
    public void testKlasseExist(){
       Assume.assumeNotNull(klasse);
    }
    @Ignore("Test ignoriert")
    @Test
    public void test_isOlliGay_isGay(){

        String name = "Olli";
        boolean ergebnis = klasse.isOlliGay(name);
        Assert.assertFalse(ergebnis);

    }

    @Test(timeout = 2000)
    public void testInfinityOlliIsGay(){
        Assume.assumeNotNull(null);
        String name = "Olli";
        while (true){
            klasse.isOlliGay(name);
        }
    }
    @Test
    public void test_isOlliGay_isnotGay(){

        String name = "Dieter";
        boolean ergebnis = klasse.isOlliGay(name);
        Assert.assertFalse(ergebnis);

    }

    @Test(expected = NullPointerException.class)
    public void test_isOlliGay_isNull(){

        String name = null;
        boolean ergebnis = klasse.isOlliGay(name);
    }

    @Test
    public void test_isOlliGay_isNull_2(){

        Klasse klasse = new Klasse();

        String name = null;
        boolean ergebnis;

        try {
            ergebnis = klasse.isOlliGay(name);
            Assert.fail("Durfte nicht gehen, methode überarbeiten");
        } catch (NullPointerException n) {
            Assert.assertNotNull(n.getMessage());
        }
    }

    @After
    public void afterfunc()
    {
        klasse = null;
    }

    @AfterClass
    public static void afterClassfunc()
    {

    }

}




